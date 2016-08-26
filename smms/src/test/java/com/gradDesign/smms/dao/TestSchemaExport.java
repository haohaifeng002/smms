package com.gradDesign.smms.dao;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

/**
 * 此方法需要*.cfg.xml支持，hibernate和spring整合后已废弃，
 * @author hhf
 *
 */
@SuppressWarnings("deprecation")
public class TestSchemaExport {
	
	@Test
	public void createTable(){
		
		Configuration config = new Configuration().configure();
		@SuppressWarnings("deprecation")
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		SchemaExport export = new SchemaExport(config);
		export.create(true,true);
	}
}
