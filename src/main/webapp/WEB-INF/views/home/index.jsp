<jsp:root version="2.0"
		xmlns:jsp="http://java.sun.com/JSP/Page" 
		xmlns:c="http://java.sun.com/jsp/jstl/core" 
		xmlns:fn="http://java.sun.com/jsp/jstl/functions"
		xmlns:fmt="http://java.sun.com/jsp/jstl/fmt">
	<jsp:directive.page contentType="text/html; charset=UTF-8" session="true" />
	<form class="form-horizontal" action="home" method="POST" role="form">
		<div class="form-group">
			<label for="name" class="col-lg-2 control-label">What is your name?</label>
			<div class="col-lg-3">
				<input type="text" class="form-control" id="name" name="name" />
			</div>
		</div>
  		<div class="form-group">
			<div class="col-lg-offset-2 col-lg-3">
				<button type="submit" class="btn btn-default">Go</button>
			</div>
		</div>
	</form>
</jsp:root>