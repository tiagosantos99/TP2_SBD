<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	
		<link rel="stylesheet" type="text/css" href="styles/global.css">
	    <link rel="stylesheet" type="text/css" href="styles/index.css">
	</head>
	
	<body>
		<div class="modal" style="display: none">
		    <span style="font-size: 32px;">Login</span>
		    <span class="close-modal" onclick="closeModals()">&times;</span>
		
		    <form method="post" action="processLogin.php" style="margin-top: 24px;">
		
		        <label for="usernameLogin" class="input-label">Username</label>
		        <input id="usernameLogin" type="text" name="username" class="input-field"
		            placeholder="Type your username" required>
		
		        <label for="passwordLogin" class="input-label">Password</label>
		        <input id="passwordLogin" type="password" name="password" class="input-field"
		            placeholder="Type your password" required>
		
		        <input type="submit" value="Sign-in" class="form-submit">
		    </form>
		</div>
	</body>
</html>