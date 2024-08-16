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

@WebServlet("/login")
public class LoginUser extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");
		
		System.out.println(	email + pwd);
		userDao dao = new userDao();//UserDao
		try {
			User db = dao.fetchbyEmail(email);
			if(db.getPwd().equals(pwd)) {
//				req.setAttribute("user", db);
				req.setAttribute("user", dao.fetchAllData());
//				System.out.println("login success");
				RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
				dispatcher.forward(req, resp);
			}else {
				req.setAttribute("msg","password is wrong");
//				System.out.println("pwd is wrong");
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.include(req, resp);
			}
		}catch(Exception e) {
			req.setAttribute("msg","email does not exist");
//			System.out.println("Email doesnt exist");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
		
		
//		super.doPost(req, resp);
		
	}
	
	
	

}
//Http servlet  -> doPost method to accept only post requests
//service will accept both post and get requests
//to hide url use http servlet for login
//errors important
//
//405 -> method not allowed
//404 -> file not found
//500 -> internal serval error
//check maven exist or not in build path
//run that form which we want output dont run controller
