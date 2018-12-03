<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show items</title>
<% String sessionName = "";
	if (session.getAttribute("item")!=null){
		sessionName = session.getAttribute("item").toString();
	}%>
</head>
<body>
	<h1>ADJ Group</h1>
	<hr>
	<h2>SHOW ITEM</h2>
	<div>
		<label>Item Name       :</label>
		${item_name }
		<br>
		<label>Item Description:</label>
		${item_desc }
		</div>
</body>
</html>