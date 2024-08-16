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

@WebServlet("/update")
public class UpdateUser extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String value = req.getParameter("id");
		 userDao dao=new userDao();
		 System.out.println(value);
		User db = dao.fetchUserById(Integer.parseInt(value));
		if(db!=null) {
		 req.setAttribute("user",db);
		 RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
			dispatcher.forward(req, resp);
		}
	}
	

}
