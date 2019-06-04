package com.cafe24.jblog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.cafe24.config.web.FileuploadConfig;
import com.cafe24.config.web.MVCConfig;
import com.cafe24.config.web.MessageConfig;
import com.cafe24.config.web.SecurityConfig;

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.cafe24.jblog.controller, com.cafe24.jblog.cotroller.api, com.cafe24.jblog.exception"})
@Import({MVCConfig.class, SecurityConfig.class, MessageConfig.class})//FileuploadConfig.class
public class WebConfig {
	
	
}