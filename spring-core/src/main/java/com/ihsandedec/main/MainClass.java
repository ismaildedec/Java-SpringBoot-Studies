package com.ihsandedec.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ihsandedec.config.AppConfig;
import com.ihsandedec.model.User;
import com.ihsandedec.services.UserService;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context	=  new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		
		for (User user : userService.getUserList()) {
			System.out.println(user);
		}
	}

}
