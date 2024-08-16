package userservlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import userservlet.dao.userDao;
import userservlet.dto.User;

@WebServlet("/register")

public class RegisterUser extends GenericServlet {
	
	   
		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			 String fName = req.getParameter("fName");
				String lName = req.getParameter("lName");
				String email = req.getParameter("email");
				String pwd = req.getParameter("pwd");
				String age = req.getParameter("age");
				String phone = req.getParameter("phone");
				String gender = req.getParameter("gender");
				
				userDao dao = new userDao();
				try {
				dao.saveUser(new User(fName,lName,email,pwd,gender,Long.parseLong(phone),Integer.parseInt(age)));
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req,res);
				}catch(Exception e) {
					RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
					dispatcher.include(req, res);
				}
		
				

		}
}
				
				
				
				
		
//			System.out.println(fName+lName+email+age+pwd+phone+gender);
//				
//				PrintWriter out = res.getWriter();
//				out.print(fName + "registration done successfully");
//			
		
		
	
		
	
	


