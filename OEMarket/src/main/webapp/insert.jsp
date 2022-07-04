<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오이마켓</title>
<!-- Link -->
<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/font-awesome.css">
<link rel="stylesheet" href="assets/css/basic.css">
<link rel="stylesheet" href="assets/css/main.css">
<link rel="stylesheet" href="assets/css/owl-carousel.css">

<style type="text/css">
	ul li {
		display: inline-block; margin-left: 15px;   
	}

</style>
</head>
<body>
	<!-- Header -->
    <header>
        <div>
            <div>
                <div>
                    <nav>
                        <a href="index.jsp" class="logo">
                            <img src="assets/images/logo.png" alt="오이마켓">
                        </a>
                        <ul style="text-align: right;">
                            <li><a href="#">서비스 소개</a></li>
                            <li><a href="#popular">둘러보기</a></li>
                            <li><a href="#customer">고객센터</a></li>
                            <li><a href="login.jsp">로그인</a></li>
                            <li><a href="#"><i></i></a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!--// header-->
	
	<!-- section -->
	 
			<section>
				<div style="text-align: center;">상품 등록</div>
				<form action="#" name="frm" method="post" enctype="multipart/form-data">
					<table style="padding: 10px; margin: 0 auto; ">
						<tr>
							<th style="text-align: center;">제목</th>
							<td><input type="text" name="title" style="width: 100%;"></td>
						</tr>
						<tr>
							<th style="text-align: center;">가격</th>
							<td><input type="text" name="price" style="width: 100%;"></td>
						</tr>
						<tr>
							<th style="text-align: center;">내용</th>
							<td><textarea cols="50" rows="20" name="content"></textarea></td>
						</tr>
						<tr>	
							<th style="text-align: center;">파일</th>
							<td><input type="file" name="file" style="width: 100%;"></td>
						</tr>
						<tr>
							<td colspan="2" style="text-align: center;">
								<input type="submit" value="등록">
								<input type="reset" value="취소" >
								<input type="button" value="목록" onclick="" >
							</td>
						</tr>
					</table>
				</form>
			</section>
	
	<!-- section -->
	
<%-- 	<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ page import="java.io.File" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>

<%
String path = application.getRealPath("/noticeImg");
MultipartRequest mr = new MultipartRequest( request, path, 1024*1024*5, "utf-8", new DefaultFileRenamePolicy());
File s_file = mr.getFile( "filename");
String o_name = mr.getOriginalFileName( "s_file");
%> --%>
	
	
	<!--footer-->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <div class="first-item">
                        <div class="logo">
                            <h2>오이마켓</h2>
                        </div>
                        <ul>
                            <li><a href="#">경기 수원시 팔달구 덕영대로 방탄오이단 (오이서비스)</a></li>
                            <li><a href="#">사업자 등록번호 : 52-52-525252</a></li>
                            <li><a href="#">010-123-4567</a></li>
                        </ul>
                    </div>
                </div>

                <div class="col-lg-3">
                    <ul>
                        <li><a href="#">자주 묻는 질문</a></li>
                        <li><a href="#">믿을 수 있는 중고거래</a></li>
                        <li><a href="#">광고주센터</a></li>
                    </ul>
                </div>

                <div class="col-lg-2">
                    <ul>
                        <li><a href="#">회사 소개</a></li>
                        <li><a href="#">동네 가게</a></li>
                        <li><a href="#">채용</a></li>
                    </ul>
                </div>

                <div class="col-lg-3">
                    <ul>
                        <li><a href="#">이용약관</a></li>
                        <li><a href="#">개인정보처리방침</a></li>
                        <li><a href="#">위치기반서비스 이용약관</a></li>
                    </ul>
                </div>

                <div class="col-lg-12">
                    <div class="under-footer">
                        <p>Copyright © 2022 52CucumberMarket Co., All Rights Reserved. 
                        <ul>
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#"><i class="fa fa-behance"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!--// footer-->
	
<!-- 	<!-- jQuery -->
    <script src="assets/js/jquery-2.1.0.min.js"></script>

    Bootstrap
    <script src="assets/js/bootstrap.min.js"></script>

    Plugins
    <script src="assets/js/owl-carousel.js"></script>
    <script src="assets/js/slick.js"></script>


    custom
    <script src="assets/js/custom.js"></script> -->

</body>
</html>