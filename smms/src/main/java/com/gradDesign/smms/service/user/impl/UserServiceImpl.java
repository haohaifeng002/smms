package com.gradDesign.smms.service.user.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.gradDesign.smms.dao.user.EmpInfoDao;
import com.gradDesign.smms.dao.user.UserLoginDao;
import com.gradDesign.smms.domain.EmpInfo;
import com.gradDesign.smms.domain.UserLogin;
import com.gradDesign.smms.service.base.BaseService;
import com.gradDesign.smms.service.user.UserService;

@Service("userService")
public class UserServiceImpl extends BaseService<UserLogin> implements UserService{
	
	@Resource
	private UserLoginDao userLoginDao;
	
	@Resource
	private EmpInfoDao empInfoDao;
	
	/**
	 * 登录判断.
	 * @param userLogin 登录对象
	 * @return result
	 */
	public UserLogin login(UserLogin userLogin) {
		UserLogin result = null;
		List<UserLogin> userLoginList = userLoginDao.getByName(userLogin);
		
		String pmmd = DigestUtils.md5Hex(userLogin.getPassword());
		Iterator<UserLogin> it = userLoginList.iterator();
		while(it.hasNext()){
			UserLogin user = it.next();
			if(pmmd.equals(user.getPassword())){
				result = user;
				break;
			}
		}
		return result;
	}
	
	/**
	 * 名称查找是否存在用户.
	 * @param userLogin 登录对象
	 * @return result
	 */
	public String getByName(UserLogin userLogin) {
		
		String result = "";
		List<UserLogin> userLoginList = userLoginDao.getByName(userLogin);
		if(userLoginList!=null && userLoginList.size()!=0){
			result = "ok";
		}
		return result;
	}
	
	/**
	 * 保存用户
	 */
	@Override
	@Transactional
	public void saveUser(UserLogin userLogin,EmpInfo empInfo) {
		if(userLogin !=null && empInfo != null){
			empInfoDao.save(empInfo);
			//int i = 1/0;
			userLoginDao.save(userLogin);
		}
	}
	
	
}
