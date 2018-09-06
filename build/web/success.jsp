<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
	<p> Your TOBA account has been successfully created. Here is your account information:</p>
	<label>First Name:</label>
	<span>${sessionScope.user.firstName }</span><br>
	<label>Last Name:</label>
	<span>${sessionScope.user.lastName }</span><br>
	<label>Phone Number:</label>
	<span>${sessionScope.user.phone }</span><br>
	<label>Address:</label>
	<span>${sessionScope.user.address }</span><br>
	<label>City:</label>
	<span>${sessionScope.user.city }</span><br>
	<label>State:</label>
	<span>${sessionScope.user.state }</span><br>
	<label>Zipcode:</label>
	<span>${sessionScope.user.zipcode }</span><br>
	<label>E-mail:</label>
	<span>${sessionScope.user.email }</span><br>
	<label>Username:</label>
	<span>${sessionScope.user.username }</span><br>
	<label>Password:</label>
	<span>${sessionScope.user.password }</span><br>
	<p> Thank you for using our service.</p>
	<a href="index.jsp"> Go Back </a>
<c:import url="footer.jsp" />