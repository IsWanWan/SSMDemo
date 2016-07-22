<%--
  Created by IntelliJ IDEA.
  User: wanwan
  Date: 16/7/22
  Time: 上午10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table width="600px">

    <tr>
        <td width="100px">用户名</td>
        <td width="100px">邮箱</td>
        <td width="100px">电话</td>
        <td width="300px">操作</td>

    </tr>
   <c:forEach items="${operatorList}" var="opertor">
       <tr>
           <td>${opertor.loginName}</td>
           <td>${opertor.email}</td>
           <td>${opertor.mobile}</td>
           <td>
               <shiro:hasPermission name="TOperator:modify">
                   <input type="button" value="修改">
               </shiro:hasPermission>

               <shiro:hasPermission name="TOperator:remove">
                   <input type="button" value="删除">
               </shiro:hasPermission>
               <shiro:hasPermission name="TOperator:resetPassword">
                   <input type="button" value="密码重置">
               </shiro:hasPermission>

           </td>
       </tr>
   </c:forEach>


</table>

</body>
</html>
