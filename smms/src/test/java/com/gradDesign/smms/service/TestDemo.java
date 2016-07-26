package com.gradDesign.smms.service;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestDemo {
	public static  final Logger log = Logger.getLogger(TestDemo.class);
	@Test
	public void testDem(){
		double d1=3L,d2=0L;
		Double d3 = new Double(3L);
		if( d3 == d1){
			log.info("d1 == d2");
		}
		
	}
	
}
