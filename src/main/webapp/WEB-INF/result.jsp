<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h1 style="text-decoration: underline;">Submitted Info</h1>
<h1>
    Name: <c:out value="${sessionScope.name}"/>

</h1>
<h1>
    Location: <c:out value="${sessionScope.location}"/>

</h1>
<h1>
    Favorite Language: <c:out value="${sessionScope.language}"/>

</h1>
<h1>
    Comment: <c:out value="${sessionScope.comment}"/>
</h1>
</body>
</html>