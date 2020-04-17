<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/styles/main.css"/>" type="text/css" rel="stylesheet" />
    <title>查看学生成绩</title>
</head>
<body>
<div class="main">
    <h2 class="title"><span>查看学生成绩</span></h2>
    <form action="<c:url value="/grade/deletes?pageNO=${pageNO}"/>" method="post">
        <table border="1" width="100%" class="tab">
            <tr>
                <th><input type="checkbox" id="chbAll"></th>
                <th>学生编号</th>
                <th>学生姓名</th>
                <th>平时成绩</th>
                <th>考试成绩</th>
                <th>操作</th>
            </tr>
            <c:forEach var="entity" items="${colist}" varStatus="status">
                <tr>
                    <th><input type="checkbox" name="id" value="${entity.id}"></th>
                    <td>${entity.sid}</td>
                    <td>${entity.studentName}</td>
                    <td>${entity.pgrade}</td>
                    <td>${entity.kgrade}</td>
                    <td>
                        <a href="<c:url value="/grade"/>delete/${entity.id}?pageNO=${pageNO}" class="abtn">删除</a>
                        <a href="edit/${entity.id}" class="abtn">编辑</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div id="pager"></div>
        <p>
            <input type="submit"  value="批量删除" class="btn out"/>
        </p>
        <p style="color: red">${message}</p>
        <!--分页 -->
        <script type="text/javascript" src="<c:url value="/styles/bootstrap/js/jquery-1.10.2.js"/>" ></script>
        <link href="<c:url value="/scripts/pagination.css"/>" type="text/css" rel="stylesheet" />
        <script type="text/javascript" src="<c:url value="/scripts/jquery.pagination.js"/>" ></script>
        <script type="text/javascript">
           //初始化分页组件
           var count=${count};
           var size=${size};
           var pageNO=${pageNO};
           $("#pager").pagination(count, {
              items_per_page:size,
               current_page:pageNO-1,
               next_text:"下一页",
               prev_text:"上一页",
               num_edge_entries:2,
               load_first_page:false,
               callback:handlePaginationClick
            });

           //回调方法
           function handlePaginationClick(new_page_index, pagination_container){
               location.href="<c:url value="/grade"/>list?pageNO="+(new_page_index+1);
           }
        </script>
    </form>
</div>
</body>
</html>
