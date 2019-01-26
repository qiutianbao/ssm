<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateQuestion.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <center>
      <form action="updateQuestion" method="post">
        <table>
          <tr>
            <td>问题：</td>
            <td>
              <input type="text" name="questions.title" value="${questions.title }">
            </td>
          </tr>
          <tr>
            <td>问题描述：</td>
            <td>
            <input type="text" name="questions.detaildesc" value=" ${questions.detaildesc }">
           </td>
          </tr>
          <tr>
            <td>回答次数：</td>
            <td>
            <input type="text" name="questions.answercount" value="${questions.answercount }">
            </td>
          </tr>
          <tr>
            <td>最后修改：</td>
            <td>
            <input type="text" name="questions.lastmodified" value="${questions.lastmodified }">
            </td>
          </tr>
          <tr>
            <td>
              <input type="submit" value="提交答案">
            </td>
          </tr>
        </table>
      </form>
    </center>
  </body>
</html>
