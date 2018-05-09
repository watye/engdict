package com.talelife.edu.engdict.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talelife.edu.engdict.model.Category;
import com.talelife.edu.engdict.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController extends BaseController{
	@Resource
	private CategoryService categoryService;
	
	@RequestMapping("/all")
    public List<Category> all1() {
        return categoryService.findAll();
    }
	
	
	
	
}
