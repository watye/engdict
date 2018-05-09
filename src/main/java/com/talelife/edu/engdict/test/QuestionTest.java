package com.talelife.edu.engdict.test;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.talelife.edu.engdict.service.QuestionService;

/**
 * 题目测试用例
 * date: 2018-05-06 13:12:37
 * 
 * @author Liuweiyao
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("/spring-context.xml")
public class QuestionTest {
	 @Autowired
	 private QuestionService questionService;
	 
	 @Test
	 public void testFindAll(){
		 questionService.findAll();
	 }
}
