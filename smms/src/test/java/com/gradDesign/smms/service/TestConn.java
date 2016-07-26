package com.gradDesign.smms.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")  
public class TestConn {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Test
	public void connTest(){
		Session session = sessionFactory.getCurrentSession();
		System.out.println(session);
	}
}
