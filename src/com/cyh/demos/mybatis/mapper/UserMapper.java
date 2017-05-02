package com.cyh.demos.mybatis.mapper;

import java.util.List;

import com.cyh.demos.mybatis.model.User;

public interface UserMapper{
	void save(User user);
	boolean update(User user);
	boolean delete(int id);
	User findById(int id);
	List<User> findAll();
}
