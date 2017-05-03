package com.cyh.demos.mybatis.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/spring-common.xml");
		Object userMapper = ctx.getBean("dataSource");
		System.out.println(userMapper);
	}

}
