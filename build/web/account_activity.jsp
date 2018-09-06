<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
	<h1>Account Activity</h1>
	<c:if test="${sessionScope.user != null }">
		<p> Hello, ${sessionScope.user.firstName } ${sessionScope.user.lastName }!</p>
	</c:if>
	<c:if test="${sessionScope.user == null }">
		<p> You are not logged in.</p>
	</c:if>
	<a href="index.jsp"> Go Back </a>
<c:import url="footer.jsp" />