<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
	<h1> Login</h1>
	<p> Please sign in to your TOBA account here. </p>
	<form action="login" method="post">
		<input type="hidden" name="action" value="login">
		<label>Username:</label>
		<input type="text" name="username" required><br>
		<label>Password:</label>
		<input type="password" name="password" required><br>
		<input type="submit" value="Log In" id="login">
	</form>	
	<a href="password_reset.jsp">Reset Password</a>
	<p> If you do not currently have a TOBA account, you can <a href="new_customer.jsp"> sign up here.</a></p>
	<a href="index.jsp"> Go Back </a>
<c:import url="footer.jsp" />