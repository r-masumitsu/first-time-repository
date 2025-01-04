<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>購入確認</title>
<link rel="stylesheet" href="css/styles.css">
<!-- CSSファイルのリンク -->
</head>
<body>
	<button class="logout-button" onclick="location.href='LogoutServlet'">ログアウト</button>
	<header class="page-header">
		<h1>購入確認</h1>
	</header>
	<section class="product-section">
		<table class="product-table">
			<thead>
				<tr>
					<th>商品名</th>
					<th>商品</th>
					<th>価格</th>
					<th>数量</th>
					<th>小計</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="entry" items="${cart}">
					<c:set var="id" value="${entry.key}" />
					<c:set var="quantity" value="${entry.value}" />
					<c:forEach var="item" items="${cartList}">
						<c:if test="${item.itemId == id}">
							<tr>
								<td>${item.name}</td>
								<td><img src="img/${item.image}" alt="${item.name}"
									class="product-image"></td>
								<td>${item.price}円</td>
								<td>${quantity}</td>
								<td>${item.price * quantity}円</td>
							</tr>
						</c:if>
					</c:forEach>
				</c:forEach>
			</tbody>
		</table>
		<p class="message confirmation-message">${message}</p>
		<form action="PurchaseServlet" method="post">
			<input type="submit" value="購入を確定する" class="btn-confirm">
		</form>
		<p>
			<a href="SeafoodCartServlet" class="btn-link">カートへ戻る</a>
		</p>
	</section>
</body>
</html>
<%@ include file="footer.jsp"%>