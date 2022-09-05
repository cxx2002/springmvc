<%--
  Created by IntelliJ IDEA.
  User: 陈喜喜
  Date: 2022/8/1
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
<br><br><br><br>
<a href="${pageContext.request.contextPath}/one.action">1.请求转发页面(默认)</a>
<a href="${pageContext.request.contextPath}/two.action">2.请求转发action</a>
<a href="${pageContext.request.contextPath}/three.action">3.重定向页面</a>
<a href="${pageContext.request.contextPath}/four.action">4.重定向action</a>
<br><br><br>
<a href="${pageContext.request.contextPath}/data.action?name=hello">访问服务器，进行数据携带跳转</a>
<br><br><br>
<form action="${pageContext.request.contextPath}/myDate.action">
    日期：<input type="date" name="myDate"><br>
    <input type="submit" value="提交">
</form>
<br><br><br>
<a href="${pageContext.request.contextPath}/list.action">显示日期集合对象的日期成员</a>
</body>
</html>
