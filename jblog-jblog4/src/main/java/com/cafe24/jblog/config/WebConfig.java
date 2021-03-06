package com.cafe24.jblog.config;

import com.cafe24.config.web.SecurityConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cafe24.config.web.FileuploadConfig;
import com.cafe24.config.web.MVCConfig;
import com.cafe24.config.web.MessageConfig;

@Configuration
@EnableWebMvc//mvc 붙어있는애들 한번에 
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.jblog.controller"}) //이건 자동 설정
@Import({MVCConfig.class, SecurityConfig.class,MessageConfig.class,FileuploadConfig.class}) //여기에 추가 ,FileuploadConfig.class 이건 왜 안됨;;;;
public class WebConfig {
	
	@Bean 
	public ViewResolver viewResolver() { //이건 명시적
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
}
