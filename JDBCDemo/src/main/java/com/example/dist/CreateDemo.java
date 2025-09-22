package com.example.dist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/test_db";
		String username = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Connection successful.");

	}

}
