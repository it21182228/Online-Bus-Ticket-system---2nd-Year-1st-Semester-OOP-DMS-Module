package com.userView;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userInsertServlet")
public class userInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String in;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String userid, String username) throws ServletException, IOException {
	
		String id = request.getParameter("userid");
		String name = request.getParameter("username");
		String inquiries = request.getParameter("in");
		String type = request.getParameter("type");
		
		
		boolean yes;
		yes = UserViewDB.insertUser(id, name, inquiries, type);
		
		if(yes == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("insertSuccess.jsp");
			dis.forward(request, response);
		}
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("Unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
		
		
	}

}
