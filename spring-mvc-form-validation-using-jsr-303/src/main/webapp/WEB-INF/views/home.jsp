<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CodingRAJA Home</title>
<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.css">
<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.min.css">
<link rel="stylesheet" href="${resourceUrl}/css/style.css">
<script type="text/javascript"  src="${resourceUrl}/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>CodingRAJA Home Page</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
		<div class="col-md-4">
			<c:url value="/customer/register" var="registerUrl" />
			<a class="btn btn-danger" href="<c:url value="/customer/login" />">Login</a>
			<a class="btn btn-danger" href="${registerUrl}">Register</a>
		</div>
		<div class="col-md-4"></div>
		</div>
	</div>
</body>
</html>