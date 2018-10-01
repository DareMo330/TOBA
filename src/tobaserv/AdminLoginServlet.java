package tobaserv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//create variables 
		String url = "/login.html"; //url to redirect to
		 
		//find the current action
	     String action = request.getParameter("action");
	    //set default action
	     if (action == null) {
	    	 action = "login";  
	    	 }
	    //perform action
	    if (action.equals("login")) { 
			//get username and password entered from form
			 String username = request.getParameter("username");
			 String password = request.getParameter("password");
			
			 //validate entered info, if correct redirect to account page
			 if(username.equals("jsmith@toba.com") && password.equals("letmein")) {
				 url = "login.html";
			 }
			 //if failed redirect to login fail page
			 else {
				 url = "login_error.html";
			 }
	    }
	    response.sendRedirect(url);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
