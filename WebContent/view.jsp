<%@page import="com.sesoc.student.Bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생증 생성 결과</title>
<link href="css/student.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src = "js/check.js"></script>
<script type="text/javascript" src = "js/validCheck.js"></script>
</head>
<body>

<% 
Bean b = (Bean)request.getAttribute("b");

%>

<table class = "headTable">
	<tr>
		<td class = "headTd"><h3>학생증</h3></td>
	</tr>
	<tr>
		<td class = "headTd"><img class = "img" src="img/<%=b.getProfile() %>"></td>
	</tr>
	<tr>
		<td class = "bodyTd">이름 : <%=b.getName() %></td>
	</tr>
	
	<tr>
		<td class = "bodyTd">학번 : <%=b.getStuNum() %></td>
	</tr>
	
	<tr>
		<td class = "bodyTd">주민등록번호 : <%=b.getPerNum() %></td>
		<td class = "bodyTd"> - <%=b.getPerNum2() %></td>
	</tr>
	<tr>
		<td class = "bodyTd">주소 : <%=b.getAddress() %></td>
	</tr>
	
</table>
<footer class = "footer">해당 학생증은 본인 이외의 사용을 금합니다.</footer>


</body>
</html>