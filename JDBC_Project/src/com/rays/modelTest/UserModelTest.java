package com.rays.modelTest;

import java.text.SimpleDateFormat;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

public class UserModelTest {

	public static void main(String[] args) throws Exception {

		testAdd();

	}

	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

		UserBean bean = new UserBean();

		bean.setId(2);
		bean.setFirstName("Shivam");
		bean.setLastName("Gupta");
		bean.setLoginId("Shivam@gmail.com");
		bean.setPassword("shivam123");
		bean.setGender("male");
		bean.setDob(sdf.parse("01-25-2001"));

		UserModel model = new UserModel();

		model.add(bean);

		System.out.println("data inserted successfully in test.........");

	}

}
