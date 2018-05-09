package com.talelife.edu.engdict.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talelife.edu.engdict.mapper.UserMapper;
import com.talelife.edu.engdict.model.User;
import com.talelife.edu.engdict.service.UserService;
import com.talelife.edu.engdict.service.UserService.UserQuery;
import com.talelife.util.Page;
/**
 * 用户业务实现类
 * date: 2017-08-17 17:54:46
 * 
 * @author Liuweiyao
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAll(){
		return userMapper.findAll();
	}
	
	public List<User> findList(User user){
		return userMapper.findList(user);
	}
	
	public Page<User> findPage(UserQuery query) {
		return new Page<User>(userMapper.findPage(query));
	}
	
	@Transactional
	public int add(User user){
		return userMapper.add(user);
	}
	
	public int delete(Long id){
		return userMapper.delete(id);
	}
	
	public int update(User user){
		return userMapper.update(user);
	}
	
	public User findByPK(Long id){
		return userMapper.findByPK(id);
	}
	
	
	
	
	
}