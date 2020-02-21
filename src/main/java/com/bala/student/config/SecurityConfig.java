package com.bala.student.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bala.student.filter.LoginFilter;
import com.bala.student.filter.SessionFilter;

@Configuration
public class SecurityConfig {

	@Bean
	public FilterRegistrationBean<LoginFilter> loginFilterRegistrationBean() {
		FilterRegistrationBean<LoginFilter> registrationBean = new FilterRegistrationBean<>();
		LoginFilter customURLFilter = new LoginFilter();
		registrationBean.setFilter(customURLFilter);
		registrationBean.addUrlPatterns("/", "/login", "/loginValidation");
		registrationBean.setOrder(2); // set precedence
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean<SessionFilter> sessionFilterRegistrationBean() {
		FilterRegistrationBean<SessionFilter> registrationBean = new FilterRegistrationBean<>();
		SessionFilter customURLFilter = new SessionFilter();
		registrationBean.setFilter(customURLFilter);
		registrationBean.addUrlPatterns("/student-save", "/student-admin-profile", "/student-profile");
		registrationBean.setOrder(2); // set precedence
		return registrationBean;
	}

}
