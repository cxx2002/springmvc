<%--
  Created by IntelliJ IDEA.
  User: 陈喜喜
  Date: 2022/8/1
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jst1核心标签库--%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%--导入jst1格式化标签库--%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>show.jsp</title>
</head>
<body>
show......
<br><h2>学生集合</h2>
<table width="800px" border="1">
    <tr>
        <th>姓名</th>
        <th>生日</th>
    </tr>
    <c:forEach var="item" items="${list}">
        <tr>
            <td>${item.name}</td>
            <td>${item.birthday}--------- <fmt:formatDate value="${item.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        </tr>
        </c:forEach>
</table>
</body>
</html>
