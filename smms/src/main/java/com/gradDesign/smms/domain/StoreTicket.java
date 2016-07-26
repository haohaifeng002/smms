package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * StoreTicket的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class StoreTicket implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性sttId
     */
    private String sttId;
	
    /** 
     * 属性sttNum
     */
    private String sttNum;
	
    /** 
     * 属性supNum
     */
    private String supNum;
	
    /** 
     * 属性varietyCount
     */
    private Integer varietyCount;
	
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
     * 属性dataTime
     */
    private Date dataTime;
	
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
     * StoreTicket构造函数
     */
    public StoreTicket() {
        super();
    }  
	
    /**
     * StoreTicket完整的构造函数
     */  
    public StoreTicket(String sttId){
        this.sttId = sttId;
    }
 
    /**
     * 属性 sttId 的get方法
     * @return String
     */
    public String getSttId(){
        return sttId;
    }
	
    /**
     * 属性 sttId 的set方法
     * @return
     */
    public void setSttId(String sttId){
        if(sttId != null && sttId.trim().length() == 0){
            this.sttId = null;
        }else{
            this.sttId = sttId;
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
     * 属性 varietyCount 的get方法
     * @return Integer
     */
    public Integer getVarietyCount(){
        return varietyCount;
    }
	
    /**
     * 属性 varietyCount 的set方法
     * @return
     */
    public void setVarietyCount(Integer varietyCount){
        this.varietyCount = varietyCount;
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
     * 属性 dataTime 的get方法
     * @return Date
     */
    public Date getDataTime(){
        return dataTime;
    }
	
    /**
     * 属性 dataTime 的set方法
     * @return
     */
    public void setDataTime(Date dataTime){
        this.dataTime = dataTime;
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
		
        if (o == null || !(o instanceof StoreTicket))
	        return false; 
			
        if(
            getSttId() == null
        ) return false;

        StoreTicket other = (StoreTicket) o;	        
	    return new EqualsBuilder()
            .append(this.getSttId(), other.getSttId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("sttId",getSttId())
            .append("sttNum",getSttNum())
            .append("supNum",getSupNum())
            .append("varietyCount",getVarietyCount())
            .append("spay",getSpay())
            .append("tpay",getTpay())
            .append("npay",getNpay())
            .append("isPay",getIsPay())
            .append("dataTime",getDataTime())
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