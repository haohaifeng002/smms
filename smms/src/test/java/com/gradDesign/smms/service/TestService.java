package com.gradDesign.smms.service;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.gradDesign.smms.dao.UserLoginDao;
import com.gradDesign.smms.domain.UserLogin;

@Service("testService")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("spring.xml")
public class TestService {
	@Resource
	private UserLoginDao userLoginDao;
	
	//测试事务
	@Transactional
	public void saveTwo(){
		UserLogin ul = new UserLogin();
		ul.setEmpId("test");
		ul.setPassword("passwordtest");
		userLoginDao.save(ul);
		//int i=1/0;
		userLoginDao.save(new UserLogin());
	}
	
	@Transactional
	public void saveUsers25() {
		for (int i = 0; i < 25; i++) {
			UserLogin user = new UserLogin();
			String str = "test_" + ('A' + i);
			user.setEmpId(str);
			user.setPassword(DigestUtils.md5Hex(str));
			userLoginDao.save(user);
		}
	}
}
