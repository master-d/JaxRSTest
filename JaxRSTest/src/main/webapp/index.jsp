<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div id="console">Console Data</div>

<script type="text/javascript">
$.ajax({
	type: "GET",
	url: 'api/carrier/verizon',
	contentType: 'application/json',
	dataType: 'application/json'
}).done(function(data) {
	$("#console").html(JSON.stringify(data));
}).fail(function(xhr) {
	$("#console").html(xhr.responseText);
});
</script>
</body>
</html>