package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Seafood;

@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
		ArrayList<Seafood> cartList = (ArrayList<Seafood>) session.getAttribute("cartList");
		Integer amount = 0;
		String message;

		if (cart != null) {
			// カートの中の商品を取得して合計金額を計算
			for (Map.Entry<String, Integer> entry : cart.entrySet()) {
				for (Seafood item : cartList) {
					if (entry.getKey().equals(item.getItemId())) {
						amount += item.getPrice() * entry.getValue();
					}
				}
			}
			message = "合計は " + amount + "円でございます。";
		} else {
			message = "カートに商品が入っていません";
		}
		
		//購入確定後に使用
		session.setAttribute("amount", amount);
		// 購入確認画面に必要な情報を設定
		request.setAttribute("message", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/purchase.jsp");
		dispatcher.forward(request, response);
	}

	@SuppressWarnings("unchecked") //型が保証されていない場合の警告を抑制
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//リクエストスコープに退避するためにセッションからオブジェクトを取得
		HttpSession session = request.getSession();
		Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
		ArrayList<Seafood> cartList = (ArrayList<Seafood>) session.getAttribute("cartList");
		Integer amount = (Integer)session.getAttribute("amount");
		
		if (cart == null) {
			doGet(request, response);
		} else {
			// リクエストスコープにカート情報を格納
			request.setAttribute("cart", cart);
			request.setAttribute("cartList", cartList);
			request.setAttribute("amount", amount);

			// 購入確定処理：カートをクリア
			session.removeAttribute("cart");
			session.removeAttribute("cartList");
			session.removeAttribute("amount");

			// 購入完了画面に遷移
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/purchaseOK.jsp");
			dispatcher.forward(request, response);
		}
	}
}