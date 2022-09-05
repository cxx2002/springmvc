<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
<br><br>
<a href="javascript:showStu()">访问服务器返回学生集合</a>
<div id="myDiv">等待服务器返回数据</div>
<script type="text/javascript">
    function showStu() {
        $.ajax({
            url: '${pageContext.request.contextPath}/list.action',
            method: 'get',
            dataType: 'json',
            success: function(stuList){
                var s = "";
                $.each(stuList, function(i,stu){
                    s+=stu.name + "----" + stu.age + "<br>"
                })
                //回显数据
                $("#myDiv").html(s);
            }
        })
    }
</script>
</body>
</html>