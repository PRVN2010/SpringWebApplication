<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
	<script type="text/javascript">
		$.noConflict();
		jQuery(document).ready(function(){
			jQuery("#btn").click(function(){
				jQuery("#id2").html("<h1>This is header2</h1>");
			}); 
		});
	</script>


</head>
<body>
	<a href="register.do?param1=hi&param2=prawwwveen&param3=kasturi">Register</a>
	<h2 id="id1">This is an Index page!</h2>
	<div id="id2">This is an Index Page from div tag. 
		<!-- <h1>This is header1</h1> -->
	</div>
	<input type="button" id="btn"/>
</body>
</html>