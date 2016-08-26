package com.gradDesign.smms.service.user;

import com.gradDesign.smms.base.GenericDao;
import com.gradDesign.smms.domain.EmpInfo;
import com.gradDesign.smms.domain.UserLogin;

public interface UserService extends GenericDao<UserLogin>{
	public UserLogin login(UserLogin userLogin);
	public String getByName(UserLogin userLogin);
	public void saveUser(UserLogin userLogin,EmpInfo empInfo);
}
