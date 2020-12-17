package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Examplejdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Statement st = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "Rootpassword");
			st = con.createStatement();
			rs = st.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getInt(2 + rs.getInt(3)));
			}
		} catch (Exception ae) {
			System.out.println(ae);
		}
	}

}
