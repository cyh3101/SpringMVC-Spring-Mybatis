package com.cyh.demos.mybatis.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cyh.demos.mybatis.mapper.UserMapper;
import com.cyh.demos.mybatis.model.User;
import com.cyh.demos.mybatis.service.UserService;
import com.sun.org.apache.regexp.internal.recompile;

@Service
@Transactional  //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper mapper;

	public boolean delete(int id) {
		
		return mapper.delete(id);
	}

	public List<User> findAll() {
		List<User> list = mapper.findAll();
		return list;
	}

	public User findById(int id) {

		User user = mapper.findById(id);
		return user;
	}

	public void save(User user) {

		mapper.save(user);
	}

	public boolean update(User user) {

		return mapper.update(user);
	}
}