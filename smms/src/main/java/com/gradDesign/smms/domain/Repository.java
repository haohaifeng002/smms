package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Repository的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class Repository implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性repoId
     */
    private String repoId;
	
    /** 
     * 属性repoName
     */
    private String repoName;
	
    /** 
     * 属性repoNum
     */
    private String repoNum;
	
    /** 
     * 属性empId
     */
    private String empId;
	
    /** 
     * 属性empNum
     */
    private String empNum;
	
    /** 
     * 属性empName
     */
    private String empName;
	
    /**
     * Repository构造函数
     */
    public Repository() {
        super();
    }  
	
    /**
     * Repository完整的构造函数
     */  
    public Repository(String repoId){
        this.repoId = repoId;
    }
 
    /**
     * 属性 repoId 的get方法
     * @return String
     */
    public String getRepoId(){
        return repoId;
    }
	
    /**
     * 属性 repoId 的set方法
     * @return
     */
    public void setRepoId(String repoId){
        if(repoId != null && repoId.trim().length() == 0){
            this.repoId = null;
        }else{
            this.repoId = repoId;
        }
    } 
	
    /**
     * 属性 repoName 的get方法
     * @return String
     */
    public String getRepoName(){
        return repoName;
    }
	
    /**
     * 属性 repoName 的set方法
     * @return
     */
    public void setRepoName(String repoName){
        this.repoName = repoName;
    } 
	
    /**
     * 属性 repoNum 的get方法
     * @return String
     */
    public String getRepoNum(){
        return repoNum;
    }
	
    /**
     * 属性 repoNum 的set方法
     * @return
     */
    public void setRepoNum(String repoNum){
        this.repoNum = repoNum;
    } 
	
    /**
     * 属性 empId 的get方法
     * @return String
     */
    public String getEmpId(){
        return empId;
    }
	
    /**
     * 属性 empId 的set方法
     * @return
     */
    public void setEmpId(String empId){
        this.empId = empId;
    } 
	
    /**
     * 属性 empNum 的get方法
     * @return String
     */
    public String getEmpNum(){
        return empNum;
    }
	
    /**
     * 属性 empNum 的set方法
     * @return
     */
    public void setEmpNum(String empNum){
        this.empNum = empNum;
    } 
	
    /**
     * 属性 empName 的get方法
     * @return String
     */
    public String getEmpName(){
        return empName;
    }
	
    /**
     * 属性 empName 的set方法
     * @return
     */
    public void setEmpName(String empName){
        this.empName = empName;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o) return true;
		
        if (o == null || !(o instanceof Repository))
	        return false; 
			
        if(
            getRepoId() == null
        ) return false;

        Repository other = (Repository) o;	        
	    return new EqualsBuilder()
            .append(this.getRepoId(), other.getRepoId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("repoId",getRepoId())
            .append("repoName",getRepoName())
            .append("repoNum",getRepoNum())
            .append("empId",getEmpId())
            .append("empNum",getEmpNum())
            .append("empName",getEmpName())
            .toString();    
    } 
   

  /**
     * hashcode方法
     * @return int
     * 
     */
@Override
public int hashCode(){
		return super.hashCode();
	}

}