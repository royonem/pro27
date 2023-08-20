<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
<style>
.text_center {
	text-align: center;
}
</style>
</head>
<body>
	<form method="post" action="${contextPath}/book/addBook.do">
		<h1 class="text_center">Add Book</h1>
		<table align="center">
			<tr>
				<td width="200"><p align="right">Study Date</td>
				<td width="400"><input type="text" name="studyDate"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">Study Title</td>
				<td width="400"><input type="text" name="studyTitle"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">Total Chapters</td>
				<td width="400"><p>
						<input type="text" name="totalChapters"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">Study Details</td>
				<td width="400"><p>
						<textarea name="studyDetails" = rows="20" cols="50"> </textarea>
					</p></td>
			</tr>
			<tr>
				<td width="200"><p>&nbsp;</p></td>
				<td width="400"><input type="submit" value="등록하기"> <input
					type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
</body>