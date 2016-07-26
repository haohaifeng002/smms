package com.gradDesign.smms.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**
	 * 通过java.util.Date获取日期时间
	 * @return
	 */
	public static String getCurDateTimes(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String curDateTime = df.format(new Date());
		return curDateTime;
	}
	
	public static String getCurDate(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String curDate = df.format(new Date());
		return curDate;
	}
	
	public static String getCurTime(){
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		String curTime = df.format(new Date());
		return curTime;
	}
	
//	public Date getCurTimes(){
//		Date now = new Date();
//		Calendar cal = Calendar.getInstance();
//		DateFormat df = DateFormat.getDateInstance();
//		DateFormat df = DateFormat.getDateTimeInstance();
//		String str = df.format(now);
//		return str;
//		return cal.getTime();
//	}
	
	/**
	 * 通过java.sql.Date获取日期时间
	 */
	public static java.sql.Date getDate(){
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		return currentDate;
	}
	
	public static java.sql.Time getTime(){
		java.sql.Time time = new java.sql.Time(System.currentTimeMillis());
		return time;
	}
	
// 	public static void main(String[] args) {
//	UtilTools t = new UtilTools();
//	System.out.println(t.getTime());
//	}
}
