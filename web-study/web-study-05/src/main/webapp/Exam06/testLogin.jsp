<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String id = "pinksung";
		String pwd = "1234";
		String name = "성윤정";
		
		if(id.equals((String)request.getParameter("id")) &&
				pwd.equals((String)request.getParameter("pwd")) ) {
			Cookie cookie = new Cookie("username", URLEncoder.encode(name,"utf-8"));
			cookie.setMaxAge(24*60*60); //속성 부여
			response.addCookie(cookie); //클라이언트에 추가
		
		%>
		<h2>성공적으로 로그인하셨습니다.</h2>
		<p><a href="main.jsp">들어가기</a>
		<%
		} else { %>
		<h2>로그인에 실패했습니다.</h2>
		<p><a href="loginForm.jsp">되돌아가기</a>
		<% } %>	
	
</body>
</html>