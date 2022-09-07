<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<!-- content에 자신의 OAuth2.0 클라이언트ID를 넣습니다. -->
<meta name ="google-signin-client_id" content="712238828984-i809dtlc2i75lj28ra3cnjaeo881j7ep.apps.googleusercontent.com">
<meta charset="UTF-8">
<title>로그인 페이지</title>
<script src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.2.js" charset="utf-8"></script>
<script src="https://apis.google.com/js/platform.js?onload=init" async defer></script>
<!-- Link -->
<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/assets/css/font-awesome.css">
<link rel="stylesheet" href="/resources/assets/css/basic.css">
<link rel="stylesheet" href="/resources/assets/css/main.css">

</head>
<body>
	<section class="login-section">
		<div class="container">
			<div class="row justify-content-center box-shadow">
				<div class="col-md-8 col-lg-8">
					<div class="login-wrap">
						<img src="/resources/assets/images/cucumber.png">
						<h3 class="mb-4 text-center">오이마켓 시작하기</h3>
						<form action="${contextPath}/loginUser" class="login-form" method="post">
							<div class="form-group">
								<input type="text" name="us_id" class="form-control" placeholder="아이디" required>
							</div>
							<div class="form-group">
								<input id="password-field" name="us_pass" type="password" class="form-control" placeholder="비밀번호" required>
								<span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
							</div>
							<div class="form-group submit_login">
								<button type="submit" class="form-control btn btn-primary">로그인</button>
							</div>
							<div class="form-group d-md-flex">
								<div class="w-50">
									<label class="checkbox-wrap checkbox-primary">아이디 저장
										<input type="checkbox" checked>
										<span class="checkmark"></span>
									</label>
								</div>
							</div>
							<div class="form-group forgot-password">
								<a href="${contextPath}/user/findId">아이디 찾기</a>
								ㅣ
								<a href="${contextPath}/user/findPass">비밀번호 찾기</a>
								ㅣ
								<a href="${contextPath}/user/join">회원가입</a>
							</div>
							<hr>

							<div class="form-group social d-flex text-center google">
								<a href="javascript:void(0)" id="GgCustomLogin"><img src="/resources/assets/images/google.png"> 구글로 로그인하기</a>
							</div>
							<div class="form-group social d-flex text-center naver">
								<a href="https://kauth.kakao.com/oauth/authorize?client_id=d91ab7aadf761b0a9b0838e797372e06&redirect_uri=http://localhost:8080/kakaoLogin&response_type=code"
								 ><img src="/resources/assets/images/kakao.png"> 카카오로 로그인하기</a>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	  <!-- jQuery -->
    <script src="/resources/assets/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="/resources/assets/js/bootstrap.min.js"></script>
    <!-- custom -->
    <script src="/resources/assets/js/custom.js"></script>
    
    <script>
      $(".toggle-password").click(function() {
   
         $(this).toggleClass("fa-eye fa-eye-slash");
         var input = $($(this).attr("toggle"));
         if (input.attr("type") == "password") {
         input.attr("type", "text");
         } else {
         input.attr("type", "password");
         }
      });
      
      var result = '<c:out value="${result}"/>';
      
      if(result === 'no'){
    	  alert("아이디 혹은 비밀번호를 다시 확인해주세요.")
      } 
      
      
      //구글=================================================================
      
      
      function init() {
		gapi.load('auth2', function() {
			gapi.auth2.init();
			options = new gapi.auth2.SigninOptionsBuilder();
			options.setPrompt('select_account');
	        // 추가는 Oauth 승인 권한 추가 후 띄어쓰기 기준으로 추가
			options.setScope('email profile openid https://www.googleapis.com/auth/user.birthday.read');
	        // 인스턴스의 함수 호출 - element에 로그인 기능 추가
	        // GgCustomLogin은 li태그안에 있는 ID, 위에 설정한 options와 아래 성공,실패시 실행하는 함수들
			gapi.auth2.getAuthInstance().attachClickHandler('GgCustomLogin', options, onSignIn, onSignInFailure);
		})
	}
	
	function onSignIn(googleUser) {
		var access_token = googleUser.getAuthResponse().access_token
		$.ajax({
	    	// people api를 이용하여 프로필 및 생년월일에 대한 선택동의후 가져온다.
			url: 'https://people.googleapis.com/v1/people/me'
	        // key에 자신의 API 키를 넣습니다.
			, data: {personFields:'birthdays', key:'AIzaSyCWfXnPvrO8pYODpV1LAhL4QYqZuVt4k0w', 'access_token': access_token}
			, method:'GET'
		})
		.done(function(e){
	        //프로필을 가져온다.
			var profile = googleUser.getBasicProfile();
			console.log(profile)
		})
		.fail(function(e){
			console.log(e);
		})
	}
	function onSignInFailure(t){		
		console.log(t);
	}
	      
      
      
      
      
   </script>
</body>
</html>