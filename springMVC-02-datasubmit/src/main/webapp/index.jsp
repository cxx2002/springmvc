<%--
  Created by IntelliJ IDEA.
  User: 陈喜喜
  Date: 2022/7/31
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>index.jsp</title>
</head>
<body>
<br><br><h2>测试不同的请求提交方式</h2>
<form action="${pageContext.request.contextPath}/req.action" method="post">
    <input type="submit" value="提交">
</form>
<h1>1.单个数据提交</h1>
<form action="${pageContext.request.contextPath}/one.action" >
    姓名<input name="uname"><br>
    年龄<input name="uage"><br>
    <input type="submit" value="提交">
</form>
<h1>2.对象封装数据提交</h1>
<form action="${pageContext.request.contextPath}/two.action" >
    姓名<input name="name"><br>
    年龄<input name="age"><br>
    <input type="submit" value="提交">
</form>
<h1>3.动态占位符提交</h1>
<a href="${pageContext.request.contextPath}/three/张三/20.action">动态占位符提交</a><br>
<h1>4.参数名称不一致解决方案</h1>
<form action="${pageContext.request.contextPath}/four.action" method="post">
    姓名<input name="uname"><br>
    年龄<input name="uage"><br>
    <input type="submit" value="提交">
</form>
<h1>5.手工提取数据</h1>
<form action="${pageContext.request.contextPath}/five.action" method="get">
    姓名<input name="name"><br>
    年龄<input name="age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
