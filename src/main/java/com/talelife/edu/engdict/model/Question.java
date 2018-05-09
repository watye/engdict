package com.talelife.edu.engdict.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 题目实体类
 * date: 2018-05-06 13:12:37
 * 
 * @author Liuweiyao
 * @version 1.0
 */
public class Question implements Serializable{
	//ID
	private Long id;
	
	//问题
	private String question;
	
	//答案
	private String answer;
	
	//序号
	private Integer sortNo;
	
	//删除标识(是:1,否:0)
	private Integer deleteFlag;
	
	//创建时间,默认当前时间
	private Date createTime;
	
	//修改时间，默认当前时间
	private Date updateTime;
	
	//
	private Long categoryId;
	

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
 	    this.id=id;
    }
	public String getQuestion(){
		return question;
	}
	
	public void setQuestion(String question){
 	    this.question=question;
    }
	public String getAnswer(){
		return answer;
	}
	
	public void setAnswer(String answer){
 	    this.answer=answer;
    }
	public Integer getSortNo(){
		return sortNo;
	}
	
	public void setSortNo(Integer sortNo){
 	    this.sortNo=sortNo;
    }
	public Integer getDeleteFlag(){
		return deleteFlag;
	}
	
	public void setDeleteFlag(Integer deleteFlag){
 	    this.deleteFlag=deleteFlag;
    }
	public Date getCreateTime(){
		return createTime;
	}
	
	public void setCreateTime(Date createTime){
 	    this.createTime=createTime;
    }
	public Date getUpdateTime(){
		return updateTime;
	}
	
	public void setUpdateTime(Date updateTime){
 	    this.updateTime=updateTime;
    }
	public Long getCategoryId(){
		return categoryId;
	}
	
	public void setCategoryId(Long categoryId){
 	    this.categoryId=categoryId;
    }

}