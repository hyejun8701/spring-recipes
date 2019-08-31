<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Reservation Query</title>
</head>

<body>
<form method="post">
    Court Name
    <input type="text" name="courtName" value="${courtName}">
    <input type="submit" value="Query">
</form>

<table border="1">
    <tr>
        <td>Court Name</td>
        <td>Date</td>
        <td>Hour</td>
        <td>Player</td>
    </tr>
</table>
<h2>Welcome to Court Reservation System</h2>
Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />
</body>
</html>