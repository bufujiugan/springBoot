package com.example.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBoot.NeoProperties;

/**
 * hello springBoot
 * @author 于志强
 *
 * 2018年11月13日 下午2:45:35
 */
@RestController
public class HelloWorldController {
	@Autowired
	private NeoProperties neoProperties;
	
	@RequestMapping("/hello")
	public String index() {
		System.out.println(neoProperties.getTitle()); // 读取配置文件  方式一  DataSourceConfig.java中有方式二
		return "Hello World";
	}

//	@RequestMapping("/getUser")
//	public User getUser() {
//		System.out.println(neoProperties.getTitle()); // 读取配置文件  方式一  DataSourceConfig.java中有方式二
//		User user = new User();
//		user.setUserName("小明");
//		return user;
//	}
}
