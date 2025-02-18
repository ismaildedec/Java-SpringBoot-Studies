package com.ihsandedec.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ihsandedec.model.User;
import com.ihsandedec.services.UserService;

@Configuration
public class AppConfig {
	
	@Bean
	public UserService userService() {
		
		UserService userService = new UserService();
		List<User> userList = new ArrayList<>();
		userList.add(new User("İhsan"));
		userList.add(new User("İsmail"));
		
		userService.setUserList(userList);
		
		return userService;
	}

}
