package com.first.ourtry;

import javax.servlet.ServletRegistration;
import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OurtryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurtryApplication.class, args);
	}
	@Bean
	public ServletRegistrationBean  h2servletRegistration(){
		ServletRegistrationBean registration=new ServletRegistrationBean(new WebServlet());
		registration.addUrlMappings("/rose/*");
			return registration;


		

	}
}
