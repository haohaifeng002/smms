package com.gradDesign.smms.domain;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
/**
 * UserLogin的POJO类
 *
 * @author  hhf  [Thu Jul 14 08:07:02 CST 2016]
 * 
 */
public class UserLogin implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性loginId
     */
    private String loginId;
	
    /** 
     * 属性empId
     */
    private String empId;
	
    /** 
     * 属性password
     */
    private String password;
	
    /**
     * UserLogin构造函数
     */
    public UserLogin() {
        super();
    }  
	
    /**
     * UserLogin完整的构造函数
     */  
    public UserLogin(String loginId){
        this.loginId = loginId;
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
        this.empId = empId;
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
            .append("empId",getEmpId())
            .append("password",getPassword())
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