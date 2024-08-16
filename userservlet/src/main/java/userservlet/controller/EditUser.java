package userservlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userservlet.dao.userDao;
import userservlet.dto.User;
@WebServlet("/update1")
public class EditUser  extends HttpServlet{
	UpdateUser ud = new UpdateUser();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String fName = req.getParameter("fName");
		String lName = req.getParameter("lName");
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");
		String gender = req.getParameter("gender");
		String phone = req.getParameter("phone");
		String age = req.getParameter("age");
		int id1=Integer.parseInt(id);
		int age1 = Integer.parseInt(age);
		long phone1 = Long.parseLong(phone);
		User user=new User(id1,fName,lName,email,pwd,gender,phone1,age1);
			userDao dao=new userDao();
			dao.updateUser(user);
			req.setAttribute("user",dao.fetchAllData());
			 RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
			dispatcher.include(req, resp);
	}
	
}
