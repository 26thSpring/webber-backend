<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>관리자 모드</title>
<meta name="description"
	content="A Bootstrap 4 admin dashboard theme that will get you started. The sidebar toggles off-canvas on smaller screens. This example also include large stat blocks, modal and cards. The top navbar is controlled by a separate hamburger toggle button." />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="generator" content="Codeply">

</head>
<body>
	<%@ include file="../include/header.jsp" %>

	<div class="container-fluid" id="main">
		<div class="row row-offcanvas row-offcanvas-left">
			<%@ include file="../include/menus.jsp" %>
			
			<div class="col main pt-5 mt-3">
				<h1>관리자 모드</h1>
				<p class="lead d-none d-sm-block"></p>

				<div class="row mb-3">
					<div class="col-xl-3 col-sm-6 py-2">
						<a href="/admin/user?nowpage=1&pagecount=10&pagegrpnum=1">
							<div class="card bg-success text-white h-100">
								<div class="card-body bg-success">
									<div class="rotate">
										<i class="fa fa-user fa-4x"></i>
									</div>
									<h6 class="text-uppercase">회원 관리</h6>
									<h1 class="display-4">Users</h1>
								</div>
							</div>
						</a>
					</div>

					<div class="col-xl-3 col-sm-6 py-2">
						<a href="/admin/board?nowpage=1&pagecount=10&pagegrpnum=1">
							<div class="card text-white bg-danger h-100">
								<div class="card-body bg-danger">
									<div class="rotate">
										<i class="fa fa-list fa-4x"></i>
									</div>
									<h6 class="text-uppercase">게시물 관리</h6>
									<h1 class="display-4">Posts</h1>
								</div>
							</div>
						</a>
					</div>
					
					<div class="col-xl-3 col-sm-6 py-2">
						<a href="/admin/templates?nowpage=1&pagecount=5&pagegrpnum=1">
							<div class="card text-white bg-info h-100">
								<div class="card-body bg-info">
									<div class="rotate">
										<i class="fa fa-twitter fa-4x"></i>
									</div>
									<h6 class="text-uppercase">자료실 관리</h6>
									<h1 class="display-4">Templates</h1>
								</div>
							</div>
						</a>
					</div>

					<div class="col-xl-3 col-sm-6 py-2">
						<a href="/admin/notice?nowpage=1&pagecount=10&pagegrpnum=1">
							<div class="card text-white bg-warning h-100">
								<div class="card-body">
									<div class="rotate">
										<i class="fa fa-share fa-4x"></i>
									</div>
									<h6 class="text-uppercase">공지사항</h6>
									<h1 class="display-4">Notices</h1>
								</div>
							</div>
						</a>
					</div>
				</div>
				<!--/row-->
			</div>
			<!--/row-->
		</div>
		<!--/main col-->
	</div>
	
	<%@ include file="../include/footer.jsp" %>

	<%@ include file="../include/logout_modal.jsp" %>
</body>
</html>