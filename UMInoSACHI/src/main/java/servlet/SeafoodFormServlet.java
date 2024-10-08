package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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

@WebServlet("/SeafoodFormServlet")
public class SeafoodFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked") //型が保証されていない場合の警告を抑制
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<String, Integer> cart = null;
		if (session != null) {
			cart = (Map<String, Integer>) (session.getAttribute("cart"));
		}
		String message;
		if (cart != null) {
			message = "カートに" + cart.values().size() + "種類の商品が入っています";
		} else {
			message = "商品を選んでください";
		}
		request.setAttribute("message", message);

		SeafoodLogic logic = new SeafoodLogic();
		ArrayList<Seafood> seafoodList = logic.showList();
		request.setAttribute("seafoodlist", seafoodList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/seafood_form.jsp");
		dispatcher.forward(request, response);
	}

	@SuppressWarnings("unchecked") //型が保証されていない場合の警告を抑制
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String itemId = request.getParameter("itemId");
		String clear = request.getParameter("clear");
		final Integer INITIALQUANTITY = 1;
		String message = null;

		if (clear != null) {
			session.removeAttribute("cart");
			session.removeAttribute("cartList");
			message = "カートを空にしました";
		} else {
			Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
			if (cart == null) {
				cart = new HashMap<>();
			}
			
			if (itemId != null) {
				Integer quantity = cart.get(itemId);
				if (quantity != null) {
					cart.put(itemId, quantity + 1);
				} else {
					cart.put(itemId, INITIALQUANTITY);
				}
			}
			session.setAttribute("cart", cart);
			message = "カートに" + cart.values().size() + "種類の商品が入っています";
		}
		request.setAttribute("message", message);

		SeafoodLogic logic = new SeafoodLogic();
		ArrayList<Seafood> seafoodList = logic.showList();
		request.setAttribute("seafoodlist", seafoodList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/seafood_form.jsp");
		dispatcher.forward(request, response);
	}

}
