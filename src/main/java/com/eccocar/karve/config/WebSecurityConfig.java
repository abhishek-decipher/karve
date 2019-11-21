package com.eccocar.karve.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(10)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("user").password("pass").authorities("ROLE_USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests().antMatchers("/**").permitAll();
		
//		final BasicAuthenticationEntryPoint basicAuthenticationEntryPoint = new BasicAuthenticationEntryPoint();
//		basicAuthenticationEntryPoint.setRealmName("oauth2-resource");
//		final BasicAuthenticationFilter basicAuthenticationFilter = new BasicAuthenticationFilter(authenticationManagerBean(), basicAuthenticationEntryPoint);
//		
//		http
//			.authorizeRequests()
//			.anyRequest().authenticated()
//			.and()
//			.httpBasic()
//			.authenticationEntryPoint(basicAuthenticationEntryPoint);
//
//		http.addFilterAfter(basicAuthenticationFilter, BasicAuthenticationFilter.class);
	}
}