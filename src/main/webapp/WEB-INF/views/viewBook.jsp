<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학습 내용</title>
<style>
.text_center {
	text-align: center;
}

.form-center {
	text-align: center;
	margin-top: 20px;
}
</style>
</head>
<body>
		<h1 class="text_center">학습 내용</h1>
		<table align="center" border="1">
			<tr>
				<td width="200">학습일자</td>
				<td width="400">${bookDetails.studyDate}</td>
			<tr>
				<td width="200">학습 제목</td>
				<td width="400">${bookDetails.studyTitle}</td>
			<tr>
				<td width="200">수업량</td>
				<td width="400">${bookDetails.totalChapters}</td>
			</tr>
			<tr>
				<td width="200">학습 세부 내용</td>
				<td width="400"><pre>${bookDetails.studyDetails}</pre></td>
			</tr>
		</table>
		<div class="form-center">
			<button	onclick="window.location='${contextPath}/book/editForm.do?num=${bookDetails.num}'">학습 수정 하기</button>
			<button onclick="window.location='${contextPath}/book/bookForm.do'">학습 추가 하기</button>
			<button onclick="window.location='${contextPath}/book/removeBook.do?num=${bookDetails.num}'">학습 삭제 하기</button>
			<button onclick="window.location='${contextPath}/book/listBooks.shinoo'">학습 목록 가기</button>
		</div>
</body>
</html>