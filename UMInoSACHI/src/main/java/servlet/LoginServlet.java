package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.LoginLogic;
import model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String password =request.getParameter("password");
		
		//ログイン処理の実行
		final int INITIALID = 0;	//ユーザーIDの初期値
		User user = new User(INITIALID, null, email, password, null);
		LoginLogic loginLogic = new LoginLogic();
		user = loginLogic.execute(user);
		
		//ログイン処理の成否によって処理を分岐
		if(user != null) {	//ログイン成功時
			HttpSession session = request.getSession(false);
			if (session != null) {
			    session.invalidate(); // 現在のセッションを無効化
			}
			session = request.getSession(true); // 新しいセッションを作成
			session.setAttribute("user", user);
			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/productList.jsp");
			dispatcher.forward(request, response);
		}else {	//ログイン失敗時
			//リダイレクト
			response.sendRedirect("LoginServlet");
		}
	}

	
}
