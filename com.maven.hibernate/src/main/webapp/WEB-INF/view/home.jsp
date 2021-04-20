<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<body>

	<h1>Customer CRUD Screen</h1>

	<hr>
	<div>
		<table border=1>
			<tr>
				<td>ID</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Email</td>
				<td>Action</td>
			</tr>
			<c:forEach var="customer" items="${customers}">
				<c:url var="updatelink" value="/updateCustomer">
					<c:param name="custId" value="${customer.id}"></c:param>
				</c:url>

				<c:url var="deleteLink" value="/deleteCustomer">
					<c:param name="deletecustid" value="${customer.id}"></c:param>
				</c:url>




				<tr>
					<td>${customer.id}</td>
					<td>${customer.firstname}</td>
					<td>${customer.lastname}</td>
					<td>${customer.email}</td>
					<td><a href=${updatelink}> Update </a> <a href=${deleteLink
						} onclick="if(!(confirm('Are you sure Do you want to delete this customer'))) return false"> Delete </a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<input type=button value="Add Customer"
		onclick="window.location.href='addCustomer'; return false; ">
</body>

</html>