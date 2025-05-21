<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トップ</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
	<nav>
		<ul class="menu">
			<li><a href="LoginServlet">ログイン</a></li>
			<li><a href="RegisterServlet">ユーザー登録</a></li>
		</ul>
	</nav>
</body>
</html>
<%@ include file="/WEB-INF/jsp/footer.jsp"%>