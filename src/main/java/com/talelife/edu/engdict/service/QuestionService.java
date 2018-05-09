package com.talelife.edu.engdict.service;
import com.talelife.edu.engdict.model.Question;
import com.talelife.edu.engdict.model.User;
import com.talelife.edu.engdict.service.QuestionService.QuestionQuery;
import com.talelife.util.Page;

import java.util.List;
/**
 * 题目业务接口
 * date: 2018-05-06 13:12:37
 * 
 * @author Liuweiyao
 * @version 1.0
 */
public interface QuestionService{
	List<Question> findAll();
	
	List<Question> findList(Question question);
	
	int add(Question question);
	
	int delete(Long id);
	
	int update(Question question);
	
	Question findByPK(Long id);
	
	Page<Question> findPage(QuestionQuery query);

	public static class QuestionQuery extends Question{

		private static final long serialVersionUID = 2267247332350702957L;
		private Integer pageNum=1;
		private Integer pageSize=Page.DEFAULT_PAGE_SIZE;
		public Integer getPageNum() {
			return pageNum;
		}
		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}
		public Integer getPageSize() {
			return pageSize;
		}
		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
	}

}