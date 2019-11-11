<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>用户列表</h3>
<table border="1" style="width: 500px;border-collapse:collapse;" >
	<tr>
		<td>id</td>
		<td>用户名</td>
		<td>密码</td>
		<td>年龄</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${users }" var="user">
		<tr>
			<td>${user.id }</td>
			<td>${user.username }</td>
			<td>${user.password }</td>
			<td>${user.age }</td>
			<td>
				<a href="javascript:void(0);" onclick="deleteByPrimaryKey(${user.id});">删除</a>&nbsp;&nbsp;
				<a href="#">编辑</a>
			</td>
		</tr>
	</c:forEach>
</table>
<script type="text/javascript">
	function deleteByPrimaryKey(id) {
		if (confirm("是否删除用户id为"+id+"的用户")) {
			window.location.href="${pageContext.request.contextPath}/user/delete.do?id="+id;
		}
	}
	
</script>

</body>
</html>