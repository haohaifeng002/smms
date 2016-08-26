package com.gradDesign.smms.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * todo 获取smms.properties中的全局配置信息
 * 
 * @author hhf
 * 
 */
public class GlobalArgsUtils {

	//日志
	private static Logger LOG = LoggerFactory.getLogger(GlobalArgsUtils.class);
	//配置文件路径
	private static final String SMMS_CONF_PATH = "/smms.properties";
	
	//具体属性
	private static String LOGIN_INFO_CACHE_METHOD;
	
	//缓存
	
	
	static {
		Properties prop = new Properties();
		InputStream in = GlobalArgsUtils.class.getResourceAsStream(SMMS_CONF_PATH);
		try {
			prop.load(in);
			LOGIN_INFO_CACHE_METHOD = prop.getProperty("loginInfoCacheMethod").trim();
		} catch (IOException e) {
			e.printStackTrace();
			LOG.error("error info:"+e);
		}
	}

	
	

	public static void main(String[] args) {
		if("".equals(LOGIN_INFO_CACHE_METHOD)){
			System.out.println("LOGIN_INFO_CACHE_METHOD ="+LOGIN_INFO_CACHE_METHOD);
		}
	}
	
	
	public GlobalArgsUtils() {

	}

	public GlobalArgsUtils(String key) {

	}
}
