<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/styles/main.css"/>"  type="text/css" rel="stylesheet" />
    <title>成绩查询</title>
</head>
<body>
<div class="main">
    <h2 class="title"><span>成绩查询</span></h2>
    <form action="<c:url value="/stu/getStuGrade"/>" method="post">
        <table border="1" width="100%" class="tab">
            <tr>
                <th><input type="checkbox" id="chbAll"></th>
                <th>课程名称</th>
                <th>平时成绩</th>
                <th>考试成绩</th>
                <th>总成绩</th>
                <th>代课教师</th>
            </tr>
            <c:forEach var="entity" items="${grlist}" varStatus="status">
                <tr>
                    <td>
                        <input type="checkbox" name="cou" value="${entity.id}"/>
                    </td>
                    <td>${entity.courseName}</td>
                    <td>${entity.pgrade}</td>
                    <td>${entity.kgrade}</td>
                    <td>${entity.zgrade}</td>
                    <td>${entity.teacherName}</td>
                </tr>
            </c:forEach>
        </table>

        <p style="color: red">${message}</p>
        <!--分页 -->
        <script type="text/javascript" src="<c:url value="https://code.jquery.com/jquery-2.1.1.min.js"/>" ></script>
    </form>
</div>
</body>
</html>
