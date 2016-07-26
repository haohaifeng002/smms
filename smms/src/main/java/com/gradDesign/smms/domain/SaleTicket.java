package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * SaleTicket的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class SaleTicket implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性ticketId
     */
    private String ticketId;
	
    /** 
     * 属性ticketNum
     */
    private String ticketNum;
	
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
     * 属性speciesCount
     */
    private Integer speciesCount;
	
    /** 
     * 属性spay
     */
    private Double spay;
	
    /** 
     * 属性tpay
     */
    private Double tpay;
	
    /** 
     * 属性npay
     */
    private Double npay;
	
    /** 
     * 属性isPay
     */
    private Character isPay;
	
    /** 
     * 属性saleTime
     */
    private String saleTime;
	
    /** 
     * 属性operator
     */
    private String operator;
	
    /** 
     * 属性handlerName
     */
    private String handlerName;
	
    /** 
     * 属性payWay
     */
    private String payWay;
	
    /**
     * SaleTicket构造函数
     */
    public SaleTicket() {
        super();
    }  
	
    /**
     * SaleTicket完整的构造函数
     */  
    public SaleTicket(String ticketId){
        this.ticketId = ticketId;
    }
 
    /**
     * 属性 ticketId 的get方法
     * @return String
     */
    public String getTicketId(){
        return ticketId;
    }
	
    /**
     * 属性 ticketId 的set方法
     * @return
     */
    public void setTicketId(String ticketId){
        if(ticketId != null && ticketId.trim().length() == 0){
            this.ticketId = null;
        }else{
            this.ticketId = ticketId;
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
        this.cltId = cltId;
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
     * 属性 speciesCount 的get方法
     * @return Integer
     */
    public Integer getSpeciesCount(){
        return speciesCount;
    }
	
    /**
     * 属性 speciesCount 的set方法
     * @return
     */
    public void setSpeciesCount(Integer speciesCount){
        this.speciesCount = speciesCount;
    } 
	
    /**
     * 属性 spay 的get方法
     * @return Double
     */
    public Double getSpay(){
        return spay;
    }
	
    /**
     * 属性 spay 的set方法
     * @return
     */
    public void setSpay(Double spay){
        this.spay = spay;
    } 
	
    /**
     * 属性 tpay 的get方法
     * @return Double
     */
    public Double getTpay(){
        return tpay;
    }
	
    /**
     * 属性 tpay 的set方法
     * @return
     */
    public void setTpay(Double tpay){
        this.tpay = tpay;
    } 
	
    /**
     * 属性 npay 的get方法
     * @return Double
     */
    public Double getNpay(){
        return npay;
    }
	
    /**
     * 属性 npay 的set方法
     * @return
     */
    public void setNpay(Double npay){
        this.npay = npay;
    } 
	
    /**
     * 属性 isPay 的get方法
     * @return Character
     */
    public Character getIsPay(){
        return isPay;
    }
	
    /**
     * 属性 isPay 的set方法
     * @return
     */
    public void setIsPay(Character isPay){
        this.isPay = isPay;
    } 
	
    /**
     * 属性 saleTime 的get方法
     * @return String
     */
    public String getSaleTime(){
        return saleTime;
    }
	
    /**
     * 属性 saleTime 的set方法
     * @return
     */
    public void setSaleTime(String saleTime){
        this.saleTime = saleTime;
    } 
	
    /**
     * 属性 operator 的get方法
     * @return String
     */
    public String getOperator(){
        return operator;
    }
	
    /**
     * 属性 operator 的set方法
     * @return
     */
    public void setOperator(String operator){
        this.operator = operator;
    } 
	
    /**
     * 属性 handlerName 的get方法
     * @return String
     */
    public String getHandlerName(){
        return handlerName;
    }
	
    /**
     * 属性 handlerName 的set方法
     * @return
     */
    public void setHandlerName(String handlerName){
        this.handlerName = handlerName;
    } 
	
    /**
     * 属性 payWay 的get方法
     * @return String
     */
    public String getPayWay(){
        return payWay;
    }
	
    /**
     * 属性 payWay 的set方法
     * @return
     */
    public void setPayWay(String payWay){
        this.payWay = payWay;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o) return true;
		
        if (o == null || !(o instanceof SaleTicket))
	        return false; 
			
        if(
            getTicketId() == null
        ) return false;

        SaleTicket other = (SaleTicket) o;	        
	    return new EqualsBuilder()
            .append(this.getTicketId(), other.getTicketId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("ticketId",getTicketId())
            .append("ticketNum",getTicketNum())
            .append("cltId",getCltId())
            .append("cltNum",getCltNum())
            .append("cltName",getCltName())
            .append("speciesCount",getSpeciesCount())
            .append("spay",getSpay())
            .append("tpay",getTpay())
            .append("npay",getNpay())
            .append("isPay",getIsPay())
            .append("saleTime",getSaleTime())
            .append("operator",getOperator())
            .append("handlerName",getHandlerName())
            .append("payWay",getPayWay())
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