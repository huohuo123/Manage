<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
    <frameset rows="10%,90%"  border="1" framespacing="-4px">
		<frame src="homepage/top.jsp" name="top"  scrolling="no" noresize="noresize"></frame>
		<frameset cols="10%,90%">
			<frame src="homepage/left.jsp" name="left"></frame>
			<frame name="right"></frame>
		</frameset>
	</frameset>
</html>
