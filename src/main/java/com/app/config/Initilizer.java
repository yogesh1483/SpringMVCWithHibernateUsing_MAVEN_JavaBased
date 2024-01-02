package com.app.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initilizer implements WebApplicationInitializer{

	public void onStartup(ServletContext context) throws ServletException {
		
		AnnotationConfigWebApplicationContext appContext =new AnnotationConfigWebApplicationContext();
	   appContext.register(AppConfig.class);
	   
		ServletRegistration.Dynamic dispatcher =context.addServlet("DispatcherServlet", new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}

}
