<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VendorWEB &middot; Add Vendor</title>
</head>
<body>
	<h2>Enter Vendor Data</h2>
	<form action="updateVendor" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" value="${vendor.id}" readonly="readonly"/></td>
			</tr>
			<tr>
				<td>Code</td>
				<td><input type="text" name="code" value="${vendor.code}" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${vendor.name}" /></td>
			</tr>
			<tr>
				<td>Type</td>
				<td><select name="type">
						<option value="REGULAR" ${vendor.type=='REGULAR'?'selected':''}>Regular</option>
						<option value="CONTRACT" ${vendor.type=='CONTRACT'?'selected':''}>Contract</option>
				</select></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="${vendor.email}" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone" value="${vendor.phone}" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><textarea name="address">${vendor.address}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>
</body>
</html>
