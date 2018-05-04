<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>Customer Module</h1>
	<c:url value="/register" var="regPage" />
	<a href="${regPage}">Register Here</a>
</body>
</html>
