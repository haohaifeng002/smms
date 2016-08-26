package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
/**
 * UserLogin的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
@Entity
@Table(name="user_login", catalog="smms")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserLogin implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性loginId
     */
	@Id
	@Column(unique=true,length=32,nullable=false)
	@GenericGenerator(name="loginId_uuid",strategy="uuid")
	@GeneratedValue(generator="loginId_uuid")
    private String loginId;
	
    /** 
     * 属性empId
     */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empId",unique = true)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private EmpInfo emp;
	
	private String empName;
	
    /** 
     * 属性password
     */
    private String password;
    
    private String loginTime;
    
    private String lastLoginTime;
	
    /**
     * UserLogin构造函数
     */
    public UserLogin() {}  
	
    /**
     * UserLogin完整的构造函数
     */  
	public UserLogin(EmpInfo emp, String empName, String password, String loginTime, String lastLoginTime) {
		this.emp = emp;
		this.empName = empName;
		this.password = password;
		this.loginTime = loginTime;
		this.lastLoginTime = lastLoginTime;
	}
    
    /**
     * 属性 loginId 的get方法
     * @return String
     */
    public String getLoginId(){
        return loginId;
    }

	/**
     * 属性 loginId 的set方法
     * @return
     */
    public void setLoginId(String loginId){
        if(loginId != null && loginId.trim().length() == 0){
            this.loginId = null;
        }else{
            this.loginId = loginId;
        }
    } 
	
	
    public EmpInfo getEmp() {
		return emp;
	}

	public void setEmp(EmpInfo emp) {
		this.emp = emp;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
     * 属性 password 的get方法
     * @return String
     */
    public String getPassword(){
        return password;
    }
	
    /**
     * 属性 password 的set方法
     * @return
     */
    public void setPassword(String password){
        this.password = password;
    } 
	
    public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o) return true;
		
        if (o == null || !(o instanceof UserLogin))
	        return false; 
			
        if(
            getLoginId() == null
        ) return false;

        UserLogin other = (UserLogin) o;	        
	    return new EqualsBuilder()
            .append(this.getLoginId(), other.getLoginId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
        return new ToStringBuilder(this)
            .append("loginId",getLoginId())
            .append("emp",getEmp())
            .append("password",getPassword())
            .append("empName",getEmpName())
            .append("empName",getEmpName())
            .append("loginTime",getLoginTime())
            .append("lastLoginTime",getLastLoginTime())
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