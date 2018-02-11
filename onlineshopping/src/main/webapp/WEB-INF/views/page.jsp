<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
   
   <spring:url var="css" value="/resources/css" />
   <spring:url var="js" value="/resources/js" />   
   <spring:url var="images" value="/resources/images" />
   
   
   <c:set var="contextRoot" value="${pageContext.request.contextPath}" />
    
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

		

    <title>Online Shopping - ${title}</title>
	
	<script>
		window.menu = '${title}';
		
		window.contextRoot = '${contextRoot}'
	</script>
	
	
    <!-- Bootstrap core CSS -->
     	  <link href="${css}/bootstrap.min.css" rel="stylesheet"> 
     	 
    
    <!-- Bootstrap Theme CSS -->
	  	<!--  <link href="${css}/bootstrap-darkly-theme.css" rel="stylesheet">  -->
		 <!-- <link href="${css}/bootstrap-sketchy-theme.css" rel="stylesheet"> -->
	  	 <!--<link href="${css}/bootstrap-solar-theme.css" rel="stylesheet">-->
		  <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet"> 
	  	
	  	
	<!-- Bootstrap Data table Theme  -->  
		<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
	  
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
	   
	   <!-- load only when user click single products -->
	   <c:if test="${userClickShowProduct == true}" >
	  	<%@include file="singleProduct.jsp" %>
	   </c:if>
   
   </div>
   
    <!-- footer comes here order is important   -->
    <%@include file="./shared/footer.jsp" %>
    
    <!-- jQuery -->
		<script src="${js}/jquery.js"></script>
    
    <!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>
    
   	<!-- DataTable Plugin -->
		<script src="${js}/jquery.dataTables.js"></script>
	
	<!-- Datatable Bootstrap script -->
		<script src="${js}/dataTables.bootstrap.js"></script>
    
    <!-- Self coded javascript -->
		<script src="${js}/myapp.js"></script>
	
	
	</div>
	
  </body>

</html>
