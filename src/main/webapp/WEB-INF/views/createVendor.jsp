<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VendorWEB &middot; Add Vendor</title>
</head>
<body>
	<h2>Enter a New Vendor</h2>
	<form action="saveVendor" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Code</td>
				<td><input type="text" name="code" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Type</td>
				<td><select name="type">
						<option value="REGULAR">Regular</option>
						<option value="CONTRACT">Contract</option>
				</select></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><textarea name="address"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>
	<p>${message}</p>
	<br />
	<p>
		<a href="showAllVendors">View All</a>
	</p>
</body>
</html>
