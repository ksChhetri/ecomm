<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List Page</title>
<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.css">
<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.min.css">
<link rel="stylesheet" href="${resourceUrl}/css/style.css">
<script type="text/javascript"  src="${resourceUrl}/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Customer List Page &nbsp;&nbsp;&nbsp;&nbsp;
			<c:url value="/customer/register" var="registerUrl" />
			<a class="btn btn-success" href="${registerUrl}">New Customer</a>
		</h1>
	</div>
	<div class="container">
		<div class="row">

			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-striped">
						<tr>
							<th>ID</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Email</th>
							<th>Mobile</th>
							<th>Update</th>
							<th>Delete</th>
						</tr>
						
						<c:forEach items="${customerList}" var="customer">
							<tr>
								<td>${customer.id}</td>
								<td>${customer.firstName}</td>
								<td>${customer.lastname}</td>
								<td>${customer.email}</td>
								<td>${customer.mobile}</td>
								<td>
									<c:url value="/customer/${customer.id}/update" var="updateUrl" />
									<a href="${updateUrl}" class="btn btn-success">Update</a>
								</td>
								<td>
									<c:url value="/customer/${customer.id}/delete" var="deleteUrl" />
									<a href="${deleteUrl}" class="btn btn-danger">Delete</a>
								</td>
							</tr>
						</c:forEach>
						
					</table>
				</div>
			</div>

		</div>
	</div>
</body>
</html>