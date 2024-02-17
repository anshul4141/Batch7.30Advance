package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ncs", "root", "root");

		Statement stmt = conn.createStatement();

		System.out.println("Connection successfully........");

		ResultSet rs = stmt.executeQuery("select * from employee");

		while (rs.next()) {

			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getInt(3));
			//System.out.println("\t" + rs.getString(4));

		}

		stmt.close();
		conn.close();

	}

}
