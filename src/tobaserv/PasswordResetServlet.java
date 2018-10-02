package tobaserv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tobaserv.User;


public class PasswordResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//initialize variables 
		 String url = "/password_reset.jsp";
		 HttpSession session = request.getSession();
		 //find the current action
		 String action = request.getParameter("action");
		 //set default action
		 if (action == null) {
			 action = "changepass";  
		 }
		 if (action.equals("changepass") && session.getAttribute("user") != null) {
			 //get password from form
			 String password = request.getParameter("password");
			 //get user object
			 User user = (User) session.getAttribute("user");
			 //change password
			 user.setPassword(password);
			 session.setAttribute("user", user);
		//set in database
			 //UserDB.update(user);
		 //redirect to account activity page
		 url = "/account_activity.jsp";
		 }
		 getServletContext()
		 .getRequestDispatcher(url)
		 .forward(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
