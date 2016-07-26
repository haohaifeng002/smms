package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * SaleInfo的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class SaleInfo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性saleId
     */
    private String saleId;
	
    /** 
     * 属性ticketNum
     */
    private String ticketNum;
	
    /** 
     * 属性proNum
     */
    private String proNum;
	
    /** 
     * 属性proId
     */
    private String proId;
	
    /** 
     * 属性proName
     */
    private String proName;
	
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
     * 属性saleCount
     */
    private Integer saleCount;
	
    /** 
     * 属性saleUnitPrice
     */
    private Double saleUnitPrice;
	
    /** 
     * 属性amount
     */
    private Double amount;
	
    /** 
     * 属性grossProfit
     */
    private Double grossProfit;
	
    /**
     * SaleInfo构造函数
     */
    public SaleInfo() {
        super();
    }  
	
    /**
     * SaleInfo完整的构造函数
     */  
    public SaleInfo(String saleId){
        this.saleId = saleId;
    }
 
    /**
     * 属性 saleId 的get方法
     * @return String
     */
    public String getSaleId(){
        return saleId;
    }
	
    /**
     * 属性 saleId 的set方法
     * @return
     */
    public void setSaleId(String saleId){
        if(saleId != null && saleId.trim().length() == 0){
            this.saleId = null;
        }else{
            this.saleId = saleId;
        }
    } 
	
    /**
     * 属性 ticketNum 的get方法
     * @return String
     */
    public String getTicketNum(){
        return ticketNum;
    }
	
    /**
     * 属性 ticketNum 的set方法
     * @return
     */
    public void setTicketNum(String ticketNum){
        this.ticketNum = ticketNum;
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
     * 属性 saleCount 的get方法
     * @return Integer
     */
    public Integer getSaleCount(){
        return saleCount;
    }
	
    /**
     * 属性 saleCount 的set方法
     * @return
     */
    public void setSaleCount(Integer saleCount){
        this.saleCount = saleCount;
    } 
	
    /**
     * 属性 saleUnitPrice 的get方法
     * @return Double
     */
    public Double getSaleUnitPrice(){
        return saleUnitPrice;
    }
	
    /**
     * 属性 saleUnitPrice 的set方法
     * @return
     */
    public void setSaleUnitPrice(Double saleUnitPrice){
        this.saleUnitPrice = saleUnitPrice;
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
     * 属性 grossProfit 的get方法
     * @return Double
     */
    public Double getGrossProfit(){
        return grossProfit;
    }
	
    /**
     * 属性 grossProfit 的set方法
     * @return
     */
    public void setGrossProfit(Double grossProfit){
        this.grossProfit = grossProfit;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o) return true;
		
        if (o == null || !(o instanceof SaleInfo))
	        return false; 
			
        if(
            getSaleId() == null
        ) return false;

        SaleInfo other = (SaleInfo) o;	        
	    return new EqualsBuilder()
            .append(this.getSaleId(), other.getSaleId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("saleId",getSaleId())
            .append("ticketNum",getTicketNum())
            .append("proNum",getProNum())
            .append("proId",getProId())
            .append("proName",getProName())
            .append("repoId",getRepoId())
            .append("repoNum",getRepoNum())
            .append("repoName",getRepoName())
            .append("saleCount",getSaleCount())
            .append("saleUnitPrice",getSaleUnitPrice())
            .append("amount",getAmount())
            .append("grossProfit",getGrossProfit())
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