package com.gradDesign.smms.dao.impl;

import org.springframework.stereotype.Repository;

import com.gradDesign.smms.base.GenericDaoImpl;
import com.gradDesign.smms.dao.UserLoginDao;
import com.gradDesign.smms.domain.UserLogin;

/**
 * @author hhf
 * @param <Serializable>
 *
 */
@Repository("userLoginDao")
public class UserLoginDaoImpl extends GenericDaoImpl<UserLogin> implements UserLoginDao {
 
		
}
