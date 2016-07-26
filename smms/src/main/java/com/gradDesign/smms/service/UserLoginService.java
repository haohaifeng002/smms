package com.gradDesign.smms.service;

import java.util.List;

import com.gradDesign.smms.domain.UserLogin;

public interface UserLoginService {
	public String save(UserLogin userLogin);
	public List<UserLogin> findAll();
	public UserLogin load(String loginId);
}
