<%--
  Created by IntelliJ IDEA.
  User: 陈喜喜
  Date: 2022/7/31
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main.jsp</title>
</head>
<body>
<h1>main................................................................</h1>
<%--        request. setAttribute ( "requestUsers" ,u);
            session. setAttribute ("sessionUsers" ,u) ;
            model . addAttribute ("modelUsers" ,u) ;
            map. put ("mapUsers" ,u) ;
            modelMap . addAttribute ("modelMapUsers",u) ;
--%>
requestUsers: ${requestUsers}<br>
sessionUsers: ${sessionUsers}<br>
mode lUsers: ${modelUsers}<br>
mapUsers: ${mapUsers}<br>
mode lMapUsers: ${modelMapUsers}<br>

</body>
</html>
