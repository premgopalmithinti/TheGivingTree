<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>new Activity</h1>
<form method = "post" action="postsaveactivity" modelAttribute="act">

<p>Donation Date</p>
<br>
<input name ="donationDate" type ="date" required="required">
<br>
<p>Upload Image</p>
<br>
<input name="image" type="file" required ="required">
<br>
<p>Donar Name</p>
<br>
<input name="donarname" type = "text" required="required">
<br>
<p>City</p>
<br>
<input name="city" type = "text" required="required">
<br>

<input type ="submit" value="Upload Activity">

</form>

</body>
</html>