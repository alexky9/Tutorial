package com.alejandro.tutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@EnableWebMvc
@Configuration
@ComponentScan("com.alejandro.tutorial")
public class WebAppConfig extends WebMvcConfigurerAdapter{
 
}