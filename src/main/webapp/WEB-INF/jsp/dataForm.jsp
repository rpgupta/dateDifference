<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ex" uri="/WEB-INF/custom.tld"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Data Form</title>
<link href="/css/form.css" rel="stylesheet">
</head>
<body>
	<br>
	<br>
	<table border="1">
		<tr>
			<td><h2>
					<ex:CustomTag />
				</h2></td>
		</tr>
		<c:forEach items="${list}" var="item">
			<tr>
				<td>Number of days between ${item.fromDate} And ${item.toDate}
					= ${item.daysDiff}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
