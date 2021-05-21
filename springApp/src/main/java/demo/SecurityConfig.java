package demo;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.OncePerRequestFilter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println(
				"################### #####################################################################################authenticate for angular user");
		
		//  http.addFilterBefore( new MyFilter(), OncePerRequestFilter.class);
		http.cors()
		
		  .and() .authorizeRequests() .antMatchers(HttpMethod.GET, "api/v2/employee",
		  "api/v2/**") .hasAuthority("SCOPE_read") .antMatchers(HttpMethod.POST,
		  "api/v2/employee") .hasAuthority("SCOPE_write") .anyRequest() .authenticated()
		 
  .and()
		 .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
		 ;

	}

	/*
	 * @Bean public CorsConfigurationSource corsConfigurationSource() {
	 * System.out.println(
	 * "##################*****************************************************####################################################################3"
	 * ); CorsConfiguration configuration = new CorsConfiguration();
	 * configuration.setAllowedOrigins(Arrays.asList("*"));
	 * configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH",
	 * "DELETE", "OPTIONS")); configuration.setAllowCredentials(true);
	 * configuration.setAllowedHeaders(Arrays.asList("authorization",
	 * "content-type", "x-auth-token"));
	 * configuration.setExposedHeaders(Arrays.asList("x-auth-token"));
	 * UrlBasedCorsConfigurationSource source = new
	 * UrlBasedCorsConfigurationSource(); source.registerCorsConfiguration("/**",
	 * configuration); return source; }
	 */

	@Bean
	FilterRegistrationBean myFilterRegistration() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setOrder(1);
		filterRegistrationBean.setFilter(new MyFilter());
		filterRegistrationBean.setUrlPatterns(Arrays.asList("/*")); // optional...to add URL pattern if required
		return filterRegistrationBean;

	}
}