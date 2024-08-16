package userservlet.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cycle")
public class LifeCycleOfServlet  extends GenericServlet{
	
	static {
		System.out.println("class loading");
	}																																																																	
	
	public LifeCycleOfServlet() {
		System.out.println("instantiation");
	}
	public void init() throws ServletException {
		System.out.println("initialization");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service phase");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
		
	}
	
	
	

}

//class loading
//instantiation
//initialization
//service phase



