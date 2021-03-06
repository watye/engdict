package com.talelife.edu.engdict.mapper;
import com.talelife.edu.engdict.model.Category;
import java.util.List;
/**
 * 分类数据操作接口
 * date: 2018-05-05 21:45:49
 * 
 * @author Liuweiyao
 * @version 1.0
 */
public interface CategoryMapper{
	List<Category> findAll();
	
	List<Category> findList(Category category);
	
	int add(Category category);
	
	int update(Category category);
	
	Category findByPK(Long id);
	
	int delete(Long id);
}