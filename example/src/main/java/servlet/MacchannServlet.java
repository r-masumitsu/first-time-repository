package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MacchannServlet")
public class MacchannServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // 現在の日付を取得
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
	    String today = sdf.format(date);
	    // Calendarインスタンスを取得
	    Calendar calendar = Calendar.getInstance();
	    // DateをCalendarにセット
	    calendar.setTime(date);
	    // 曜日を取得
	    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

	    //日にちを出力
	    //曜日を日本語で出力
	    String[] weekDays = {"", "日", "月", "火", "水", "木", "金", "土"};
	    // 運勢をランダムで決定
	    String[] humor = { "","良い", "悪い", "最悪", "普通", "良い", "最高", "最高", };

	    // HTMLを出力
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\" />");
	    out.println("<title></title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("まっちゃんは、かっこいい！最高！");
	    out.println("<br>");
	    out.println("今日は" + today + "の" + weekDays[dayOfWeek]  + "曜日です。");
	    out.println("<br>");
	    out.println("今日のまっちゃんの機嫌は・・・");
	    out.println("<br>");
	    out.println(humor[dayOfWeek] + "です。");
	    out.println("</body>");
	    out.println("</html>");
	}  
}
