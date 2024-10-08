package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// セッションを取得して無効化
		HttpSession session = request.getSession(false); // 既存のセッションがあれば取得
		if (session != null) {
			session.invalidate(); // セッションを無効にする
		}

		// ログインページまたはトップページにリダイレクト
		response.sendRedirect("index.jsp"); // 適宜リダイレクト先を変更
	}
}