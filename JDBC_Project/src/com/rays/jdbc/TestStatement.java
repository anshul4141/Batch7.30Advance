package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestStatement {

	public static void main(String[] args) throws Exception {

//		add();
//		search();
//		Update();
		delete();

	}

	private static void add() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		System.out.println("connection successfully.....");

		Statement st = conn.createStatement();

		String sql = "insert into marksheet values(2,'Demo',102,72,65,54)";

		int i = st.executeUpdate(sql);

		System.out.println("Data Inserted " + i);

	}

	private static void search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		System.out.println("connection successfully.....");

		Statement st = conn.createStatement();

		String sql = "select * from marksheet";

		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {

			System.out.println("id     " + "name  " + "rollNo    ");
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));

		}

	}

	private static void Update() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		System.out.println("connection successfully.....");

		Statement st = conn.createStatement();

		String sql = "update marksheet set name = 'Pawan' where id = 1";

		int i = st.executeUpdate(sql);

		System.out.println("Data Updated Successfulyy..." + i);

	}

	public static void delete() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		System.out.println("connection successfully.....");

		Statement st = conn.createStatement();

		String sql = "delete from marksheet where rollNo = 102";

		int i = st.executeUpdate(sql);

		System.out.println("Data Deleted Successfulyy..." + i);

	}

}
