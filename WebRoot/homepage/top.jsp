<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>

  <body>
  	<br/>
  	<div>
  		<table width="100%">
  			<tr>
  			    <td width="165px">

  				</td>
  				<td><font face="SimSun" color="#6495ED" size="26">学生管理系统</font></td>
  				<td align="right" valign="bottom" style="padding-right: 20px">
  				   <font face="SimSun" color="#6495ED" style="text-decoration:none" size="5">
  					  欢迎您!</font> <a style="cursor:pointer">
  				    <font color="red" size="5">
  				          <a  href="${pageContext.request.contextPath}/admin/quit" target="_parent"> 退出</a>
  				    </font></a>
  				</td>
  			</tr>
  		</table>
  	</div>
  </body>
</html>
