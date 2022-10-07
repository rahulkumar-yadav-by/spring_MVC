<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core"  prefix="c" %>


<!DOCTYPE html>

<html>

    <head><title>Athlete Details</title></head>

    <body>
        <h1>Athlete Details</h1>
        <h2>Athlete Details Added</h2>
        <p>Name : ${athlete.name}</p>
        <p>Country : ${athlete.country}</p>
        <p>Rank: ${athlete.rank}</p>

        <p>
        Tournament List:
        <c:forEach var="tournament" items="${athlete.tournaments}">
            <li>${tournament}</li>
        </c:forEach>
        </p>
    </body>

</html>