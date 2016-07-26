package com.gradDesign.smms.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.gradDesign.smms.domain.UserLogin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class TestUserLogin{
	@Autowired
	UserLoginService userLoginService;
	//private static final Logger log = Logger.getLogger(TestUserLogin.class);
	private static Logger log = LoggerFactory.getLogger(TestUserLogin.class);

	@Test
	public void addTest(){
		UserLogin ul = new UserLogin();
		ul.setEmpId("empId");
		ul.setPassword("password");
		String str = userLoginService.save(ul);
		log.info(JSON.toJSONString(str));  
	}
	
	@Resource
	TestService testService;
	
	//测试事务
	//@Test
	public void addTwo(){
		//testService.saveTwo();
		testService.saveUsers25();
	}
}
