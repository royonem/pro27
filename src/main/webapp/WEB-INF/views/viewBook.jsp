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
</style>
</head>
<body>
	<form method="post" action="${contextPath}/book/modBook.do">
		<h1 class="text_center">학습 내용</h1>
		<table align="center">
			<tr>
				<td width="200"><p align="right">${studyDate}</td>
				<td width="400"><p>
					</p></td>
			<tr>
				<td width="200"><p align="right">${studyTitle}</td>
				<td width="400"><p>
					</p></td>
			<tr>
				<td width="200"><p align="right">${totalChapters}</td>
				<td width="400"><p>
					</p></td>
			</tr>
			<tr>
				<td width="200"><p align="right">${studyDetails}</td>
				<td width="400"><p>
					</p></td>
			</tr>
			<tr>
				<td width="200"><p>&nbsp;</p></td>
				<td width="400">
					<input type="submit" value="수정하기">
					<input type="reset" value="다시입력">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>