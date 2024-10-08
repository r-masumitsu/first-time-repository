package filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter(urlPatterns = {"/PurchaseServlet", "/SeafoodCartServlet", "/SeafoodFormServlet"})
public class AuthenticationFilter extends HttpFilter {
	
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(false); // 新しいセッションを作成しない

        // ユーザーがログインしているか確認
        boolean loggedIn = (session != null && session.getAttribute("account") != null);
        String loginURI = httpRequest.getContextPath() + "/WEB-INF/index.jsp"; // ログインページのURI

        if (!loggedIn && !httpRequest.getRequestURI().equals(loginURI)) {
            // 未ログインの場合、トップページへリダイレクト
            httpResponse.sendRedirect(loginURI);
        } else {
            chain.doFilter(request, response); // 認証されている場合は次のフィルタへ
        }
    }
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
