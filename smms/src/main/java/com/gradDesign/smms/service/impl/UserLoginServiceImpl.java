package com.gradDesign.smms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gradDesign.smms.dao.UserLoginDao;
import com.gradDesign.smms.domain.UserLogin;
import com.gradDesign.smms.service.UserLoginService;

/**
 * @author haohaifeng
 *
 */
@Transactional
@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	private UserLoginDao userLoginDao;
	
	public String save(UserLogin userLogin) {
		return (String) userLoginDao.save(userLogin);
	}

	public List<UserLogin> findAll() {
		return userLoginDao.findAll();
	}
	
	public UserLogin load(String loginId){
		
		UserLogin userLogin = null;
		try {
			userLogin = userLoginDao.load(loginId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userLogin;
	}
}
