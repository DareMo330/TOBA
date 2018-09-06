<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
	<h1>Sign Up</h1>
	<p> Please fill out the form below to create your TOBA account.</p>
	<p><i>${message}</i></p>
	<form action="new_customer" method="post">
		<label>First Name:</label>
		<input type="hidden" name="action" value="signup">
		<input type="text" name="firstName"><br>
		<label>Last Name:</label>
		<input type="text" name="lastName"><br>
		<label>Phone Number:</label>
		<input type="text" name="phone"><br>
		<label>Address:</label>
		<input type="text" name="address"><br>
		<label>City:</label>
		<input type="text" name="city"><br>
		<label>State:</label>
		<input type="text" name="state"><br>
		<label>Zipcode:</label>
		<input type="text" name="zipcode"><br>
		<label>E-Mail:</label>
		<input type="email" name="email"><br>
		<input type="submit" value="Sign Up" id="signup">
	</form>	
	<a href="login.jsp"> Go Back </a>
<c:import url="footer.jsp" />