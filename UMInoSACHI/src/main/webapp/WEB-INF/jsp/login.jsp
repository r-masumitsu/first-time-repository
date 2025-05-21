<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
	<a href="UserRegisterServlet">ユーザー登録画面へ</a>
	<header class="page-header">
		<h1>ログイン</h1>
	</header>
	<section class="login-form">
		<form action="LoginServlet" method="post">
			<table>
				<tr>
					<td><label for="email">メールアドレス：</label></td>
					<td><input type="text" id="email" name="email"></td>
				</tr>
				<tr>
					<td><label for="pass">パスワード：</label></td>
					<td><input type="password" id="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;"><input
						type="submit" value="ログイン"></td>
				</tr>
			</table>
		</form>
	</section>

</body>
</html>
<%@ include file="footer.jsp"%>