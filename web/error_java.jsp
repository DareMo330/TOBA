<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
	<h1>Java Error</h1>
	<p> a Java exception has been thrown. Please try again.</p>
	
	<h2> Detailed Information: </h2>
	<p>Type: {pageContext.exception["class"]}</p>
	<p>Message: {pageContext.exception.message} </p>
	
	<a href="index.jsp"> Go Back </a>
<c:import url="footer.jsp" />