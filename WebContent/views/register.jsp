<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
	<script type="text/javascript">
	 //var jAlias = jQuery.noConflict();
		$(document).ready(function(){
			//alert("hwadsi");
			$('h1').append(" Form");
			$("#sbmt").click(function(){
				var flag = true;
				$('input').each(function(index,value){
					if(index < 4){
						if($(this).val()==""){
							disableSuccessMessage();
							$("#errorMsg").html(""+$(this).attr('id')+" id required.");
							flag = false;
							return false;
						}
					}
				});
				/* if($('#userId').val()== ""){
					disableSuccessMessage();
					$("#errorMsg").html("User id required.");
					return false;
				}if($('#userNameId').valdx()== ""){
					disableSuccessMessage();
					$("#errorMsg").html("Username required.");
					return false;
				}if($('#cityId').val()== ""){
					disableSuccessMessage();
					$("#errorMsg").html("City required.");
					return false;
				} */
				if(flag){
					$("#frmId").submit();	
				}
				
			});
			
		}); 
		function disableSuccessMessage(){
			if(document.getElementById("successMsg")!= null){
				document.getElementById("successMsg").style.display="none";
			}
		}
		
		/* var myname;
		//console.log(myname);
		function submittinForm(obj){
			
			var num1 = 233;
			var num2 ="233";
			//alert(num1 === num2);
			var person ={"firstName":'Mahesh',"Age":'14'};
			alert("Name: "+person.firstName+"  Age:"+person.age);
			alert(typeof true);
			
			
			if(document.getElementById("userId").value==""){
				disableSuccessMessage();
				document.getElementById("errorMsg").innerHTML="*User Id is required."
				return false;
			}
			if(document.getElementById("userNameId").value==""){
				disableSuccessMessage();
				document.getElementById("errorMsg").innerHTML="*Username is required."
				return false;
			}
			if(document.getElementById("cityId").value==""){
				disableSuccessMessage();
				document.getElementById("errorMsg").innerHTML="*City is required."
				return false;
			}
			
			document.forms[0].submit();
			
		}
		function disableSuccessMessage(){
			if(document.getElementById("successMsg")!= null){
				document.getElementById("successMsg").style.display="none";
			}
		}
	 */	
	</script>
	
</head>
<body>
   <h1>Regrat</h1>
    <div>
    	<c:if test="${success eq true}">
    		<b id="successMsg" style="color:red;">User info is stored successfully.!</b>
   	    </c:if> 
    	<b id="errorMsg" style="color:red;font-size: 5">${errorMsg}</b>
    </div>
	<form:form id="frmId" action="register.do" method="POST" commandName="register">
	UserId:		<form:input id="UserId" path="userId"/><BR>
	UserName:	<form:input id="UserName" path="userName"/><Br>
	User City:	<form:input id="CityId" path="city"/><Br>
		<input id="sbmt" type="button" value="submit" />
	</form:form><Br>
	<c:if test="${not empty user}">
		<h2>Stored data is :</h2><Br>
		User Id: ${user.userId }<Br>
		User Name: ${user.userName }<Br>
		User City: ${user.city }
	</c:if>
	
</body>
</html>