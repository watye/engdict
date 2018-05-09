package com.talelife.edu.engdict.service;
import com.talelife.edu.engdict.model.Category;
import java.util.List;
/**
 * 分类业务接口
 * date: 2018-05-05 21:45:49
 * 
 * @author Liuweiyao
 * @version 1.0
 */
public interface CategoryService{
	List<Category> findAll();
	
	List<Category> findList(Category category);
	
	int add(Category category);
	
	int delete(Long id);
	
	int update(Category category);
	
	Category findByPK(Long id);
}