<jsp:root version="2.0"
		xmlns:jsp="http://java.sun.com/JSP/Page" 
		xmlns:c="http://java.sun.com/jsp/jstl/core" 
		xmlns:fn="http://java.sun.com/jsp/jstl/functions"
		xmlns:fmt="http://java.sun.com/jsp/jstl/fmt">
	<jsp:directive.page contentType="text/html; charset=UTF-8" session="true" />
	<p>${greeting} ${name}</p>
	<a href="home" class="btn btn-default">Back</a>
</jsp:root>