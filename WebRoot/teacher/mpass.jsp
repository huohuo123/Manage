<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link href="<c:url value="/styles/main.css" />" type="text/css"
          rel="stylesheet" />
    <title>修改个人密码</title>
    <base href="<c:url value="/" />" />
</head>
<body>
<div class="main">
    <h2 class="title">
        <span>修改个人密码</span>
    </h2>
    <form:form action="tea/modify" modelAttribute="entity">

        <fieldset>
            <legend>修改密码</legend>
            <p>
                <label for="loginname">用户名：</label>
                <form:input path="loginname" size="50"/>
                <form:errors path="loginname" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="password">密码：</label>
                <form:input path="password" size="50"/>
                <form:errors path="password" cssClass="error"></form:errors>
            </p>

            <form:hidden path="id" />
            <input type="submit" value="保存" class="btn out">
        </fieldset>
    </form:form>
    <p style="color: red">${message}</p>
    <form:errors path="*"></form:errors>
</div>
</body>
</html>