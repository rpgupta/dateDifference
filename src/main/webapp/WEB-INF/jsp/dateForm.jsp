<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Date Form</title>
<link href="/css/form.css" rel="stylesheet">
</head>
<script type="text/javascript" src="/js/jquery.min.js"></script>

<body>
	<h2>Date Difference - Julian Day Number formula</h2>
	<form:form action="submitDateForm" modelAttribute="dateValues"
		id="dateForm">
		<br>
		<br>
		<table border="1">
			<tr>
				<td><span style="color: red">*</span>From Date:</td>

				<td><form:input path="fromDate" /> <span
					style="color: red; display: none" id="errMsg"></span></td>
			</tr>
			<tr>
				<td><span style="color: red">*</span>To Date:</td>

				<td><form:input path="toDate" /> <span
					style="color: red; display: none" id="errMsg"></span></td>
			</tr>
			<tr>
				<td>Number Of Days:</td>
				<td><form:input path="daysDiff" readonly="true" /></td>
			</tr>
		</table>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
	<script type="text/javascript" src="/js/form.js"></script>
</body>
</html>
