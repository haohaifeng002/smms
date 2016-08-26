1、因为jar包比较新，比如commons-codec 用的最新版的commons-codec1.10 要求使用jdk1.6（包括1.6）以上版本
2、日志用slf4j日志框架吧：
			import org.slf4j.Logger;
			import org.slf4j.LoggerFactory;

-------2016081 --hhf
1、spring-hibernate.xml取代hibernate.cfg.xml配置。hibernate.cfg.xml配置无效
2、domain改为用jpa注解方式对象关系映射。spring-hibernate.xml使用<property name="packagesToScan">扫描domain     domain中的*.hbm.xml配置无效        
3、运行/smms/src/test/java/com/gradDesign/smms/service/TestConn.java可生成对应的数据库表结构

-------2016-08-22 12:35:20  hhf------
1、GlobalArgsUtils.java类可读取全局配置参数smms.properties
2、/smms/src/main/webapp/html/index.html是首页布局展示的静态页面，由easyUI的几种布局和ztree构成
