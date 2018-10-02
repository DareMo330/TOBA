package tobaserv;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tobaserv.Account;


public class AddBalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//initialize variables 
		 String url = "/add_balance.jsp";
		 HttpSession session = request.getSession();
		 
			//find the current action
	     String action = request.getParameter("action");
	    //set default action
	     if (action == null) {
	    	 action = "addbal";  
	    	 }
	    if (action.equals("addbal") && session.getAttribute("account") != null) {
			//get password from form
			 double balance = Double.valueOf(request.getParameter("balance"));
			//get account object
			Account account = (Account) session.getAttribute("account");
			//add balance
			account.setBalance(account.getBalance()+balance);
			session.setAttribute("account", account);
			//create transaction object
			Transaction trans = new Transaction(account, "Add Balance", balance);
			//set in database
			//AccountDB.update(account);
			//AccountDB.addTrans(trans);
			//update transactions
			if(session.getAttribute("transactions") != null) {
			List<Transaction> transactions = (List<Transaction>) session.getAttribute("transactions");
			transactions.add(trans);
			session.setAttribute("transactions", transactions);
			}
			else {
				List<Transaction> transactions = null;
				transactions.add(trans);
				session.setAttribute("transactions", transactions);
			}
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