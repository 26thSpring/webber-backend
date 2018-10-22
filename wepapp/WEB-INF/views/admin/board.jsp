<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<c:set var="showprev" value="${page.isshowpageprev}" />
<c:set var="shownext" value="${page.isshowpagenext}" />
<c:set var="startnum" value="${page.pagestartnum}" />
<c:set var="endnum" value="${page.pageendnum}" />
<c:set var="pagegrpnum" value="${page.pagegrpnum}" />
<c:set var="totalcount" value="${page.totalcount}" />
<c:set var="pagecount" value="${page.pagecount}" />
<c:set var="totalpagecount" value="${page.totalpagecount}" />
<c:set var="nowpage" value="${page.nowpage}" />
<c:set var="prevnowpage" value="${page.prevnowpage}" />
<c:set var="nextnowpage" value="${page.nextnowpage}" />	
	
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
				<h1>게시판 관리</h1>
				<p class="lead d-none d-sm-block">${nowpage}/${endnum}</p><br/>
				
				<div class="col-lg-9 col-md-8">
					<div class="table-responsive">
						<table class="table table-striped">
							<thead class="thead-inverse">
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>조회수</th>
									<th>작성자</th>
									<th>작성일</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach var="board" items="${list}">
									<tr>
										<td><a href="/admin/board/boardView?board_id=${board.board_id}">${board.board_id}</a></td>
										<td><a href="/admin/board/boardView?board_id=${board.board_id}">${board.title}</a></td>
										<td><a href="/admin/board/boardView?board_id=${board.board_id}">${board.views}</a></td>
										<td><a href="/admin/board/boardView?board_id=${board.board_id}">${board.nickname}</a></td>
										<td><a href="/admin/board/boardView?board_id=${board.board_id}">${board.regdate}</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						
						<!-- 페이징 처리 시작 -->
						<table class="table table-striped">
							<tr>
								<td>
									<c:if test="${showprev eq true}">
										<a href="/admin/board?nowpage=${prevnowpage}&pagecount=${pagecount}&pagegrpnum=${pagegrpnum - 1}">◀ 이전</a>
									</c:if>
									
									<c:forEach var="pagenum" begin="${startnum}" end="${endnum}" step="1">
										&nbsp;&nbsp;
										<a href="/admin/board?nowpage=${pagenum}&pagecount=${pagecount}&pagegrpnum=${pagegrpnum}">${pagenum}</a>
									    &nbsp;&nbsp;
								    </c:forEach>
								    
								    <c:if test="${shownext eq true}">
								    	<a href="/admin/board?nowpage=${nextnowpage}&pagecount=${pagecount}&pagegrpnum=${pagegrpnum + 1}">다음 ▶</a>
								    </c:if>
								</td>
							</tr>
						</table>
						<!-- 페이징 처리 끝 -->
					</div>
				</div>
			</div>
			<!--/row-->
		</div>
		<!--/main col-->
	</div>
	
	<%@ include file="../include/footer.jsp" %>

	<%@ include file="../include/logout_modal.jsp" %>
</body>
</html>