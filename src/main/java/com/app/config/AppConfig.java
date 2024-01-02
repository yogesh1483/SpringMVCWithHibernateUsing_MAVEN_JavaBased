package com.app.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.app.model.Student;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.app")
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
	}
	
	@Bean
	public DriverManagerDataSource dm()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/Maven_Hibernate");
		dmds.setUsername("root");
		dmds.setPassword("root");
		
		return dmds;	
	}
	
	@Bean
	public LocalSessionFactoryBean sfBean()
	{
		LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
		lsfb.setDataSource(dm());
		
		Properties pro =new Properties();
		pro.setProperty("hibernate-dilect", "org.hibernate.dialect.MySQL55Dialect");
		pro.setProperty("hibernate.hbm2ddl.auto", "update");
		
		lsfb.setHibernateProperties(pro);
		
		lsfb.setAnnotatedClasses(Student.class);
		return lsfb;
	}
	
	
}
