package com.gradDesign.smms.dao.user.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gradDesign.smms.base.GenericDaoImpl;
import com.gradDesign.smms.dao.user.UserLoginDao;
import com.gradDesign.smms.domain.UserLogin;

/**
 * @author hhf
 * @param <Serializable>
 *
 */
@Repository("userLoginDao")
public class UserLoginDaoImpl extends GenericDaoImpl<UserLogin> implements UserLoginDao {

	@Override
	public List<UserLogin> getByName(UserLogin userLogin) {
		
		String name = userLogin.getEmpName();
		String hql = "from UserLogin u where u.empName = ?";
		List<UserLogin> userLoginList = (List<UserLogin>) getHibernateTemplate().find(hql, new Object[]{name});
		return userLoginList;
	}
}
