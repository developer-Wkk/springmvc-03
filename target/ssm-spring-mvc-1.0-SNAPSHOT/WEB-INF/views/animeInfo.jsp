<%--
  Created by IntelliJ IDEA.
  User: zhukang
  Date: 2022/4/5
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>动漫详情页</title>
</head>
<body>
<%--当前路径${pageContext.request.contextPath}--%>
<!-- springmvc表单标签，form:开头，方便快速开发表单，方便数据回显 -->
<form:form action="/anime" method="post">
    <!-- 判断是新增还是修改，通过command对应的对象是否是空对象 -->
    <c:if test="${!empty command.id}" var="flag">
        <form:hidden path="id"/>
        <!-- 如果是修改，需要将post请求改为put请求 -->
        <input type="hidden" name="_method" value="put"/>
    </c:if>
    <table border="1px" width="50%" align="center" cellspacing="0">
        <tr style="height: 80px; font-size: 35px; background-color: #00ccf0;">
            <c:if test="${flag}">
                <th colspan="2">修改动漫详情</th>
            </c:if>
            <c:if test="${!flag}">
                <th colspan="2">新增动漫详情</th>
            </c:if>
        </tr>
        <tr>
            <td>新闻分类：</td>
            <!-- form:select，下拉列表，path属性指定的是select的id和name属性（可以根据path的属性值，实体参数取值），items指定要遍历的集合，自动遍历（添加option），itemValue对应option选择的value值，itemLabel对应option选择显示的内容，即<option value="itemValue">itemLabel</option> -->
            <td><form:select path="cid" items="${categories}" itemLabel="name" itemValue="id"/></td>
        </tr>
        <tr>
            <td>动漫名称<span style="color:red;">(*)</span>：</td>
            <!-- form:input，单行文本，path属性指定的是实体属性名，页面元素类似于：<input type="text" id="name" name="name" value=""/>，（还可以根据path的属性值，实体参数取值） -->
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>动漫作者<span style="color:red;">(*)</span>：</td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td>动漫主角<span style="color:red;">(*)</span>：</td>
            <td><form:input path="actor"/></td>
        </tr>
        <tr>
            <td colspan="2"
                style="height: 40px;font-size: 16px; text-align: center;">
                <input type="submit" value="提&nbsp;&nbsp;交" />
                <input type="button" value="返&nbsp;&nbsp;回" />
            </td>
        </tr>
    </table>
</form:form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
<script>
    $(function (){
        // alert(123);
        $("input[type=button]").click(function (){
            history.back();
        })
    })
</script>
</html>
