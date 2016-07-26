package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ProInfo的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class ProInfo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
     * 属性proArea
     */
    private String proArea;
	
    /** 
     * 属性proStandard
     */
    private String proStandard;
	
    /** 
     * 属性proUnit
     */
    private String proUnit;
	
    /** 
     * 属性proBrand
     */
    private String proBrand;
	
    /** 
     * 属性purchasingPrice
     */
    private Double purchasingPrice;
	
    /** 
     * 属性tradePrice
     */
    private Double tradePrice;
	
    /** 
     * 属性retailPrice
     */
    private Double retailPrice;
	
    /** 
     * 属性expirationDate
     */
    private String expirationDate;
	
    /** 
     * 属性supplier
     */
    private String supplier;
	
    /** 
     * 属性remarks
     */
    private String remarks;
	
    /**
     * ProInfo构造函数
     */
    public ProInfo() {
        super();
    }  
	
    /**
     * ProInfo完整的构造函数
     */  
    public ProInfo(String proId){
        this.proId = proId;
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
        if(proId != null && proId.trim().length() == 0){
            this.proId = null;
        }else{
            this.proId = proId;
        }
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
     * 属性 proArea 的get方法
     * @return String
     */
    public String getProArea(){
        return proArea;
    }
	
    /**
     * 属性 proArea 的set方法
     * @return
     */
    public void setProArea(String proArea){
        this.proArea = proArea;
    } 
	
    /**
     * 属性 proStandard 的get方法
     * @return String
     */
    public String getProStandard(){
        return proStandard;
    }
	
    /**
     * 属性 proStandard 的set方法
     * @return
     */
    public void setProStandard(String proStandard){
        this.proStandard = proStandard;
    } 
	
    /**
     * 属性 proUnit 的get方法
     * @return String
     */
    public String getProUnit(){
        return proUnit;
    }
	
    /**
     * 属性 proUnit 的set方法
     * @return
     */
    public void setProUnit(String proUnit){
        this.proUnit = proUnit;
    } 
	
    /**
     * 属性 proBrand 的get方法
     * @return String
     */
    public String getProBrand(){
        return proBrand;
    }
	
    /**
     * 属性 proBrand 的set方法
     * @return
     */
    public void setProBrand(String proBrand){
        this.proBrand = proBrand;
    } 
	
    /**
     * 属性 purchasingPrice 的get方法
     * @return Double
     */
    public Double getPurchasingPrice(){
        return purchasingPrice;
    }
	
    /**
     * 属性 purchasingPrice 的set方法
     * @return
     */
    public void setPurchasingPrice(Double purchasingPrice){
        this.purchasingPrice = purchasingPrice;
    } 
	
    /**
     * 属性 tradePrice 的get方法
     * @return Double
     */
    public Double getTradePrice(){
        return tradePrice;
    }
	
    /**
     * 属性 tradePrice 的set方法
     * @return
     */
    public void setTradePrice(Double tradePrice){
        this.tradePrice = tradePrice;
    } 
	
    /**
     * 属性 retailPrice 的get方法
     * @return Double
     */
    public Double getRetailPrice(){
        return retailPrice;
    }
	
    /**
     * 属性 retailPrice 的set方法
     * @return
     */
    public void setRetailPrice(Double retailPrice){
        this.retailPrice = retailPrice;
    } 
	
    /**
     * 属性 expirationDate 的get方法
     * @return String
     */
    public String getExpirationDate(){
        return expirationDate;
    }
	
    /**
     * 属性 expirationDate 的set方法
     * @return
     */
    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    } 
	
    /**
     * 属性 supplier 的get方法
     * @return String
     */
    public String getSupplier(){
        return supplier;
    }
	
    /**
     * 属性 supplier 的set方法
     * @return
     */
    public void setSupplier(String supplier){
        this.supplier = supplier;
    } 
	
    /**
     * 属性 remarks 的get方法
     * @return String
     */
    public String getRemarks(){
        return remarks;
    }
	
    /**
     * 属性 remarks 的set方法
     * @return
     */
    public void setRemarks(String remarks){
        this.remarks = remarks;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o) return true;
		
        if (o == null || !(o instanceof ProInfo))
	        return false; 
			
        if(
            getProId() == null
        ) return false;

        ProInfo other = (ProInfo) o;	        
	    return new EqualsBuilder()
            .append(this.getProId(), other.getProId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("proId",getProId())
            .append("proNum",getProNum())
            .append("proName",getProName())
            .append("proArea",getProArea())
            .append("proStandard",getProStandard())
            .append("proUnit",getProUnit())
            .append("proBrand",getProBrand())
            .append("purchasingPrice",getPurchasingPrice())
            .append("tradePrice",getTradePrice())
            .append("retailPrice",getRetailPrice())
            .append("expirationDate",getExpirationDate())
            .append("supplier",getSupplier())
            .append("remarks",getRemarks())
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