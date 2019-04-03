<%--
    Document   : newjsp
    Created on : 19 Μαϊ 2017, 9:14:12 μμ
    Author     : Spyros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Hello Spring MVC</title>
    </head>

    <body>
        gggg
        <h2>${message}</h2>
        <h2>${name}</h2>

        <c:forEach items="${cust}" var="item">
            ${item.cname}<br>
        </c:forEach>
    </body>

</html>
