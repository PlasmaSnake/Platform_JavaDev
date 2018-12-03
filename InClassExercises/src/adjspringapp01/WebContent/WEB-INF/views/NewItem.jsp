<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert new items</title>
</head>
<body>
	<div class="container">
		<form action="showitems">
			<div class="field">
				<label for="name">Item Name</label>
				<input id="name" name="item_name"
					type="text" placeholder="Enter item name"/>
			</div>
			<div class="field">
				<label for="desc">Item Description</label>
				<input id="desc" name="item_desc"
					type="text" placeholder="Enter item description"/>
			</div>
			<div class = "btn">
				<input id = "sub" name = "submit"
					type="submit" value = "Submit Item"/>
			</div>
		</form>
	</div>
	<br>
	<a href = "index">Home</a>
</body>
</html>