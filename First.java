package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class First {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "Rootpassword");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into student values(3,'ak','chennai')");
		stmt.executeUpdate("delete from student where id=3");
		ResultSet rs = stmt.executeQuery("select * from student");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		rs.close();
		stmt.close();
		con.close();
	}
}