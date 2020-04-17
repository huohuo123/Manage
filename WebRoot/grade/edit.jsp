<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link href="<c:url value="/styles/main.css" />" type="text/css"
    rel="stylesheet" />
<title>编辑学生成绩</title>
<base href="<c:url value="/" />" />
</head>
<body>
    <div class="main">
        <h2 class="title">
            <span>编辑学生成绩</span>
        </h2>
        <form:form action="grade/editSave" modelAttribute="entity">
            <fieldset>
                <legend>成绩</legend>
               <p>
                <label for="studentName">学生名称：</label>
                <form:input path="studentName" size="50"/>
                <form:errors path="studentName" cssClass="error"></form:errors>
            </p>
                <p>
                    <label for="pgrade">平时成绩：</label>
                    <form:input path="pgrade" size="50"/>
                    <form:errors path="pgrade" cssClass="error"></form:errors>
                </p>
            <p>
                <label for="kgrade">考试成绩：</label>
                <form:input path="kgrade" size="50"/>
                <form:errors path="kgrade" cssClass="error"></form:errors>
            </p>
            
            <form:hidden path="id" />
            <input type="submit" value="保存" class="btn out">
            </fieldset>
        </form:form>
        <p style="color: red">${message}</p>
        <form:errors path="*"></form:errors>
        <p>
            <a href="grade/getStuGrade" class="abtn out">返回列表</a>
        </p>
    </div>
</body>
</html>