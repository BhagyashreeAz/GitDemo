package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection;
	public static Connection getConnection()
	{
		try {
			if(connection == null|| connection.isClosed())
			{
				new DBConnection();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	private DBConnection()
	{
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String userName="chakuli123";
		String password="chakuli123";
		String url="jdbc:sqlserver://USER-PC\\SQLEXPRESS"+";databaseName=StudentDB";
		
			connection=DriverManager.getConnection(url,userName,password);
		}
		catch (ClassNotFoundException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex);
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
