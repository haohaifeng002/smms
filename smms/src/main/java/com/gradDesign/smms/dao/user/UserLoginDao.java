package com.gradDesign.smms.dao.user;

import java.util.List;

import com.gradDesign.smms.base.GenericDao;
import com.gradDesign.smms.domain.UserLogin;

/**
 * @author haohaifeng
 *
 */
public interface UserLoginDao extends GenericDao<UserLogin> {
	
	public List<UserLogin> getByName(UserLogin userLogin);
}
