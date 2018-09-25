<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
	<h1> Transactions</h1>
	<p>${sessionScope.transactions}</p>
	<a href="index.jsp"> Go Back </a>
<c:import url="footer.jsp" />