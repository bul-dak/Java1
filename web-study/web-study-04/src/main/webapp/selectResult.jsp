<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	당신의 학력, 소속국가 및 관심분야는 다음과 같습니다.<br><br>
	<%
String edu = request.getParameter("edu"); 
String na = request.getParameter("na");
String[] likes = request.getParameterValues("like");
%><b>
<%= edu %></b>과 <b>
<%= na %></b> <br><br>
<% for(String likes2 : likes)
{ %> 
<b> 
	<%= likes2 %>
</b> <br> 
<% } %>	
</body>
</html>