package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex62")
public class EX62Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rand = (int)(Math.random() * 10);
		if(rand % 2 == 1) {
			//リダイレクト
			response.sendRedirect("redirected.jsp");
		}else {
			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/forwarded.jsp");
			dispatcher.forward(request, response);
		}
	}
}
