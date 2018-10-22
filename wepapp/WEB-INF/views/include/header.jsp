<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" />
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="/css/styles.css" />
<style>
a:hover {
	text-decoration: none;
}
</style>

<script src="//ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

<script src="/js/scripts.js"></script>

<script>
	window.onload(
	
			var logoutBtn = documnet.getElemntById('logoutBtn');
	
	)
</script>

<nav
	class="navbar fixed-top navbar-expand-md navbar-dark bg-primary mb-3">
	<div class="flex-row d-flex">
		<button type="button" class="navbar-toggler mr-2 "
			data-toggle="offcanvas" title="Toggle responsive left sidebar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="/admin" style="font-weight: bold">관리자 모드</a>
	</div>

	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#collapsingNavbar">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="navbar-collapse collapse" id="collapsingNavbar">
		<ul class="navbar-nav">
		</ul>

		<ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a class="nav-link" href="http://localhost:3000/" >webber</a>
			</li>
			
			<!-- <li class="nav-item">
			<a class="nav-link" href="http://localhost:3000/" data-target="#myModal" data-toggle="modal">logout</a>
			</li> -->
		</ul>
	</div>
</nav>