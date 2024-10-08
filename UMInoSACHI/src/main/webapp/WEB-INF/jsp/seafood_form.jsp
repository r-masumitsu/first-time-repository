<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>海の幸購入フォーム</title>
    <link rel="stylesheet" href="css/styles.css"> <!-- CSSファイルのリンク -->
</head>
<body>
    <header class="page-header">
        <h1>海の幸購入フォーム</h1>
    </header>
    <section class="product-section">
        <table class="product-table">
            <thead>
                <tr>
                    <th>商品名</th>
                    <th>商品</th>
                    <th>価格</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${seafoodlist}">
                    <tr>
                        <td>${item.name}</td>
                        <td><img src="img/${item.image}" alt="${item.name}" class="product-image"></td>
                        <td>${item.price}円</td>
                        <td>
                            <form action="SeafoodFormServlet" method="post">
                                <input type="hidden" name="itemId" value="${item.itemId}">
                                <input type="submit" value="カートに入れる" class="btn-add-to-cart">
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p class="message">${message}</p>
        <form action="SeafoodFormServlet" method="post">
            <input type="submit" name="clear" value="カートを空にする" class="clear-button">
        </form>
        <p>
            <a href="SeafoodCartServlet" class="cart-link">カートを確認する</a>
        </p>
    </section>
</body>
</html>
<%@ include file="footer.jsp" %>