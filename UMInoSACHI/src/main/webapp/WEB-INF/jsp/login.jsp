<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>海鮮物ショッピングサイト「海の幸」</title>
<link rel="stylesheet" href="css/styles.css">
<!-- CSSファイルのリンク -->
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
					<td><label for="userId">ID（メールアドレス）：</label></td>
					<td><input type="text" id="userId" name="userId"></td>
				</tr>
				<tr>
					<td><label for="pass">パスワード：</label></td>
					<td><input type="password" id="pass" name="pass"></td>
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