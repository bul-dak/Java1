<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/employee.js"></script>
</head>
<body>
<body>

	<div id="wrap" align="center">
		<h1>사원 정보 보기</h1>
		<table class="list">
			<tr>
				<th>아이디</th>
				<td>${employee.id }</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>${employee.pass }</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${employee.name }</td>
			</tr>
			<tr>
				<th>권한</th>
					<td>
						<c:choose>
							<c:when test="${employee.lev eq 'A'}">운영자</c:when>
							<c:otherwise>일반회원</c:otherwise>					
						</c:choose>
					</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<c:choose>
						<c:when test="${employee.gender eq '1'}">남자</c:when>
						<c:otherwise>여자</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>${employee.phone }</td>
			</tr>
			<tr>
				<th>가입일</th>
				<td><fmt:formatDate value="${employee.enter }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			</tr>
		</table>
		<br><br>
		<input type="button" value="수정" onclick="open_win('EmployeeServlet?command=employee_check_pass_form&id=${employee.id}','update')">
		<input type="button" value="삭제" onclick="open_win('EmployeeServlet?command=employee_check_pass_form&id=${employee.id}','delete')">
		<input type="button" value="목록" onclick="location.href='EmployeeServlet?command=employee_list'">
		<input type="button" value="등록" onclick="location.href='EmployeeServlet?command=employee_write_form'">
	</div>
</body>
</html>