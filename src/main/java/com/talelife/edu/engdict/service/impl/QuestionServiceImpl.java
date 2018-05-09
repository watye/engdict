package com.talelife.edu.engdict.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.talelife.edu.engdict.mapper.QuestionMapper;
import com.talelife.edu.engdict.model.Question;
import com.talelife.edu.engdict.service.QuestionService;
import com.talelife.util.Page;
/**
 * 题目业务实现类
 * date: 2018-05-06 13:12:37
 * 
 * @author Liuweiyao
 * @version 1.0
 */
@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Resource
	private QuestionMapper questionMapper;
	
	public List<Question> findAll(){
		return questionMapper.findAll();
	}
	
	public List<Question> findList(Question question){
		return questionMapper.findList(question);
	}
	
	public Page<Question> findPage(QuestionQuery query) {
		return new Page<Question>(questionMapper.findPage(query));
	}
	
	public int add(Question question){
		return questionMapper.add(question);
	}
	
	public int delete(Long id){
		return questionMapper.delete(id);
	}
	
	public int update(Question question){
		return questionMapper.update(question);
	}
	
	public Question findByPK(Long id){
		return questionMapper.findByPK(id);
	}
	
	
	
	
	
}