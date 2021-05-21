import {Injectable} from '@angular/core';
import { Cookie } from 'ng2-cookies';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
 
export class Foo {
  constructor(
    public userId: string,
    public company: String ,
    public jobTitleName: String ,
    public dept: String ,
    public sex: String ,
    public firstName: String ,
    public lastName: String 
     ) { }
} 

@Injectable()
export class AppService {
   public clientId = 'newClient';
   public redirectUri = 'http://localhost:4200/';

  constructor(
    private _http: HttpClient){}

  retrieveToken(code){
    let params = new URLSearchParams();   
    params.append('grant_type','authorization_code');
    params.append('client_id', this.clientId);
    params.append('client_secret', 'newClientSecret');
    params.append('redirect_uri', this.redirectUri);
    params.append('code',code);

    let headers = new HttpHeaders({'Content-type': 'application/x-www-form-urlencoded; charset=utf-8'});
    headers.append('Accept', 'application/json');

    headers.append('Access-Control-Allow-Origin', '*');
    headers.append('Access-Control-Allow-Credentials', 'true');
  
    headers.append('GET', 'OPTIONS');
     this._http.post('http://localhost:8083/auth/realms/baeldung/protocol/openid-connect/token', params.toString(), { headers: headers })
    .subscribe(
      data => this.saveToken(data),
      err => alert('Invalid Credentials')
    ); 
  }

  saveToken(token){
    var expireDate = new Date().getTime() + (1000 * token.expires_in);
    Cookie.set("access_token", token.access_token, expireDate);
    Cookie.set("id_token", token.id_token, expireDate);
    console.log('Obtained Access token');
    window.location.href = 'http://localhost:4200';
  }

  getResource(resourceUrl) : Observable<any>{
    console.log("resource url is: " + resourceUrl );
    var auth='Bearer '+ Cookie.get('access_token');
    console.log("auth header is: " + auth );
    let headers = new HttpHeaders({'Content-type': 'application/json'
    , 'Authorization': auth
    ,'Accept': 'application/json'
    ,'Access-Control-Allow-Origin': '*'
    ,'Access-Control-Allow-Credentials': 'true'
    });
    
   
    return this._http.get(resourceUrl, { headers: headers })
                   .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  checkCredentials(){
    return Cookie.check('access_token');
  } 

  logout() {
    let token = Cookie.get('id_token');
    Cookie.delete('access_token');
    Cookie.delete('id_token');
    let logoutURL = "http://localhost:8083/auth/realms/baeldung/protocol/openid-connect/logout?id_token_hint="
      + token
      + "&post_logout_redirect_uri=" + this.redirectUri;

    window.location.href = logoutURL;
  } 
}