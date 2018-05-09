package com.talelife.edu.engdict.model;
import java.io.Serializable;
/**
 * 用户实体类
 * date: 2017-08-17 17:54:46
 * 
 * @author Liuweiyao
 * @version 1.0
 */
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8581953310313209902L;

	//
	private Long id;
	
	//姓名
	private String username;
	
	//年龄
	private Integer age;
	

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
 	    this.id=id;
    }
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
 	    this.username=username;
    }
	public Integer getAge(){
		return age;
	}
	
	public void setAge(Integer age){
 	    this.age=age;
    }

}