<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>    


<html>
<head>
<meta charset=UTF-8">
<title>책 목록</title>
</head>
<body>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="lightgreen">
      <td ><b>num</b></td>
      <td><b>학습 일자</b></td>
      <td><b>학습 내용</b></td>
<!--       <td><b>학습 세부 내용</b></td> -->
      <td><b>학습량</b></td>
      <td><b>삭제</b></td>
   </tr>
   
 <c:forEach var="book" items="${bookList}" >     
   <tr align="center">
      <td>${book.num}</td>
      <td>${book.studyDate}</td>
      <td>${book.studyTitle}</td>
<%--       <td>${book.studyDetails}</td> --%>
      <td>${book.totalChapters}</td>
      <td><a href="${contextPath}/book/removeBook.do?num=${book.num}">삭제하기</a></td>
    </tr>
  </c:forEach>   
</table>
<a  href="${contextPath}/book/bookForm.do"><h1 style="text-align:center">학습 추가하기</h1></a>
</body>
</html>
