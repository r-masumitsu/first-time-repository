package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;
import model.RegisterLogic;

@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/user_register.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		String mail = request.getParameter("mail");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		Boolean isAdmin = request.isUserInRole("isAdmin");

		//登録処理の成否の格納
		boolean result = false;
		//ユーザー登録処理の実行
		Account account = new Account(userId, pass, mail, name, address, isAdmin);
		RegisterLogic bo = new RegisterLogic();
		result = bo.execute(account);
		//登録処理の成否によって処理を分岐
		if (result) {
			//リクエストスコープにユーザー名を保存
			request.setAttribute("name", name);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/user_registerOK.jsp");
			dispatcher.forward(request, response);
		} else {
			//リダイレクト
			response.sendRedirect("UserRegisterServlet");
		}
	}

}
