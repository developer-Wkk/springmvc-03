<%--
  Created by IntelliJ IDEA.
  User: zhukang
  Date: 2022/4/5
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>动漫列表</title>
</head>
<body>
<h2 style="text-align: center">欢迎使用课工场动漫管理系统</h2>
<table border="1px" cellspacing="0" style="width: 90%; margin: 0 auto;">
    <thead>
    <tr style="height: 80px; font-size:30px;">
        <th colspan="7">动漫列表</th>
    </tr>
    <tr style="height: 50px; background-color: #00ccf0">
        <th>编号</th>
        <th>分类</th>
        <th>名称</th>
        <th>作者</th>
        <th>主角</th>
        <th>时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${animes}" var="anime">
            <tr align="center">
                <td>${anime.id}</td>
                <td>${anime.cid}</td>
                <td>${anime.name}</td>
                <td>${anime.author}</td>
                <td>${anime.actor}</td>
                <td><fmt:formatDate value="${anime.createDate}" pattern="yyyy-MM-dd"/></td>
                <td>
                    <a href="/anime/${anime.id}">修改</a>&nbsp;&nbsp;
                    <a href="/delAnime/${anime.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
    <tfoot>
    <tr>
        <td colspan="7" style="height: 50px; text-align: center">
            <a href="toAddAnime">添加动漫</a>
        </td>
    </tr>
    </tfoot>
</table>
</body>
</html>
