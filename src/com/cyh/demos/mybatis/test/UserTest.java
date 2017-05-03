package com.cyh.demos.mybatis.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cyh.demos.mybatis.mapper.UserMapper;
import com.cyh.demos.mybatis.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@Configuration("/config/spring-common.xml")
public class UserTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testAdd(){
		User user = new User(-1, "23", "jiuqiyuliang");
		userMapper.save(user);
		
	}
	
	@Test
	public void testFindAll(){
		List<User> findAllList = userMapper.findAll();
		System.out.println(findAllList.size());
	}
	
	@Test
	public void testFindById(){
		User user = userMapper.findById(2);
		System.out.println(user.getId());
		System.out.println(user.getUserName());
	}


	@Test
	public void testUpdate(){
		
		User user = new User(2, "23", "yuliang");
		userMapper.update(user);
	}
	
	@Test
	public void testDelete(){
		userMapper.delete(1);
	}
}
