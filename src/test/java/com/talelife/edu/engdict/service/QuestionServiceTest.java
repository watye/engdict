package com.talelife.edu.engdict.service;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.talelife.edu.engdict.model.Question;
/**
 * 用户业务测试类
 * date: 2017-08-17 17:54:46
 * 
 * @author Liuweiyao
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionServiceTest{
	
	@Autowired
	private QuestionService questionService;
	
	@Test
	public void testAdd(){
		Question question  = new Question();
		question.setAnswer("我好");
		question.setQuestion("hello好");
		question.setCreateTime(new Date());
		question.setUpdateTime(question.getCreateTime());
		question.setDeleteFlag(0);
		question.setSortNo(1);
		questionService.add(question);
	}
	
}