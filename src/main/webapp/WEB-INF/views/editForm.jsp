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
<title>회원 정보 수정창</title>
<style>
.text_center {
	text-align: center;
}
</style>
</head>
<body>
	<form method="post" action="${contextPath}/book/editBook.do">
		<h1 class="text_center">회원 정보 수정창</h1>
		<table align="center">
			<tr>
				<input type="hidden" name="num" value="${bookDetails.num}">
			</tr>
			<tr>
				<td width="200"><p align="right">학습일자</td>
				<td width="400"><input type="text" name="studyDate" value="${bookDetails.studyDate}"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">학습 제목</td>
				<td width="400"><input type="text" name="studyTitle" value="${bookDetails.studyTitle}"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">수업량</td>
				<td width="400"><p>
						<input type="number" value="${bookDetails.totalChapters}"> </td>
			</tr>
			<tr>
				<td width="200"><p align="right">학습 세부 내용</td>
				<td width="400"><p>
						<textarea name="studyDetails" rows="20" cols="50"> ${bookDetails.studyDetails} </textarea>
					</p></td>
			</tr>
			<tr>
				<td width="200"><p>&nbsp;</p></td>
				<td width="400">
					<input type="submit" value="수정하기">
					<input type="button" class="text_center" value="학습 목록 가기"  
		onClick="window.location='${contextPath}/book/listBooks.shinoo'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>