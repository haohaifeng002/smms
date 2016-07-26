package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * EmpInfo的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class EmpInfo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
     * 属性empGender
     */
    private String empGender;
	
    /** 
     * 属性empPosition
     */
    private String empPosition;
	
    /** 
     * 属性empSalary
     */
    private Double empSalary;
	
    /** 
     * 属性remarks
     */
    private String remarks;
	
    /**
     * EmpInfo构造函数
     */
    public EmpInfo() {
        super();
    }  
	
    /**
     * EmpInfo完整的构造函数
     */  
    public EmpInfo(String empId){
        this.empId = empId;
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
        if(empId != null && empId.trim().length() == 0){
            this.empId = null;
        }else{
            this.empId = empId;
        }
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
     * 属性 empGender 的get方法
     * @return String
     */
    public String getEmpGender(){
        return empGender;
    }
	
    /**
     * 属性 empGender 的set方法
     * @return
     */
    public void setEmpGender(String empGender){
        this.empGender = empGender;
    } 
	
    /**
     * 属性 empPosition 的get方法
     * @return String
     */
    public String getEmpPosition(){
        return empPosition;
    }
	
    /**
     * 属性 empPosition 的set方法
     * @return
     */
    public void setEmpPosition(String empPosition){
        this.empPosition = empPosition;
    } 
	
    /**
     * 属性 empSalary 的get方法
     * @return Double
     */
    public Double getEmpSalary(){
        return empSalary;
    }
	
    /**
     * 属性 empSalary 的set方法
     * @return
     */
    public void setEmpSalary(Double empSalary){
        this.empSalary = empSalary;
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
		
        if (o == null || !(o instanceof EmpInfo))
	        return false; 
			
        if(
            getEmpId() == null
        ) return false;

        EmpInfo other = (EmpInfo) o;	        
	    return new EqualsBuilder()
            .append(this.getEmpId(), other.getEmpId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("empId",getEmpId())
            .append("empNum",getEmpNum())
            .append("empName",getEmpName())
            .append("empGender",getEmpGender())
            .append("empPosition",getEmpPosition())
            .append("empSalary",getEmpSalary())
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