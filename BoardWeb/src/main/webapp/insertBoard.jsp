<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
                  "http://www.w3.org/TR/html4/loose.dtd">>
<html>
<head>
<meta charset="UTF-8">
<title>글 등록</title>
</head>
<body>
	<center ali>
		<h1>글 등록</h1>
		<a href="logout_proc.jsp">Log-out</a>
		<hr>
		<form action="insertBoard_proc.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<th bgcolor="orange" width="70">제목</th>
					<td><input type="text" name="title" ></td>
				</tr>
				<tr>
					<th bgcolor="orange" width="70">작성자</th>
					<td><input type="text" name="writer" ></td>
				</tr>
				<tr>
					<th bgcolor="orange" width="70">내용</th>
					<td><textarea cols="40" rows="10" name="content"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="새글 등록">
					</td>
				</tr>
			</table>
			<hr>
			<a href="getBoardList.jsp">글 목록 가기</a>
		</form>
	</center>
</body>
</html>