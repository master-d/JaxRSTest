<%@page import="javax.ws.rs.ApplicationPath"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/ItmdScripts/js/jquery.min.js"></script>
<script src="/ItmdScripts/js/message.js"></script>
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