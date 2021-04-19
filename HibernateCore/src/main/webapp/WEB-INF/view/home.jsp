<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>

<body>

<h1> Hello </h1>

<c:forEach var = "customer" items="${customers}">

${customer.id}
${customer.firstname}
${customer.lastname}
${customer.email}

</c:forEach>

</body>

</html>