import { Component } from '@angular/core';
import {AppService, Foo} from './app.service'

@Component({
  selector: 'foo-details',
  providers: [AppService],  
  template: `<div class="container">
    <h1 class="col-sm-12">Foo Details</h1>
    <div class="col-sm-12">
        <label class="col-sm-3">ID</label> <span>{{foo.userId}}</span>
    </div>
    <div class="col-sm-12">
        <label class="col-sm-3">First Name</label> <span>{{foo.firstName}}</span>
    </div>
    <div class="col-sm-12">
        <label class="col-sm-3">Last Name</label> <span>{{foo.lastName}}</span>
    </div>
    <div class="col-sm-12">
        <label class="col-sm-3">Sex</label> <span>{{foo.sex}}</span>
    </div>
    <div class="col-sm-12">
        <label class="col-sm-3">Dept</label> <span>{{foo.dept}}</span>
    </div>
    <div class="col-sm-12">
        <label class="col-sm-3">Designation</label> <span>{{foo.jobTitleName}}</span>
    </div>
    <div class="col-sm-12">
        <label class="col-sm-3">Organization</label> <span>{{foo.company}}</span>
    </div>
   <div class="col-sm-12">
        <button class="btn btn-primary" (click)="getFoo()" type="submit">New Foo</button>        
    </div>
</div>`
})

export class FooComponent {
    public foo = new Foo('12','Microsoft','software','dummy','female','dummy','abc');
    private foosUrl = 'http://localhost:8081/api/v2/employee';  

    constructor(private _service:AppService) {}
    resData;
    newsdata;
    getFoo(){
        this._service.getResource(this.foosUrl)//+this.foo.id)
        
         .subscribe( res=> {
             
            this.resData = res;
        
            
          this.resData.forEach((value: string, key: string) => {
            
           // console.log(key, value);
           //   console.log(this.resData[key]); 
           
           if(key=="company")
           this.foo.company = this.resData[key];
           if(key=="fistName")
           this.foo.jobTitleName = this.resData[key];
           if(key=="dept")
           this.foo.dept = this.resData[key];
           if(key=="sex")
           this.foo.sex = this.resData[key];
           if(key=="firstName")
           this.foo.firstName =this.resData[key];
           if(key=="lastName")
           this.foo.lastName = this.resData[key];
           if(key=="employeeId")
           this.foo.userId = this.resData[key];
             
            });
            this.foo=this.resData[0];
            console.log(this.foo);
            
         });
                    // data => this.foo = data,
                    // error =>  this.foo.firstName = 'Error');
                     
    }
}
