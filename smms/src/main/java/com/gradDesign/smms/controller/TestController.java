package com.gradDesign.smms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	public static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	//http://localhost:8080/smms/test/demo1.do?name=zhangsan
	@RequestMapping(value="demo1.do",method=RequestMethod.GET)
	@ResponseBody
	public String testDemo1(@RequestParam("name") String name){
	
		log.info("the demo1 name is: {}",name);
		return "name:"+name;
	}
	
	// http://localhost:8080/smms/test/demo2/zhangsan.do
	@RequestMapping("/demo2/{name}.do")
	@ResponseBody
	public String testDemo2(@PathVariable("name") String name){
		log.info("the demo2 name is:{}",name);
		return "the demo2 name is"+name;
	}
}
