<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>会員登録</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
	<a href="LoginServlet">ログイン画面へ</a>
	<header class="page-header">
		<h1>ユーザー登録</h1>
	</header>
	<section class="registration-form">
		<form action="RegisterServlet" method="post">
			<table>
				<tr>
					<td><label for="name">姓名：</label></td>
					<td><input type="text" name="name" id="name" required></td>
				</tr>
				<tr>
					<td><label for="email">メールアドレス：</label></td>
					<td><input type="text" name="email" id="email" required></td>
				</tr>
				<tr>
					<td><label for="pass">パスワード：</label></td>
					<td><input type="password" name="password" id="password" required></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;"><input
						type="submit" value="登録" class="btn-register"></td>
				</tr>
			</table>
		</form>
	</section>
</body>
</html>
<%@ include file="footer.jsp"%>