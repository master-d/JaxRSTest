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
	url: 'api/add/5/6'
}).done(function(data) {
	$("#console").append($("<div>" + data + "</div>"));
}).fail(function(xhr) {
	$("#console").append($("<div>" + xhr.responseText + "</div>"));
});


$.ajax({
	type: "GET",
	url: 'api/carrier/verizon',
	//contentType: 'application/json',
	//dataType: 'application/json',
	headers: {
		Accept: "application/json",
		"Content-Type": "application/json"
	}     
}).done(function(data) {
	$("#console").append($("<div>" + JSON.stringify(data) + "</div>"));
}).fail(function(xhr) {
	$("#console").append($("<div>" + xhr.responseText + "</div>"));
});

$.ajax({
	type: "GET",
	url: 'api/san/someroute',
	//contentType: 'application/xml',
	dataType: 'application/xml',
	headers: {          
		Accept: "application/xml",
		"Content-Type": "application/xml"
	}     
}).done(function(data) {
	$("#console").append($("<div>" + JSON.stringify(data) + "</div>"));
}).fail(function(xhr) {
	$("#console").append($("<div>" + xhr.responseText + "</div>"));
});

</script>
</body>
</html>