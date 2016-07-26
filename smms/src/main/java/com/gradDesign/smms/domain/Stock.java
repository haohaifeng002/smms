package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Stock的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class Stock implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性stockId
     */
    private String stockId;
	
    /** 
     * 属性proId
     */
    private String proId;
	
    /** 
     * 属性proNum
     */
    private String proNum;
	
    /** 
     * 属性proName
     */
    private String proName;
	
    /** 
     * 属性stockCount
     */
    private Integer stockCount;
	
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
     * 属性stockMax
     */
    private Integer stockMax;
	
    /** 
     * 属性stockMin
     */
    private Integer stockMin;
	
    /**
     * Stock构造函数
     */
    public Stock() {
        super();
    }  
	
    /**
     * Stock完整的构造函数
     */  
    public Stock(String stockId){
        this.stockId = stockId;
    }
 
    /**
     * 属性 stockId 的get方法
     * @return String
     */
    public String getStockId(){
        return stockId;
    }
	
    /**
     * 属性 stockId 的set方法
     * @return
     */
    public void setStockId(String stockId){
        if(stockId != null && stockId.trim().length() == 0){
            this.stockId = null;
        }else{
            this.stockId = stockId;
        }
    } 
	
    /**
     * 属性 proId 的get方法
     * @return String
     */
    public String getProId(){
        return proId;
    }
	
    /**
     * 属性 proId 的set方法
     * @return
     */
    public void setProId(String proId){
        this.proId = proId;
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
     * 属性 proName 的get方法
     * @return String
     */
    public String getProName(){
        return proName;
    }
	
    /**
     * 属性 proName 的set方法
     * @return
     */
    public void setProName(String proName){
        this.proName = proName;
    } 
	
    /**
     * 属性 stockCount 的get方法
     * @return Integer
     */
    public Integer getStockCount(){
        return stockCount;
    }
	
    /**
     * 属性 stockCount 的set方法
     * @return
     */
    public void setStockCount(Integer stockCount){
        this.stockCount = stockCount;
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
     * 属性 stockMax 的get方法
     * @return Integer
     */
    public Integer getStockMax(){
        return stockMax;
    }
	
    /**
     * 属性 stockMax 的set方法
     * @return
     */
    public void setStockMax(Integer stockMax){
        this.stockMax = stockMax;
    } 
	
    /**
     * 属性 stockMin 的get方法
     * @return Integer
     */
    public Integer getStockMin(){
        return stockMin;
    }
	
    /**
     * 属性 stockMin 的set方法
     * @return
     */
    public void setStockMin(Integer stockMin){
        this.stockMin = stockMin;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o) return true;
		
        if (o == null || !(o instanceof Stock))
	        return false; 
			
        if(
            getStockId() == null
        ) return false;

        Stock other = (Stock) o;	        
	    return new EqualsBuilder()
            .append(this.getStockId(), other.getStockId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("stockId",getStockId())
            .append("proId",getProId())
            .append("proNum",getProNum())
            .append("proName",getProName())
            .append("stockCount",getStockCount())
            .append("repoId",getRepoId())
            .append("repoNum",getRepoNum())
            .append("repoName",getRepoName())
            .append("stockMax",getStockMax())
            .append("stockMin",getStockMin())
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