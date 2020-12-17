package com.src.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.src.model.DbCredentials;

public class DBUtil {

	public static final Connection getConnection(String driver, String url, String uname, String pwd) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "Rootpassword");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static DbCredentials getCredentials() {
		Properties properties = null;
		DbCredentials credentials = null;
		try {
			properties = new Properties();
			properties.load(new FileInputStream("database.properties"));
			credentials = new DbCredentials();
			credentials.setDriver(properties.getProperty("driver"));
			credentials.setUrl(properties.getProperty("url"));
			credentials.setUname(properties.getProperty("uname"));
			credentials.setPwd(properties.getProperty("pwd"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return credentials;
	}

}