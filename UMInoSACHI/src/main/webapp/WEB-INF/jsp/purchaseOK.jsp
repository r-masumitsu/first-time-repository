<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>購入完了</title>
<link rel="stylesheet" href="css/styles.css">
<!-- CSSファイルのリンク -->
</head>
<body>
	<button class="logout-button" onclick="location.href='LogoutServlet'">ログアウト</button>
	<header class="page-header">
		<h1>購入完了</h1>
	</header>
	<section class="purchase-completion">
		<p>
			<c:out value="${account.name}" />
			様、ご購入ありがとうございます。
		</p>
		<p>ご請求金額は${amount}円でございます。</p>
		<p>${account.address}にお届けいたします。</p>
		<p>しばらくお待ちくださいませ。</p>
		<p>購入情報詳細</p>
		<table class="product-table">
			<thead>
				<tr>
					<th>商品名</th>
					<th>画像</th>
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


		<p>
			<a href="SeafoodFormServlet" class="btn-link">購入フォームへ戻る</a>
		</p>
	</section>
</body>
</html>
<%@ include file="footer.jsp"%>