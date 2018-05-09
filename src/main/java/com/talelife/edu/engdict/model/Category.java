package com.talelife.edu.engdict.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 分类实体类
 * date: 2018-05-05 21:45:49
 * 
 * @author Liuweiyao
 * @version 1.0
 */
public class Category implements Serializable{
	//ID
	private Long id;
	
	//上级ID
	private Long pid;
	
	//类别名称
	private String categoryName;
	
	//序号
	private Integer sortNo;
	
	//删除状态(是:1,否0)
	private Integer deleteFlag;
	
	//创建时间,默认当前时间
	private Date createTime;
	
	//修改时间,默认当前时间
	private Date updateTime;
	

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
 	    this.id=id;
    }
	public Long getPid(){
		return pid;
	}
	
	public void setPid(Long pid){
 	    this.pid=pid;
    }
	public String getCategoryName(){
		return categoryName;
	}
	
	public void setCategoryName(String categoryName){
 	    this.categoryName=categoryName;
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

}