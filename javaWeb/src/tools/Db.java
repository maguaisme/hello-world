package tools;

import java.io.FileInputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public class Db {
	protected DataSource ds = null;
	
	public void getDs() {
		Properties pp = new Properties();
		try {
		pp.load(Db.class.getClassLoader().getResourceAsStream("db.properties"));
		ds = DruidDataSourceFactory.createDataSource(pp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
