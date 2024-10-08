<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <h1>ユーザー登録</h1>
    </header>
    <section class="registration-form">
        <form action="UserRegisterServlet" method="post">
            <label for="userId">ユーザーID：</label>
            <input type="text" name="userId" id="userId" required><br>

            <label for="pass">パスワード：</label>
            <input type="password" name="pass" id="pass" required><br>

            <label for="mail">メールアドレス：</label>
            <input type="text" name="mail" id="mail" required><br>

            <label for="name">姓名：</label>
            <input type="text" name="name" id="name" required><br>

            <label for="address">住所：</label>
            <input type="text" name="address" id="address" required><br>

            <span>ユーザー権限：</span><br>
            <input type="radio" name="isAdmin" value="true" id="admin">
            <label for="admin">管理者</label><br>
            <input type="radio" name="isAdmin" value="false" id="user" checked>
            <label for="user">一般ユーザー</label><br>

            <input type="submit" value="登録" class="btn-register">
        </form>
    </section>
</body>
</html>
<%@ include file="footer.jsp" %>