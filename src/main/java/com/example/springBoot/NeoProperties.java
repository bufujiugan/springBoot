package com.example.springBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置文件测试类
 * @author 于志强
 *
 * 2018年11月13日 下午2:39:24
 */
@Component
public class NeoProperties {
	@Value("${com.example.springBoot.title}")
	private String title;
	@Value("${com.example.springBoot.description}")
	private String description;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
