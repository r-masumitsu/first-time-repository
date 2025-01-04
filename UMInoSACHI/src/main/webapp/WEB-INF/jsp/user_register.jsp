<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>海鮮物ショッピングサイト「海の幸」</title>
<link rel="stylesheet" href="css/styles.css">
<!-- CSSファイルのリンク -->
</head>
<body>
	<a href="LoginServlet">ログイン画面へ</a>
	<header class="page-header">
		<h1>ユーザー登録</h1>
	</header>
	<section class="registration-form">
		<form action="UserRegisterServlet" method="post">
			<table>
				<tr>
					<td><label for="userId">ID（メールアドレス）：</label></td>
					<td><input type="text" name="userId" id="userId" required></td>
				</tr>
				<tr>
					<td><label for="pass">パスワード：</label></td>
					<td><input type="password" name="pass" id="pass" required></td>
				</tr>
				<tr>
					<td><label for="name">姓名：</label></td>
					<td><input type="text" name="name" id="name" required></td>
				</tr>
				<tr>
					<td><label for="address">住所：</label></td>
					<td><input type="text" name="address" id="address" required></td>
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