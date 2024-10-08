<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>海鮮物ショッピングサイト「海の幸」</title>
    <link rel="stylesheet" href="css/styles.css"> <!-- CSSファイルのリンク -->
</head>
<body>
    <section class="login-form">
        <form action="LoginServlet" method="post">
            <label for="userId">ユーザーID：</label>
            <input type="text" id="userId" name="userId"><br>
            <label for="pass">パスワード：</label>
            <input type="password" id="pass" name="pass"><br>
            <input type="submit" value="ログイン">
        </form>
    </section>
</body>
</html>
<%@ include file="footer.jsp" %>