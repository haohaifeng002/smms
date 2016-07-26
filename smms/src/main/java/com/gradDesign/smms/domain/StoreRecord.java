package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * StoreRecord的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class StoreRecord implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性stoId
     */
    private String stoId;
	
    /** 
     * 属性sttNum
     */
    private String sttNum;
	
    /** 
     * 属性proNum
     */
    private String proNum;
	
    /** 
     * 属性repoId
     */
    private String repoId;
	
    /** 
     * 属性repoNum
     */
    private String repoNum;
	
    /** 
     * 属性repoName
     */
    private String repoName;
	
    /** 
     * 属性count
     */
    private Integer count;
	
    /** 
     * 属性unitPrice
     */
    private Double unitPrice;
	
    /** 
     * 属性amount
     */
    private Double amount;
	
    /**
     * StoreRecord构造函数
     */
    public StoreRecord() {
        super();
    }  
	
    /**
     * StoreRecord完整的构造函数
     */  
    public StoreRecord(String stoId){
        this.stoId = stoId;
    }
 
    /**
     * 属性 stoId 的get方法
     * @return String
     */
    public String getStoId(){
        return stoId;
    }
	
    /**
     * 属性 stoId 的set方法
     * @return
     */
    public void setStoId(String stoId){
        if(stoId != null && stoId.trim().length() == 0){
            this.stoId = null;
        }else{
            this.stoId = stoId;
        }
    } 
	
    /**
     * 属性 sttNum 的get方法
     * @return String
     */
    public String getSttNum(){
        return sttNum;
    }
	
    /**
     * 属性 sttNum 的set方法
     * @return
     */
    public void setSttNum(String sttNum){
        this.sttNum = sttNum;
    } 
	
    /**
     * 属性 proNum 的get方法
     * @return String
     */
    public String getProNum(){
        return proNum;
    }
	
    /**
     * 属性 proNum 的set方法
     * @return
     */
    public void setProNum(String proNum){
        this.proNum = proNum;
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
        this.repoId = repoId;
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
     * 属性 count 的get方法
     * @return Integer
     */
    public Integer getCount(){
        return count;
    }
	
    /**
     * 属性 count 的set方法
     * @return
     */
    public void setCount(Integer count){
        this.count = count;
    } 
	
    /**
     * 属性 unitPrice 的get方法
     * @return Double
     */
    public Double getUnitPrice(){
        return unitPrice;
    }
	
    /**
     * 属性 unitPrice 的set方法
     * @return
     */
    public void setUnitPrice(Double unitPrice){
        this.unitPrice = unitPrice;
    } 
	
    /**
     * 属性 amount 的get方法
     * @return Double
     */
    public Double getAmount(){
        return amount;
    }
	
    /**
     * 属性 amount 的set方法
     * @return
     */
    public void setAmount(Double amount){
        this.amount = amount;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o) return true;
		
        if (o == null || !(o instanceof StoreRecord))
	        return false; 
			
        if(
            getStoId() == null
        ) return false;

        StoreRecord other = (StoreRecord) o;	        
	    return new EqualsBuilder()
            .append(this.getStoId(), other.getStoId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("stoId",getStoId())
            .append("sttNum",getSttNum())
            .append("proNum",getProNum())
            .append("repoId",getRepoId())
            .append("repoNum",getRepoNum())
            .append("repoName",getRepoName())
            .append("count",getCount())
            .append("unitPrice",getUnitPrice())
            .append("amount",getAmount())
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