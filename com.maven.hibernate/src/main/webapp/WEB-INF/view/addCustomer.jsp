<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>

<body>

<div>
<form:form action="saveCustomer" modelAttribute="newCustomer" method="Post">

<form:label path="firstname">First Name</form:label>
<form:input path="firstname"/><br>

<form:label path="lastname">Last Name</form:label>
<form:input path="lastname"/><br>

<form:label path="email">Email</form:label>
<form:input path="email"/><br>

<input type = "submit" value ="save customer">
</form:form>
</div>





</body>

</html>