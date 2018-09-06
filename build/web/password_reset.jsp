<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
	<h1>Password Reset</h1>
	<p> Enter a new password. </p>
	<form action="password_reset" method="post">
		<input type="hidden" name="action" value="changepass">
		<label>Password:</label>
		<input type="text" name="password" value="${sessionScope.user.password}" required><br>
		<input type="submit" value="Reset" id="account_activity">
	</form>	
	<a href="login.jsp"> Go Back</a>
<c:import url="footer.jsp" />