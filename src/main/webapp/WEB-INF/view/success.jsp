<%--
  Created by IntelliJ IDEA.
  User: wanwan
  Date: 16/7/11
  Time: 下午6:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
dddd
<table>

    <c:forEach items="${adminList}" var="admin">

        <tr> <td>${admin.name}</td></tr>
    </c:forEach>


</table>

</body>
</html>
