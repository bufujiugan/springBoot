package com.example.springBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动
 * @author 于志强
 *
 * 2018年11月13日 下午2:50:00
 */
@SpringBootApplication
@MapperScan("com.example.springBoot.domain.*") // 扫描Mapper.xml
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
