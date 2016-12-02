<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<table class="table table-striped">
		<caption>User is</caption>
		<thead>
			<tr>
				<th>Username</th>
				<th>Department</th>
				<th>Phone</th>
				<th>Year</th>
			</tr>
		</thead>

		<tbody>
				<tr>
					<td>${user.username}</td>
					<td>${user.phone}</td>
					<td>${user.department}</td>
					<td>${user.year}</td>
				</tr>
		</tbody>
	</table>
</div>
<%@ include file="common/footer.jspf"%>