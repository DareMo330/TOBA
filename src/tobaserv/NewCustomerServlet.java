package tobaserv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tobaserv.User;


public class NewCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//initialize variables 
		 String url = "/new_customer.jsp";
		 HttpSession session = request.getSession();
		 
			//find the current action
		     String action = request.getParameter("action");
		    //set default action
		     if (action == null) {
		    	 action = "signup";  
		    	 }
		    if (action.equals("signup")) {
				//get form parameters
				 String firstName = request.getParameter("firstName");
				 String lastName = request.getParameter("lastName");
				 String phone = request.getParameter("phone");
				 String address = request.getParameter("address");
				 String city = request.getParameter("city");
				 String state = request.getParameter("state");
				 String zipcode = request.getParameter("zipcode");
				 String email = request.getParameter("email");
				 //create message variable
				 String message;
				 if (firstName == null || lastName == null || phone == null || address == null || city == null || state == null ||  zipcode == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zipcode.isEmpty() || email.isEmpty()) {
					 message = "Please fill out all fields.";
		             url = "/new_customer.jsp"; 
				 }
				 else {
					 
					 message = "";
					 //create user object
					 String username = String.join("", lastName, zipcode);
					 User user = new User(firstName, lastName, phone, address, city, state, zipcode, email, username, "welcome1");
					 session.setAttribute("user", user);
					 //make user an account object as well
					 Account account = new Account(user, 25.00);
					 session.setAttribute("account", account);
					 //add user to database
					 //UserDB.insert(user);
					 //redirect to success page
					 url = "/success.jsp";
				 }
				 request.setAttribute("message", message);
				 
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
