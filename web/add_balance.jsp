<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
	<h1>Add Balance</h1>
	<p> Add funds to your account. </p>
	<form action="add_balance" method="post">
		<input type="hidden" name="action" value="addbal">
		<label>Balance</label>
		<input type="number" name="Balance" required><br>
		<input type="submit" value="Add Balance" id="account_activity">
	</form>	
	<a href="login.jsp"> Go Back</a>
<c:import url="footer.jsp" />