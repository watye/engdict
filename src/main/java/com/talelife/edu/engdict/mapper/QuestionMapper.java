package com.talelife.edu.engdict.mapper;
import java.util.List;

import com.github.pagehelper.Page;
import com.talelife.edu.engdict.model.Question;
import com.talelife.edu.engdict.service.QuestionService.QuestionQuery;
/**
 * 题目数据操作接口
 * date: 2018-05-06 13:12:37
 * 
 * @author Liuweiyao
 * @version 1.0
 */
public interface QuestionMapper{
	List<Question> findAll();
	
	List<Question> findList(Question question);
	
	int add(Question question);
	
	int update(Question question);
	
	Question findByPK(Long id);
	
	int delete(Long id);
	
	Page<Question> findPage(QuestionQuery query);
}