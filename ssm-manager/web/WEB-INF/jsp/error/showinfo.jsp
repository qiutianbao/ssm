<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" %>
<%@ include file="/WEB-INF/jsp/include/includes.jsp"%>
<%
	Exception ex = (Exception)request.getAttribute("exception");
	//StackTraceElement element = ex.getStackTrace()[0];
	ex.printStackTrace();
%>
<html>
<head>
<title>吉祥天宝数据管理平台</title>
</head>
<body>
<center>系统繁忙，请稍后再试!</center>
</body>
</html>