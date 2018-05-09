package com.talelife.edu.engdict.service.impl;
import org.springframework.stereotype.Service;
import com.talelife.edu.engdict.service.CategoryService;
import com.talelife.edu.engdict.mapper.CategoryMapper;
import com.talelife.edu.engdict.model.Category;
import javax.annotation.Resource;
import java.util.List;
/**
 * 分类业务实现类
 * date: 2018-05-05 21:45:49
 * 
 * @author Liuweiyao
 * @version 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Resource
	private CategoryMapper categoryMapper;
	
	public List<Category> findAll(){
		return categoryMapper.findAll();
	}
	
	public List<Category> findList(Category category){
		return categoryMapper.findList(category);
	}
	
	public int add(Category category){
		return categoryMapper.add(category);
	}
	
	public int delete(Long id){
		return categoryMapper.delete(id);
	}
	
	public int update(Category category){
		return categoryMapper.update(category);
	}
	
	public Category findByPK(Long id){
		return categoryMapper.findByPK(id);
	}
	
	
	
	
	
}