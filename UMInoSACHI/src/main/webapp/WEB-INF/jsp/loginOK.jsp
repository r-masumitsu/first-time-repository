<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>海鮮物ショッピングサイト「海の幸」</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
	<button class="logout-button" onclick="location.href='LogoutServlet'">ログアウト</button>
	<section class="welcome-message">
		<p>
			ようこそ、
			<c:out value="${account.name}" />
			様
		</p>
		<a class="btn-link" href="SeafoodFormServlet">海の幸購入フォームへ</a>
	</section>
</body>
</html>
<%@ include file="footer.jsp"%>