<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>購入完了</title>
    <link rel="stylesheet" href="css/styles.css"> <!-- CSSファイルのリンク -->
</head>
<body>
    <header class="page-header">
        <h1>購入完了</h1>
    </header>
    <section class="purchase-completion">
        <p>ご購入ありがとうございます</p>
        <p>${account.address} にお届けいたします</p>
        <p>しばらくお待ちくださいませ</p>
        <p>
            <a href="SeafoodFormServlet" class="btn-link">購入フォームへ戻る</a>
        </p>
    </section>
</body>
</html>
<%@ include file="footer.jsp" %>