package com.talelife.edu.engdict.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talelife.edu.engdict.model.Question;
import com.talelife.edu.engdict.service.QuestionService;
import com.talelife.edu.engdict.service.QuestionService.QuestionQuery;
import com.talelife.util.Page;
import com.talelife.util.Result;

@RestController
@RequestMapping("/question")
public class QuestionController extends BaseController{
	@Resource
	private QuestionService questionService;
	
	@RequestMapping("/page")
    public Map page(QuestionQuery query) {
		Page<Question> list = questionService.findPage(query);
		Map<String,Object> r = new HashMap<>();
		r.put("data", list.getData());
		r.put("total", list.getTotal());
        return r;
    }
	
	
	
	
}
