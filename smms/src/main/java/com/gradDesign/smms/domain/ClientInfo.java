package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ClientInfo的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class ClientInfo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性cltId
     */
    private String cltId;
	
    /** 
     * 属性cltNum
     */
    private String cltNum;
	
    /** 
     * 属性cltName
     */
    private String cltName;
	
    /** 
     * 属性cltPost
     */
    private String cltPost;
	
    /** 
     * 属性cltAddr
     */
    private String cltAddr;
	
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
     * ClientInfo构造函数
     */
    public ClientInfo() {
        super();
    }  
	
    /**
     * ClientInfo完整的构造函数
     */  
    public ClientInfo(String cltId){
        this.cltId = cltId;
    }
 
    /**
     * 属性 cltId 的get方法
     * @return String
     */
    public String getCltId(){
        return cltId;
    }
	
    /**
     * 属性 cltId 的set方法
     * @return
     */
    public void setCltId(String cltId){
        if(cltId != null && cltId.trim().length() == 0){
            this.cltId = null;
        }else{
            this.cltId = cltId;
        }
    } 
	
    /**
     * 属性 cltNum 的get方法
     * @return String
     */
    public String getCltNum(){
        return cltNum;
    }
	
    /**
     * 属性 cltNum 的set方法
     * @return
     */
    public void setCltNum(String cltNum){
        this.cltNum = cltNum;
    } 
	
    /**
     * 属性 cltName 的get方法
     * @return String
     */
    public String getCltName(){
        return cltName;
    }
	
    /**
     * 属性 cltName 的set方法
     * @return
     */
    public void setCltName(String cltName){
        this.cltName = cltName;
    } 
	
    /**
     * 属性 cltPost 的get方法
     * @return String
     */
    public String getCltPost(){
        return cltPost;
    }
	
    /**
     * 属性 cltPost 的set方法
     * @return
     */
    public void setCltPost(String cltPost){
        this.cltPost = cltPost;
    } 
	
    /**
     * 属性 cltAddr 的get方法
     * @return String
     */
    public String getCltAddr(){
        return cltAddr;
    }
	
    /**
     * 属性 cltAddr 的set方法
     * @return
     */
    public void setCltAddr(String cltAddr){
        this.cltAddr = cltAddr;
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
		
        if (o == null || !(o instanceof ClientInfo))
	        return false; 
			
        if(
            getCltId() == null
        ) return false;

        ClientInfo other = (ClientInfo) o;	        
	    return new EqualsBuilder()
            .append(this.getCltId(), other.getCltId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("cltId",getCltId())
            .append("cltNum",getCltNum())
            .append("cltName",getCltName())
            .append("cltPost",getCltPost())
            .append("cltAddr",getCltAddr())
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