<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Home</title>
</head>
<body>
<h1>
	스프링 작심 5일  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P><a href= "http://localhost:9000/sts/book/listBooks.shinoo">학습 목록으로 이동</a></P>
</body>
</html>
