<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
	span {
		display: inline-block;
		width: 200px;
		text-align: left;
	}
</style>
</head>
<body>
	<div align="center">
		<h2>Registration success</h2>
		<span>Full name:</span><span>${user.name }</span><br>
		<span>Email:</span><span>${user.email}</span><br>
		<span>Password:</span><span>${user.password}</span><br>
		<span>Birthday:</span><span>${user.birthday}</span><br>
		<span>Gender:</span><span>${user.gender}</span><br>
		<span>Profession:</span><span>${user.profession}</span><br>
		<span>Married:</span><span>${user.married}</span><br>
		<span>Annual Income:</span><span>${user.income}</span><br>
		<span>Note:</span><span>${user.note}</span><br>
	</div>
</body>
</html>