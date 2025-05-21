package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.RegisterLogic;
import model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/register.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		//登録処理の成否の格納
		boolean result = false;
		//ユーザー登録処理の実行
		final int INITIALID = 0;	//ユーザーIDの初期値
		User user = new User(INITIALID, name, email, password, null);
		RegisterLogic bo = new RegisterLogic();
		result = bo.execute(user);
		//登録処理の成否によって処理を分岐
		if (result) {
			//リクエストスコープにユーザー名を保存
			request.setAttribute("name", name);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/productList.jsp");
			dispatcher.forward(request, response);
		} else {
			//リダイレクト
			response.sendRedirect("RegisterServlet");
		}
	}

}
