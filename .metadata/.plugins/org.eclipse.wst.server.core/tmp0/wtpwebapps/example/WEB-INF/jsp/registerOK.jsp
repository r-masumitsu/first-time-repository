<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ商店</title>
</head>
<body>
<p>
<c:out value="${name}" />さんのユーザー登録が完了しました<br>
ご登録ありがとうございます<br>
トップ画面に戻りログインしてください
</p>
<a href="WelcomeServlet">トップへ</a>
</body>
</html>