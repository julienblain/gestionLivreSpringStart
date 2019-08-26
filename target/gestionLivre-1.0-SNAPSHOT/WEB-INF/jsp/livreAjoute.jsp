<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Livre enregirstré</h1>
        <table>
            <tr>
                <td> Titre </td>
                <td>  ${titre} </td>
            </tr>
            <tr><td> auteur </td>
                <td>${auteur} </td></tr>
            <tr> <td> categorie </td>
                <td>
                    <c:forEach var="cat" items="${categorie}">
                    ${cat.categorie} </td></tr>
            </c:forEach>
            <tr><td> langue </td>
                <td>${langue} </td></tr>
        </table>
    </body>
</html>
