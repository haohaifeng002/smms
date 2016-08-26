package com.gradDesign.smms.service.user;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gradDesign.smms.domain.EmpInfo;
import com.gradDesign.smms.domain.UserLogin;
import com.gradDesign.smms.utils.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestUserService {
	@Resource
	UserService userService;
	
	private static EmpInfo EMP;
	private static UserLogin USER;
	
	@BeforeClass
	public static void init(){
		String curTime = DateUtil.getCurDateTimes();
		EMP = new EmpInfo("No_002","zs","1","少林寺",(double) 3000,"备注1",curTime);
		USER = new UserLogin(EMP,EMP.getEmpName(),DigestUtils.md5Hex("123456"), curTime, curTime);
	}
	
	@Test
	public void testSaveUser(){
		userService.saveUser(USER,EMP);
	}
	
//	@Test
	public void testGetByName(){
		UserLogin user1 = new UserLogin();
		user1.setEmpName("张和尚");
		UserLogin user2 = new UserLogin();
		user2.setEmpName("Mr.Zhang");
		
		assertEquals("ok",userService.getByName(user1));
		assertEquals("",userService.getByName(user2));
				
	}
	
	public void testLogin(){
		
	}
}
