<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My예약 확인</title>
<style>
	body {
		line-height: 2em;
	}
	
	ul, li {
		list-style: none;
		text-align: center;
		padding: 0;
		margin: 0;
	}
	
	#mainWrapper {
		width: 800px;
		margin: 0 auto; /*가운데 정렬*/
	}
	
	#mainWrapper>ul>li:first-child {
		text-align: center;
		font-size: 14pt;
		height: 40px;
		vertical-align: middle;
		line-height: 30px;
	}
	
	#ulTable {
		margin-top: 10px;
	}
	
	#ulTable>li:first-child>ul>li {
		background-color: #c9c9c9;
		font-weight: bold;
		text-align: center;
	}
	
	#ulTable>li>ul {
		clear: both;
		padding: 0px auto;
		position: relative;
		min-width: 40px;
	}
	
	#ulTable>li>ul>li {
		float: left;
		font-size: 10pt;
		border-bottom: 1px solid silver;
		vertical-align: baseline;
	}
	
	#ulTable>li>ul>li:first-child {
		width: 10%;
	}
	#ulTable>li>ul>li:first-child+li {
		width: 45%;
	}
	#ulTable>li>ul>li:first-child+li+li {
		width: 20%;
	}
	#ulTable>li>ul>li:first-child+li+li+li {
		width: 15%;
	}
	#ulTable>li>ul>li:first-child+li+li+li+li {
		width: 10%;
	}
	
	.left {
		text-align: center;
	}
</style>
<script type="text/javascript">
	$('#cancle').click(function() {
		 if (confirm("취소 하시겠습니까??") == true){
			 $.ajax ({
				 url: "/delete_action.do",
				 type:"POST",
				 succese: function(){
					 alert("취소 되었습니다.");
				 },
				 error:function() {
					 alert("오류");
				 }
			 });
		 }else{
		     return false;
		 }
	});
</script>
</head>
<body>
	<div id="mainWrapper">
		<ul>
			<!-- 게시판 제목 -->
			<li>My 예약 현황</li>
			<!-- 게시판 목록  -->
			<li>
				<ul id="ulTable">
					<li>
						<ul>
							<li>날짜</li>
							<li>프로그램</li>
							<li>시간</li>
							<li>강사</li>
							<li>취소</li>
						</ul>
					</li>
					<!-- 게시물이 출력될 영역 -->
					<c:forEach var="list" items="${ProgramList}">
						<li>
							<ul>
								<li>${list.programTime}</li>
								<li class="left">${list.programName}</li>
								<li>${list.programTime}</li>
								<li class="left">${list.programName}</li>
								<li><input type="button" value="취소" id="cancle"/></li>
							</ul>
						</li>
					</c:forEach>
				</ul>
			</li>
		</ul>
	</div>
</body>
</html>