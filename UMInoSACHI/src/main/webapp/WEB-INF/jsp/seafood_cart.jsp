<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>海の幸カート</title>
<link rel="stylesheet" href="css/styles.css">
<!-- CSSファイルのリンク -->
</head>
<body>
	<button class="logout-button" onclick="location.href='LogoutServlet'">ログアウト</button>
	<header class="page-header">
		<h1>海の幸カート</h1>
	</header>
	<section class="cart-section">
		<p class="message">${message}</p>
		<form action="SeafoodFormServlet" method="post">
			<input type="submit" name="clear" value="カートを空にする"
				class="clear-button">
		</form>
		<p>
			<a href="SeafoodFormServlet" class="btn-link">購入フォームへ戻る</a>
		</p>
		<p>
			<a href="PurchaseServlet" class="btn-link">購入確定画面へ進む</a>
		</p>
		<table class="product-table">
			<thead>
				<tr>
					<th>商品名</th>
					<th>画像</th>
					<th>価格</th>
					<th>数量</th>
					<th>小計</th>
					<th>操作</th>
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
								<td>
									<form action="SeafoodCartServlet" method="post">
										<input type="hidden" name="itemId" value="${id}"> <input
											type="submit" value="削除" class="btn-delete">
									</form>
								</td>
							</tr>
						</c:if>
					</c:forEach>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>
</html>
<%@ include file="footer.jsp"%>