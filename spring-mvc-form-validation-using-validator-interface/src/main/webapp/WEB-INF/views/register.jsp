<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
	<div class="container-fluid">
		<h1 style="text-align: center;">Customer Registration</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
		<div class="col-md-8">
			<form:form modelAttribute="customerDto" cssClass="form-group">
				<div class="form-group">
				    <label for="firstName">
				    	First Name &nbsp;
				    	<form:errors path="firstName" cssClass="error" />
				    </label>
				    <form:input path="firstName" class="form-control" placeholder="First Name" />
				</div>
				<div class="form-group">
				    <label for="lastName">
				    	Last Name &nbsp;
				    	<form:errors path="lastName" cssClass="error" />
				    </label>
				    <form:input path="lastName" class="form-control" placeholder="Last Name" />
				</div>
				<div class="form-group">
				    <label for="email">
				    	Email &nbsp;
				    	<form:errors path="email" cssClass="error" />
				    </label>
				    <form:input path="email" class="form-control" placeholder="Email" />
				</div>
				<div class="form-group">
				    <label for="mobile">
				    	Mobile &nbsp;
				    	<form:errors path="mobile" cssClass="error" />
				    </label>
				    <form:input path="mobile" class="form-control" placeholder="Mobile" />
				</div>
				<div class="form-group">
				    <label for="password">
				    	First Name &nbsp;
				    	<form:errors path="password" cssClass="error" />
				    </label>
				    <form:input path="password" class="form-control" placeholder="Password" />
				</div>
				<div class="form-group">
				    <label for="confirmPassword">
				    	Confirm Password &nbsp;
				    	<form:errors path="confirmPassword" cssClass="error" />
				    </label>
				    <form:input path="confirmPassword" class="form-control" placeholder="Confirm Password" />
				</div>
				<div class="form-group">
				    <input type="submit" class="btn btn-danger" value="Register" />
				</div>
			</form:form>
		</div>
		<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>