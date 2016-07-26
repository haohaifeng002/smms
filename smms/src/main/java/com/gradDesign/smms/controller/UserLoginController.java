package com.gradDesign.smms.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gradDesign.smms.domain.UserLogin;
import com.gradDesign.smms.service.UserLoginService;

public class UserLoginController {
	 private static final Logger LOGGER = Logger.getLogger(UserLoginController.class);  
     
	    @Autowired  
	    private UserLoginService userLoginService;  
	      
	    @RequestMapping("/showInfo/{loginId}")  
	    public String showUserInfo(ModelMap modelMap, @PathVariable String loginId){  
	        LOGGER.info("查询用户：" + loginId);  
	        UserLogin userInfo = (UserLogin) userLoginService.load(loginId);  
	        modelMap.addAttribute("userInfo", userInfo);  
	        return "/user/showInfo";  
	    }  
	      
	    @RequestMapping("/showInfos")  
	    public @ResponseBody List<UserLogin> showUserInfos(){  
	        LOGGER.info("查询用户全部用户");  
	        List<UserLogin> userInfos = userLoginService.findAll();  
	        return userInfos;  
	    }  
}
