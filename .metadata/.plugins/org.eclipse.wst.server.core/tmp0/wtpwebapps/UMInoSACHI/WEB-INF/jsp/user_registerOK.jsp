<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>海鮮物ショッピングサイト「海の幸」</title>
    <link rel="stylesheet" href="css/styles.css"> <!-- CSSファイルのリンク -->
</head>
<body>
    <header class="page-header">
        <h1>登録完了</h1>
    </header>
    <section class="registration-completion">
        <p>
            <c:out value="${name}" />さんのユーザー登録が完了しました。<br>
            ご登録ありがとうございます。<br>
            トップ画面に戻りログインしてください。
        </p>
        <a href="WelcomeServlet" class="btn-home">トップへ</a>
    </section>
</body>
</html>
<%@ include file="footer.jsp" %>