<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공지사항 등록</title>

<link rel="stylesheet" href="/css/write.css">

<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="/js/jquery-migrate-1.4.1.min.js"></script>

<script>
	window.onload = function() {
		var frmWrite = document.getElementById("frmWrite");
		frmWrite.onsubmit = function() {
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
				<h1>공지사항 등록</h1>
				<p class="lead d-none d-sm-block"></p><br/>

				<div class="col-lg-9 col-md-8">
					<form action="/admin/notice/writeProc" method="POST" id="frmWrite">
						<table>
							<tr>
								<td width="100" height="30" align="center">작성자</td>
								<td width="150" height="30"><input type="text" name="nickname" size="15" id="txtWriter" value="${map.nickname}" readonly="readonly"/></td>
							</tr>
							<tr>
								<td width="100" height="30" align="center">제목</td>
								<td width="400" height="30"><input type="text" name="title"
									size="50" id="txtTitle" /></td>
							</tr>
							<tr>
								<td width="100" height="30" align="center">내용</td>
								<td width="400">
									<textarea name="content" style="width: 400px; height: 150px" id="txtCont"></textarea>
								</td>
							</tr>

							<tr>
								<td colspan="2">
									<input type="submit" value="글쓰기" />&nbsp;&nbsp;
									<input type="reset" value="다시 쓰기" />&nbsp;&nbsp;
									<input type="button" id="btnBack" value="돌아가기" onclick="location.href='/admin/notice?nowpage=1&pagecount=10&pagegrpnum=1'" />
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			<!--/row-->
		</div>
		<!--/main col-->
	</div>

	<%@ include file="../include/footer.jsp"%>

	<%@ include file="../include/logout_modal.jsp" %>
</body>
</html>