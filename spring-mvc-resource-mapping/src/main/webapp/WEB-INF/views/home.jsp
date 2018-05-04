<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/resources" var="resourceUrl" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Home Page</title>
	<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.min.css">
	<script type="text/javascript" src="${resourceUrl}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${resourceUrl}/js/jquery-1.11.1.min.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1 style="color:#F00;">Spring MVC Resource Mapping</h1>
		<p>In this application we have discussed Spring MVC Resource Mapping</p>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-3">
				<img class="img-thumbnail" src="${resourceUrl}/images/4_1.jpg">
			</div>
			<div class="col-sm-3">
				<img class="img-thumbnail" src="${resourceUrl}/images/4_2.jpg">
			</div>
			<div class="col-sm-3">
				<img class="img-thumbnail" src="${resourceUrl}/images/4_3.jpg">
			</div>
			<div class="col-sm-3">
				<img class="img-thumbnail" src="${resourceUrl}/images/4_5.jpg">
			</div>
		</div>
	</div>
	
</body>
</html>