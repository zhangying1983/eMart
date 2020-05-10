package com.ibm.trainning.emart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().
		httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/h", "/h/**")
		.permitAll()
		.antMatchers(HttpMethod.POST, "/api/user")
		.permitAll()
		.anyRequest().authenticated();
	}
	
	@Bean
	public PasswordEncoder getEncoder() {
		return new PasswordEncoder() {

			@Override
			public String encode(CharSequence rawPassword) {
				// TODO Auto-generated method stub
				return rawPassword.toString();
			}

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				// TODO Auto-generated method stub
				return rawPassword.toString().equals(encodedPassword);
			}
		};
	}

}
