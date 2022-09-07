<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%! 
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String uid="scott";
	String pass="tiger";
	String sql = "select * from employee";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
	
	
	<table class="table" border="1">
		<thead>
      		<tr>
        		<th>이름</th>
        		<th>주소</th>
        		<th>ssn</th>
      		</tr>
    	</thead>
	
	<%
	
	try{
		//1.드라이브 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.연결
		conn = DriverManager.getConnection(url,uid,pass);
		//3.sql문장 작성
		pstmt = conn.prepareStatement(sql);
		//4.sql문장 실행
		rs = pstmt.executeQuery();
		//5.실행된 결과물을 rs를 통해서 출력
		while (rs.next()){
			out.println("<tbody>");
			out.println("<tr>");
			out.println("<td  class=\"table-primary\">" + rs.getString("name")+ "</td>");
			out.println("<td class=\"table-success\">" + rs.getString("address") + "</td>");
			out.println("<td class=\"table-danger\">" + rs.getString("ssn") + "</td>");
			out.println("</tr>");
			out.println("</tbody>");
		} //while의 끝
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try{
			if(rs != null) rs.close(); //데이터가 있으면 닫아라.
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//finally의 끝
%>
	</table>


</body>
</html>