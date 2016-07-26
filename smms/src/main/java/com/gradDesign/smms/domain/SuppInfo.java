package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * SuppInfo的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class SuppInfo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性supId
     */
    private String supId;
	
    /** 
     * 属性supNum
     */
    private String supNum;
	
    /** 
     * 属性supName
     */
    private String supName;
	
    /** 
     * 属性supPost
     */
    private String supPost;
	
    /** 
     * 属性supAddr
     */
    private String supAddr;
	
    /** 
     * 属性linkman
     */
    private String linkman;
	
    /** 
     * 属性phone
     */
    private String phone;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /**
     * SuppInfo构造函数
     */
    public SuppInfo() {
        super();
    }  
	
    /**
     * SuppInfo完整的构造函数
     */  
    public SuppInfo(String supId){
        this.supId = supId;
    }
 
    /**
     * 属性 supId 的get方法
     * @return String
     */
    public String getSupId(){
        return supId;
    }
	
    /**
     * 属性 supId 的set方法
     * @return
     */
    public void setSupId(String supId){
        if(supId != null && supId.trim().length() == 0){
            this.supId = null;
        }else{
            this.supId = supId;
        }
    } 
	
    /**
     * 属性 supNum 的get方法
     * @return String
     */
    public String getSupNum(){
        return supNum;
    }
	
    /**
     * 属性 supNum 的set方法
     * @return
     */
    public void setSupNum(String supNum){
        this.supNum = supNum;
    } 
	
    /**
     * 属性 supName 的get方法
     * @return String
     */
    public String getSupName(){
        return supName;
    }
	
    /**
     * 属性 supName 的set方法
     * @return
     */
    public void setSupName(String supName){
        this.supName = supName;
    } 
	
    /**
     * 属性 supPost 的get方法
     * @return String
     */
    public String getSupPost(){
        return supPost;
    }
	
    /**
     * 属性 supPost 的set方法
     * @return
     */
    public void setSupPost(String supPost){
        this.supPost = supPost;
    } 
	
    /**
     * 属性 supAddr 的get方法
     * @return String
     */
    public String getSupAddr(){
        return supAddr;
    }
	
    /**
     * 属性 supAddr 的set方法
     * @return
     */
    public void setSupAddr(String supAddr){
        this.supAddr = supAddr;
    } 
	
    /**
     * 属性 linkman 的get方法
     * @return String
     */
    public String getLinkman(){
        return linkman;
    }
	
    /**
     * 属性 linkman 的set方法
     * @return
     */
    public void setLinkman(String linkman){
        this.linkman = linkman;
    } 
	
    /**
     * 属性 phone 的get方法
     * @return String
     */
    public String getPhone(){
        return phone;
    }
	
    /**
     * 属性 phone 的set方法
     * @return
     */
    public void setPhone(String phone){
        this.phone = phone;
    } 
	
    /**
     * 属性 remark 的get方法
     * @return String
     */
    public String getRemark(){
        return remark;
    }
	
    /**
     * 属性 remark 的set方法
     * @return
     */
    public void setRemark(String remark){
        this.remark = remark;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o) return true;
		
        if (o == null || !(o instanceof SuppInfo))
	        return false; 
			
        if(
            getSupId() == null
        ) return false;

        SuppInfo other = (SuppInfo) o;	        
	    return new EqualsBuilder()
            .append(this.getSupId(), other.getSupId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("supId",getSupId())
            .append("supNum",getSupNum())
            .append("supName",getSupName())
            .append("supPost",getSupPost())
            .append("supAddr",getSupAddr())
            .append("linkman",getLinkman())
            .append("phone",getPhone())
            .append("remark",getRemark())
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