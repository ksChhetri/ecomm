<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.css">
<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.min.css">
<link rel="stylesheet" href="${resourceUrl}/css/style.css">
<script type="text/javascript"  src="${resourceUrl}/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<div class="container">
			<h1>Customer Profile Page</h1>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="table-responsive">
				<table class="table table-striped">
					<tr>
						<td><strong>Name: </strong></td>
						<td>${customer.firstName} ${customer.lastName}</td>						
					</tr>
					<tr>
						<td><strong>Email:</strong></td>
						<td>${customer.email}</td>						
					</tr>
					<tr>
						<td><strong>Mobile: </strong></td>
						<td>${customer.mobile}</td>						
					</tr>
				</table>
			</div>
		</div>
		<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>