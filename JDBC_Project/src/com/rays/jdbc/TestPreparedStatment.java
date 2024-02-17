package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPreparedStatment {

	public static void main(String[] args) throws Exception {

//		add(7, "Lavish", 107, 33, 42, 31);
//		search();
//		update(3, "Kuldeep", 103, 45, 72, 63);
//		delete(2);
//		findById(2);
		meritList();

	}

	private static void meritList() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement(
				"select name, rollNo, maths, chemistry, physics,(maths+chemistry+physics) as total from marksheet where maths >=33 and chemistry >=33 and physics >=33 order by total desc limit 0,3");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			System.out.print(rs.getString(1));
			System.out.print("\t " + rs.getInt(2));
			System.out.print("\t" + rs.getInt(3));
			int maths = rs.getInt(3);
			System.out.print("\t" + rs.getInt(4));
			int chemistry = rs.getInt(4);
			System.out.print("\t" + rs.getInt(5));
			int physics = rs.getInt(5);
			int total = maths + chemistry + physics;
			System.out.print("\t" + (total));
			float p = ((total * 100) / 300);
			System.out.println("\t" + p + "%");

		}

		conn.close();
		ps.close();

	}

	private static void add(int id, String name, int rollNo, int maths, int chemistry, int physics) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, rollNo);
		ps.setInt(4, maths);
		ps.setInt(5, chemistry);
		ps.setInt(6, physics);

		int i = ps.executeUpdate();

		conn.close();
		ps.close();

		System.out.println("Data inserted Successfullyy..." + i);

	}

	private static void search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			System.out.print(rs.getInt(1));
			System.out.print("\t " + rs.getString(2));
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));

		}

		conn.close();
		ps.close();

	}

	private static void update(int id, String name, int rollNo, int maths, int chemistry, int physics)
			throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement(
				"update marksheet set name = ?, rollNo = ?,  maths = ?, chemistry = ?, physics = ? where id = ?");

		ps.setString(1, name);
		ps.setInt(2, rollNo);
		ps.setInt(3, maths);
		ps.setInt(4, chemistry);
		ps.setInt(5, physics);
		ps.setInt(6, id);

		int i = ps.executeUpdate();

		conn.close();
		ps.close();

		System.out.println("Data Update Successfullyy..." + i);

	}

	private static void delete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");

		ps.setInt(1, id);

		int i = ps.executeUpdate();

		if (i != 0) {

			System.out.println("Data Delete successfully " + i);

		} else {
			System.out.println("Data dose not delelte " + i);
		}

		conn.close();
		ps.close();

	}

	private static void findById(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = ?");

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			System.out.print(rs.getInt(1));
			System.out.print("\t " + rs.getString(2));
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));

		}

		conn.close();
		ps.close();

	}

}
