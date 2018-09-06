package tobaserv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String url = "/new_customer.jsp";
		 
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
					 //redirect to success page
					 message = "";
					 url = "/success.html";
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
