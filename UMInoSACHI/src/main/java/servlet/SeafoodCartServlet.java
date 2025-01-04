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
import model.SeafoodLogic;

@WebServlet("/SeafoodCartServlet")
public class SeafoodCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked") //型が保証されていない場合の警告を抑制
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Seafood> cartList = new ArrayList<>();
		SeafoodLogic logic = new SeafoodLogic();
		String message = null;
		int amount = 0;

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
		if (cart != null) {
			for (String key : cart.keySet()) {
				cartList.add(logic.showOne(key));
			}
			//商品の合計金額を求める
			for (Map.Entry<String, Integer> entry : cart.entrySet()) {
				for (Seafood item : cartList) {
					if (entry.getKey().equals(item.getItemId())) {
						amount += item.getPrice() * entry.getValue();
					}
				}
			}
		}

		if (cartList.isEmpty()) {
			message = "カートに商品が入っていません";
		} else {
			message = "合計は" + amount + "円でございます";
		}

		request.setAttribute("message", message);
		session.setAttribute("cartList", cartList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/seafood_cart.jsp");
		dispatcher.forward(request, response);
	}

	@SuppressWarnings("unchecked") //型が保証されていない場合の警告を抑制
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		String itemId = request.getParameter("itemId");
		Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
		cart.remove(itemId);

		session.setAttribute("cart", cart);

		doGet(request, response);
	}

}
