package com.gradDesign.smms.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gradDesign.smms.domain.UserLogin;
import com.gradDesign.smms.service.user.UserService;
import com.gradDesign.smms.utils.DateUtil;
import com.gradDesign.smms.utils.StringUtil;

@Controller
@RequestMapping("/userController")
public class UserController {
	private static final Logger LOGGER = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	
	/**
	 * 登录验证处理
	 * @param userLogin
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "loginValid.do", method = RequestMethod.POST)
	@ResponseBody
	public String loginValid(@RequestBody UserLogin userLogin,HttpSession session) {
		String resultStr = "";
		try {
			userLogin = userService.login(userLogin);	//根据userLogin中的用户名和密码从数据库中查值，并重新给userLogin赋值
		} catch (Exception e) {
			e.printStackTrace();
			// 错误栈信息输出到log日志中
			// StringWriter sw = new StringWriter();
			// e.printStackTrace(new PrintWriter(sw, true));
			// LOGGER.error("IOException : " + sw.toString());
			LOGGER.error("selectException : {}", e);
		}
		if (userLogin == null) {
			resultStr = "用户名或密码错误！";
		}else{
			
			String loginTime = userLogin.getLoginTime();
			String lastLoginTime = userLogin.getLastLoginTime();
			//记录最近一次登陆时间和本次登陆时间
			//如果是第一次登陆，两个时间都是空的
			if(StringUtil.isBlank(loginTime) && StringUtil.isBlank(lastLoginTime)){
				lastLoginTime = DateUtil.getCurDateTimes();
				loginTime = lastLoginTime;
			}else{
				lastLoginTime = loginTime;
				loginTime = DateUtil.getCurDateTimes();
			}
			userLogin.setLastLoginTime(lastLoginTime);
			userLogin.setLoginTime(loginTime);
			userService.save(userLogin);
			session.setAttribute("userLogin", userLogin);			//用户登录信息添加到session
			resultStr = "ok";										//设置返回字符串
		}
		return resultStr;
	}
	
	/**
	 * 跳转到登录页面
	 * @return
	 */
	@RequestMapping("login.do")
	public String index(){
		return "login";
	}
	
	/**
	 * 跳转到首页
	 * @return
	 */
	@RequestMapping("index.do")
	public String index(HttpSession session, ModelMap model){
		//跳转时携带登录名参数
		UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");
		model.put("userLogin", userLogin);
		return "index";
	}
	
	/**
	 * 注销
	 * @param session
	 * @return
	 */
	@RequestMapping("logOut.do")
	public String logOut(HttpSession session){
		session.removeAttribute("userLogin");
		return "login";
	}
}
