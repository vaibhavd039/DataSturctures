package com.vaibhav;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.vaibhav"})
public class VaibhavConfig {
	@Bean
 public InternalResourceViewResolver viewresolver()
 {
	 InternalResourceViewResolver vr= new InternalResourceViewResolver();
	 vr.setPrefix("/WEB-INF/");
	 vr.setSuffix(".jsp");
	 return vr;
	 
 }
}
