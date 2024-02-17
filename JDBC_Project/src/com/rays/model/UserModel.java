package com.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.rays.bean.UserBean;

public class UserModel {

	public void add(UserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		System.out.println("Connection successfully........");

		PreparedStatement psmt = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");

		psmt.setInt(1, bean.getId());
		psmt.setString(2, bean.getFirstName());
		psmt.setString(3, bean.getLastName());
		psmt.setString(4, bean.getLoginId());
		psmt.setString(5, bean.getPassword());
		psmt.setString(6, bean.getGender());
		psmt.setDate(7, new java.sql.Date(bean.getDob().getTime()));

		int i = psmt.executeUpdate();

		conn.close();
		psmt.close();

		System.out.println("data insert successfully in model");

	}

}
