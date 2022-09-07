<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ include file="../includes/header.jsp" %>
<style type="text/css">
.sell_list_thumb:hover{opacity: 0.5; cursor:pointer;}
.filter:hover{opacity: 0.5; cursor:pointer;}
</style>
<section class="section" id="sell_list">
   <div class="container">
      <div class="row">
         <div class="board_list_category">
            <div class="col-lg-12">
               <div class="inner-content">
                  <span class="filter frm" data-oper="sell_btn">전체보기</span>
                  <span>|</span>&nbsp;&nbsp;
                  <span class="filter n frm" data-oper="sell_N_btn">판매중</span> &nbsp;
                  <span class="filter y frm" data-oper="sell_Y_btn">거래완료</span>
               </div>
            </div>
         </div>
      </div>
   </div>
   <div class="container">
      <div class="row">
         <div class="col-lg-6">
              <div class="section-heading">
               <h2>판매 목록</h2>
            </div>
         </div>
      </div>
   </div>
    <div class="container">
      <div class="row">
      <form role="form">
      <input type="hidden" name="my_id" value="${login.us_id}">
      <% String filter = request.getParameter("filter"); %>
      <input type="hidden" name="filter" id="filter" value="<%=filter%>">
      <input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum }">
     <input type="hidden" name="amount" value="${pageMaker.cri.amount }">
            <table>
               <tbody>
               <c:choose>
                  <c:when test="${fn:length(sell) > 0 }">
                     <c:forEach items="${sell}" var="sell" varStatus="status">
                     <%
                     String bo_ok = "";
                  %>
                  <c:if test="${sell.bo_ok == 0}">
                     <% bo_ok = "판매중"; %>
                  </c:if>
                  <c:if test="${sell.bo_ok == 1}">
                     <% bo_ok = "판매완료"; %>
                  </c:if> 
                           <tr>
                              <td><input type="hidden" name="bo_num" value="${sell.bo_num}"></td>
                              <td>
                                 <div class="sell_list_thumb">
                                    <img src="<spring:url value='/img/${sell.bo_image}'/>" width="40%" height="10%" 
                                       class="thumb frm" data-oper="thumb_btn">
                                    <c:out value="${sell.bo_title}"/>
                                 </div>
                              </td>
                              <td width="20%">
                                 <c:out value="${sell.bo_price}"/>원
                              </td>
                              <td width="20%">
                                 <c:out value="<%=bo_ok%>"/>
                              </td>
                              <td width="20%">
                                 <fmt:formatDate pattern="yyyy/MM/dd" value="${sell.bo_regdate}"/>
                              </td>
                           </tr>   
                      </c:forEach>
                  </c:when>
                  <c:otherwise>
                     <div class="container" style="padding: 120px 0 120px 0;">
						<div class="row justify-content-md-center">
							<div class="col-md-auto">
								<p class="h3 text-center">찜한 상품이 존재하지 않습니다.</p>
							</div>
						</div>
					</div>
                  </c:otherwise>
               </c:choose>
               </tbody>
               <tr>
               <td>
               
               <!-- 페이지 처리 Start -->
            <div class="container">
     		 <div class="row"> 
            <div class="col-lg-12">
               <div class="pagination">
	               <ul>
	               
	               <c:if test="${pageMaker.prev }">
	                  <li class="frm paginate_button previous">
	                  <a href="${pageMaker.startPage-1 }"><i class="fa fa-chevron-left" aria-hidden="true"></i></a>
	                  </li>
	               </c:if>
	               
	               <c:forEach var="num" begin="${pageMaker.startPage }" end="${pageMaker.endPage }">
	                  <li class="frm paginate_button ${pageMaker.cri.pageNum == num ? 'active' : ''}">
	                  <a href="${num }">${num }</a>
	                  </li>
	               </c:forEach>
	
	               <c:if test="${pageMaker.next }">
	                  <li class="frm paginate_button next">
	                  <a href="${pageMaker.endPage+1 }"><i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                  </li>
	               </c:if>
	               </ul>
	            </div>
            </div>
            </div>
            </div>
            <!-- 페이지 처리 End -->
            </td>
            </tr>
            </table>
            
            
         </form>
       </div>
    </div>
    
</section>

<script type="text/javascript">
//폼 실행
$(document).ready(function(){
   var formObj = $("form");
   
   $('.frm').on("click", function(e){
      e.preventDefault();
      
      var operation = $(this).data('oper');
      console.log(operation);
      
      if(operation === 'thumb_btn'){
         formObj.attr("action","/board/boardDetail").attr("method","get");
          var bo_NumTag = $("input[name='bo_num']").clone();
          formObj.empty();
          formObj.append(bo_NumTag);
      }else if(operation === 'sell_N_btn'){
         formObj.attr("action","/mypage/sellBoard").attr("method","get");
         var my_IdTag = $("input[name='my_id']").clone();
         var filterTag = $('#filter').val('판매중').clone();
          formObj.empty();
          formObj.append(my_IdTag);
          formObj.append(filterTag);
      }else if(operation === 'sell_Y_btn'){
         formObj.attr("action","/mypage/sellBoard").attr("method","get");
         var my_IdTag = $("input[name='my_id']").clone();
         var filterTag = $('#filter').val('판매완료').clone();
          formObj.empty();
          formObj.append(my_IdTag);
          formObj.append(filterTag);
      }else if(operation === 'sell_btn'){
         formObj.attr("action","/mypage/sellBoard").attr("method","get");
          var my_IdTag = $("input[name='my_id']").clone();
          var filterTag = $('#filter').val('').clone();
          formObj.empty();
          formObj.append(my_IdTag);
          formObj.append(filterTag);
      }
      formObj.submit();
   });
   
   $(".paginate_button a").on("click", function(e){
      e.preventDefault(); //페이지가 바로 넘어가는것을 방지하기 위한 코드
   
      
    formObj.attr("action","/mypage/sellBoard").attr("method","get");
    var my_IdTag = $("input[name='my_id']").clone();
    var filterTag = $('#filter').clone();
    var pageNumTag = formObj.find("input[name='pageNum']").val($(this).attr("href"));
    formObj.empty();
    formObj.append(my_IdTag);
    formObj.append(filterTag);
    formObj.append(pageNumTag);
      
      formObj.submit();
   });
   
});

//뒤로가기가 감지되면 현재 페이지 새로고침
 window.onpageshow = function(e) {
   if (e.persisted || (window.performance && window.performance.navigation.type == 2)) {
      location.reload();
   }
} 


</script>

<%@ include file="../includes/footer.jsp" %>