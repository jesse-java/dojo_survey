<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<form action="/login" method="POST" border="1">
    Your Name: <input type="text" name="name">
    Dojo Location: <input type="text" name="location">
    Favorite Language: <input type="text" name="language">
    Comment(optional): <textarea name="comment" id="" cols="30" rows="10"></textarea>
    <input type="submit" value="Submit">
</form>
</html>