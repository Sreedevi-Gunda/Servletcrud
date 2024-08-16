package userservlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userservlet.dao.userDao;

@WebServlet("/delete")
public class DeleteUser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String value = req.getParameter("id");
		 userDao dao=new userDao();
		 System.out.println(value);
		 dao.deleteUser(Integer.parseInt(value));
		 req.setAttribute("user",dao.fetchAllData());
		 RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
		dispatcher.include(req, resp);
		 

		
	}

}
////TODO Auto-generated method stub
//		super.doGet(req, resp);