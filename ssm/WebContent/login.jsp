<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>登陆页面</h3>

<form action="${pageContext.request.contextPath }/user/login.do">
<span>${errorMsg}</span>
账号：<input type="text" name="username">
密码	: <input type="password" name="password">
	<button type="submit">登陆</button>
</form>

</body>
</html>