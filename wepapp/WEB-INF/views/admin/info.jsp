<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<%@ include file="../include/header.jsp"%>
		<div class="container-fluid" id="main">
			<div class="row row-offcanvas row-offcanvas-left">
				<%@ include file="../include/menus.jsp"%>

			<div class="col main pt-5 mt-3">
				<h1>회원 정보</h1>
				<p class="lead d-none d-sm-block"></p>
					
				<div class="col-lg-6">
					<div class="card card-default card-body">
						<ul id="tabsJustified" class="nav nav-tabs nav-justified">
							<li class="nav-item"><a class="nav-link active" href=""
								data-target="#tab1" data-toggle="tab">기본 정보</a></li>
							<li class="nav-item"><a class="nav-link" href=""
								data-target="#tab2" data-toggle="tab">프로필</a></li>
							<li class="nav-item"><a class="nav-link" href=""
								data-target="#tab3" data-toggle="tab">탈퇴 처리</a></li>
						</ul>
						<!--/tabs-->
						<br>
						<div id="tabsJustifiedContent" class="tab-content">
							<div class="tab-pane active" id="tab1">
								<div class="list-group">
									<p class="list-group-item">
										<span class="float-right label label-success">${info.nick_name}</span>닉네임
									</p>
									
									<p class="list-group-item">
										<span class="float-right label label-success">${info.email}</span>이메일
									</p>
									
									<p class="list-group-item">
										<span class="float-right label label-success">${info.google}</span>Google
									</p>
									
									<p class="list-group-item">
										<span class="float-right label label-success">${info.facebook}</span>Facebook
									</p>
									
									<p class="list-group-item">
										<span class="float-right label label-success">${info.naver}</span>Naver
									</p>
								</div>
							</div>
							
							<div class="tab-pane" id="tab2">
								<div class="row">
									<div class="col-sm-7">
										<h4>프로필</h4>
										<p>${info.intro}</p>
									</div>
									
									<div class="col-sm-5">
										<img src="/img/pic_test.png" class="float-right img-responsive img-rounded" alt="${info.thumbnail}">
									</div>
								</div>
								
								<div class="spacer5"></div>
							</div>
							
							<div class="tab-pane" id="tab3">
								<a data-toggle="modal" data-target="#kickMember" class="btn btn-info btn-block">강제 탈퇴</a>
							</div>
						</div>
						<!--/tabs content-->
					</div>
					<!--/card-->
				</div>
				<!--/col-->
			</div>
			<!--/main col-->
		</div>
	</div>

	<%@ include file="../include/footer.jsp"%>

	<%@ include file="../include/logout_modal.jsp" %>
	
	<!-- Kick Member Modal -->
	<div class="modal fade" id="kickMember" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel">회원 관리</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
					</button>
				</div>

				<div class="modal-body">
					<p>정말 탈퇴시키겠습니까? 이 작업은 되돌릴 수 없습니다.</p>
				</div>

				<div class="modal-footer">
					<button type="button" onclick="location.href='/admin/user/kick_member?nickname=${info.nick_name}'" class="btn btn-secondary" data-dismiss="modal">네</button>
					<button type="button" class="btn btn-primary-outline" data-dismiss="modal">아니오</button>
				</div>
			</div>
		</div>
	</div>
	<!-- Kick Member Modal End -->
</body>
</html>