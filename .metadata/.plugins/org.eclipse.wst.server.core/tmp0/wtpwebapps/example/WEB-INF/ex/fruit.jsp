<%@ page language="java" contentType="text/html; charset=arset=UTF-8"
	pageEncoding="UTF-8"%>
<%--
<%@ page import="ex.Fruit"%>
--%>

<%-- リクエストスコープからインスタンスを取得
<%
Fruit fruit = (Fruit) application.getAttribute("fruit");
%>
--%>

<%-- セッションスコープからインスタンスを取得
<%
Fruit fruit = (Fruit) session.getAttribute("fruit");
%>
--%>


<%--アプリケーションスコープからインスタンスを取得
<%
Fruit fruit = (Fruit) application.getAttribute("fruit");
%>
--%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フルーツとその値段</title>
</head>
<body>
	<p>${applicationScope.fruit.name}の値段は${applicationScope.fruit.price}円です。
	</p>
</body>
</html>