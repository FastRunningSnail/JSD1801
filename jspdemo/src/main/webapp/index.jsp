<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>jsp页面</title>
</head>
<body>
	<%@ include file="index.html"%>
	<jsp:include page="index.html" />
	<h1>第一个jsp页面</h1>
	<%-- 以下是利用java脚本实现一个简单的时钟，显示在页面上 --%>
	<%
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String now_string = sdf.format(now);
	%>

	<h2><%=now_string%></h2>
	<%-- 以下是EL表达式的语法及基本用法 --%>
	<h2>${123 + 456}</h2>
	<h2>${empty('')}</h2>
	<h2>${1 > 2 }</h2>
	<h2>${1 gt 2 }</h2>
	<h2>${1 eq 1 }</h2>
	<h2>${101 mod 10 }</h2>
	<h2>${10.1 * 10 }</h2>
	<h2>${10.1 * 10 gt 100 and 101 eq 100 }</h2>
	<h2>${!false }</h2>

	<%-- jsp的内置对象：request，response，session --%>
	<%
		String userAgent = request.getHeader("user-agent");
		String host = request.getHeader("Host");
		String requestURL = request.getRequestURL().toString();
	%>
	<h2><%=userAgent%></h2>
	<h2><%=host%></h2>
	<h2><%=requestURL%></h2>
</body>
</html>