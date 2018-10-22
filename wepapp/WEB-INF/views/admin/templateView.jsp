<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
				<h1>템플릿 관리</h1>
				<br/>

				<div class="col-lg-9 col-md-8">
					<div class="card">
						<img class="card-img-top img-fluid" src="${content.thumbnail}" alt="${content.thumbnail}" /><br/>
						
	                    <div class="card-body">
	                        <h4 class="card-title">HTML</h4>
	                        <p class="card-text">${content.file_path_html}/${content.file_name}.html</p><br/>
	                        
	                        <h4 class="card-title">CSS</h4>
	                        <p class="card-text">${content.file_path_css}/${content.file_name}.css</p>
	                    </div>
                    </div>
				</div><br/>
				
				<input type="button" value="삭제" data-target="#delTemplate" data-toggle="modal"/>&nbsp;&nbsp;
				<input type="button" id="btnBack" value="돌아가기" onclick="location.href='/admin/templates?nowpage=1&pagecount=5&pagegrpnum=1'" />
			</div>
			<!--/row-->
		</div>
		<!--/main col-->
	</div>

	<%@ include file="../include/footer.jsp"%>

	<%@ include file="../include/logout_modal.jsp"%>

	<!-- 삭제 확인 창 -->
	<div class="modal fade" id="delTemplate" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel">삭제 확인</h4>
					
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
					</button>
				</div>

				<div class="modal-body">
					<p>정말 삭제하시겠습니까? 이 작업은 되돌릴 수 없습니다.</p>
				</div>

				<div class="modal-footer">
					<button type="button"
						onclick="location.href='/admin/templates/delTemplate?template_id=${content.template_id}'"
						class="btn btn-secondary" data-dismiss="modal">네</button>
					<button type="button" class="btn btn-primary-outline" data-dismiss="modal">아니오</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 삭제 확인 창 End -->
</body>
</html>