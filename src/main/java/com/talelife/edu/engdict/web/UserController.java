package com.talelife.edu.engdict.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talelife.edu.engdict.model.User;
import com.talelife.edu.engdict.service.UserService;
import com.talelife.edu.engdict.service.UserService.UserQuery;
import com.talelife.util.Page;
import com.talelife.util.SpringContextHolder;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
	@Resource
	private UserService userService;
	
	@RequestMapping("/all")
    public List<User> all() {
        return userService.findAll();
    }
	
	@RequestMapping("/page")
    public Page<User> page() {
		UserQuery query = new UserQuery();
		query.setPageNum(2);
		query.setPageSize(1);
        return userService.findPage(query);
    }

	@RequestMapping("/add")
    public void add() {
		User user = new User();
		user.setAge(11);
		user.setUsername("李1");
        userService.add(user);
    }
	
	@RequestMapping("/delete")
    public void delete(long id) {
        userService.delete(id);
    }
	
	@RequestMapping("/login")
    public void login(HttpServletRequest request) {
		UserService mappe = SpringContextHolder.getBean("userServiceImpl");
		String[] a = SpringContextHolder.getApplicationContext().getBeanDefinitionNames();
		for (String a1 : a) {
			System.out.println("bean==>"+a1);
		}
    }
	
	
	
	
}
