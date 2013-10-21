<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root version="2.0"
	xmlns:jsp="http://java.sun.com/JSP/Page" 
	xmlns:c="http://java.sun.com/jsp/jstl/core" 
	xmlns:fn="http://java.sun.com/jsp/jstl/functions"
	xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
	xmlns:tiles="http://tiles.apache.org/tags-tiles">
<jsp:directive.page contentType="text/html; charset=UTF-8" />
&lt;!doctype html&gt;
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<meta name="description" content="" />
		<meta name="author" content="" />
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico" />

		<title><fmt:message key="app.name" /> - <fmt:message><tiles:insertAttribute name="title" /></fmt:message></title>

		<!-- Bootstrap core CSS -->
		<link href="${pageContext.request.contextPath}/resources/bootstrap-3.0.0/css/bootstrap.css" rel="stylesheet" />

		<!-- Custom styles for this template -->
		<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" />
	</head>
	<body>
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"><fmt:message key="app.name" /></a>
				</div>
				<div class="collapse navbar-collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Home</a></li>
					</ul>
				</div><!--/.nav-collapse -->
			</div>
		</div>

    	<div class="container">
			<div class="starter-template">
				<tiles:insertAttribute name="content" />
			</div>
			<div class="footer">
				<p><fmt:message key="app.version" /></p>
			</div>
    	</div><!-- /.container -->


		<!-- Bootstrap core JavaScript
		================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="${pageContext.request.contextPath}/resources/jquery-2.0.3.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/bootstrap-3.0.0/js/bootstrap.min.js"></script>
	</body>
</html>
</jsp:root>