<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ex.Employee"%>
<%
Employee emp = new Employee("0001", "湊 雄輔");
%>
<!DOCTYPE html>
<html>
<body>
	<%
	for (int i = 0; i < 10; i++) {
		if (i % 3 == 0) {
	%>
	<p style="color: red">
		<%
		} else {
		%>
	<p>
		<%
		}
		%>
		style=color>IDは<%=emp.getId()%>、名前は<%=emp.getName()%>です
	</p>
	<%
	}
	%>
</body>
</html>