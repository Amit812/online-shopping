<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
   
   <spring:url var="css" value="/resources/css" />
   <spring:url var="js" value="/resources/js" />   
   <spring:url var="images" value="/resources/images" />
   
   
   <c:set var="contextRoot" value="${pageContext.request.contextPath }" />
    
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shopping</title>
</head>
<body>
	${contextRoot}  says -  ${greeting}
</body>
</html> --%>


<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}</title>
	
	<script>
		window.menu = '${title}';
	</script>
	
	
    <!-- Bootstrap core CSS -->
   <!-- <link href="${css}/bootstrap.min.css" rel="stylesheet"> -->
    <!-- Bootstrap darkly CSS -->
  <link href="${css}/bootstrap-darkly-theme.css" rel="stylesheet">
  <!-- 	 <link href="${css}/bootstrap-sketchy-theme.css" rel="stylesheet"> --> 
  	<!--   <link href="${css}/bootstrap-solar-theme.css" rel="stylesheet">-->  
  
   

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>
	
	<div class="wrapper">
	
   <!-- navigation   -->
   <%@include file="./shared/navbar.jsp" %>
   	
   
   <!-- Page conteContent -->
   <div class="content">
   <!-- loading the home content  -->
   <c:if test="${userClickHome == true }"  >
   <%@include file="home.jsp"   %>
   </c:if>
   
   <!-- loading the about us page after click  -->
   <c:if test="${userClickAbout == true }">
   <%@include file="about.jsp" %>
   </c:if>
   
   <!-- loadig the contact us page after user click  -->
   <c:if test="${userClickContact == true }">
   <%@include file="contact.jsp" %>
   </c:if>
   
   <!-- loadig the product list page after user click  -->
   <c:if test="${userClickAllProducts == true  or userClickCategoryProducts == true}">
   <%@include file="listProducts.jsp" %>
   </c:if>
   
   
   
   </div>
   
    <!-- footer comes here    -->
    <%@include file="./shared/footer.jsp" %>
    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.min.js"></script>
    <!-- self code javascript -->
	<script src="${js}/myapp.js"></script>
	
	</div>
	
  </body>

</html>
