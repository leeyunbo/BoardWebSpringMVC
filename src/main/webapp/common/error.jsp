<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ȭ��</title>
</head>
<body bgcolor ="#ffffff" text="#000000">
<!-- Ÿ��Ʋ ���� -->
<table width="100%" border="1" cellspacing="0" cellpadding="0">
	<tr><td align="center" bgcolor="orange"><b>�⺻ ���� ȭ���Դϴ�.</b></td></tr>
</table>

<!-- ���� �޽��� -->
<table width="100%" border="1" cellspacing="0" cellpadding="0" align="center">
	<tr>
		<td align="center">
		<br><br><br><br><br> 
		Message : ${exception.message }
		<br><br><br><br><br>
		</td>
	</tr>
</table>
</body>
</html>