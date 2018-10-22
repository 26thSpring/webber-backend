<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>관리자 모드</title>

<link rel="stylesheet" href="/css/write.css">

<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="/js/jquery-migrate-1.4.1.min.js"></script>

<script>
	window.onload = function() {
		var frmWrite = document.getElementById("frmWrite");

		frmWrite.onsubmit = function() {
			updateSubmit();
		}
		
		function updateSubmit() {
			// alert('submit');
			var txtTitle = document.getElementById("txtTitle");
			var txtWriter = document.getElementById("txtWriter");
			var txtCont = document.getElementById("txtCont");

			if (txtTitle.value == '' || txtWriter.value == '' || txtCont == '') {
				alert('입력되지 않은 항목이 있습니다!');
				return false;
			}
			return true;
		}
	}
</script>
</head>

<body>
	<%@ include file="../include/header.jsp"%>

	<div class="container-fluid" id="main">
		<div class="row row-offcanvas row-offcanvas-left">
			<%@ include file="../include/menus.jsp"%>

			<div class="col main pt-5 mt-3">
				<h1>게시판 관리</h1>
				<%-- <p class="lead d-none d-sm-block">${content.board_id}</p><br/> --%>

				<div class="col-lg-9 col-md-8">
					<table>
						<tr>
							<td width="100" height="30" align="center">번호</td>
							<td width="150" height="30">${content.board_id}</td>
						</tr>
						<tr>
							<td width="100" height="30" align="center">작성자</td>
							<td width="150" height="30">${content.nickname}</td>
						</tr>
						<tr>
							<td width="100" height="30" align="center">제목</td>
							<td width="400" height="30">${content.title}</td>
						</tr>
						<tr>
							<td width="100" height="30" align="center">내용</td>
							<td width="400">${content.content}
							</td>
						</tr>

						<tr>
							<td colspan="2">
								<input type="button" value="삭제" data-target="#delBoard" data-toggle="modal"/>&nbsp;&nbsp;
								<input type="button" id="btnBack" value="돌아가기" onclick="location.href='/admin/board?nowpage=1&pagecount=10&pagegrpnum=1'" />
							</td>
						</tr>
					</table>
				</div>
			</div>
			<!--/row-->
		</div>
		<!--/main col-->
	</div>

	<%@ include file="../include/footer.jsp"%>

	<%@ include file="../include/logout_modal.jsp"%>

	<!-- 삭제 확인 창 -->
	<div class="modal fade" id="delBoard" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel">삭제 확인</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
					</button>
				</div>

				<div class="modal-body">
					<p>정말 삭제하시겠습니까? 이 작업은 되돌릴 수 없습니다.</p>
				</div>

				<div class="modal-footer">
					<button type="button"
						onclick="location.href='/admin/board/boardDel?board_id=${content.board_id}'"
						class="btn btn-secondary" data-dismiss="modal">네</button>
					<button type="button" class="btn btn-primary-outline"
						data-dismiss="modal">아니오</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 삭제 확인 창 End -->
</body>
</html>