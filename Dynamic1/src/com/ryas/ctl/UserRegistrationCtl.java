package com.ryas.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.sendRedirect("UserRegistration.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		RequestDispatcher rd = req.getRequestDispatcher("UserRegistration.jsp");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("in userRegistration doPost");

		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String phoneNo = req.getParameter("phoneNo");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(loginId);
		System.out.println(password);
		System.out.println(phoneNo);
		System.out.println(dob);
		System.out.println(gender);

		bean.setFirstName(fname);
		bean.setLastName(lname);
		bean.setLoginId(loginId);
		bean.setPassword(password);
		bean.setPhoneNo(phoneNo);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bean.setGender(gender);

		try {
			model.add(bean);
			req.setAttribute("succ", "Data added successfully...");
			rd.forward(req, resp);
		} catch (Exception e) {
			req.setAttribute("error", "Data not added successfully...");
			rd.forward(req, resp);
			e.printStackTrace();
		}

	}

}
