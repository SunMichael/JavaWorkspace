package com.runoob.sun;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class MySqlDemo {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/Runoob?useSSL=false";
	
	static final String USER = "root";
	static final String PASS = "sun1992";
	
	public static void main(String[] args) throws ClassNotFoundException {
		Connection cnt = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("连接数据库...");
			
			cnt = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("实例化statement...");
			stmt = (Statement) cnt.createStatement();
			String sql;
			sql = "SELECT id, name, url FROM websites";
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("查询数据库..." + rs);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String url = rs.getString("url");
				System.out.println("name:" + name + "\nurl:"+ url);
			}
			rs.close();
			stmt.close();
			cnt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
		finally {
			try {
				if (stmt != null) stmt.close();
				}catch (SQLException e) {
					
				}
		}
		System.out.println(" close db");
	}
	
}
