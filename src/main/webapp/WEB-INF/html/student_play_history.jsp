<%@page import="java.util.*"%>
<%@ page language="java"  import="hiber.dao.*" import="hiber.pojo.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%
 	String path = request.getContextPath();
 	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="ycw">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <base href="<%=basePath%>">
    <title>学生页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <!-- 全局js -->
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/top.js"></script>
    <script src="js/home.js"></script>
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<article class="container">
	<div class="panel panel-default course-history">
		<div class="panel-heading">
			<h4>观看记录 总数： ${pagebean.rowCount}</h4>
		</div>
		<div class="panel-body">
			<div class="row">
				<c:forEach var="course" items="${pagebean.contents}">
					<div class="row course-list">
						<div class="col-sm-4">
							<a href="" target="_parent"><img class="img-responsive"
								src="${course.couImg}" alt=""></a>
						</div>
						<div class="col-sm-8">
							<p style="font-size: 20px; margin-top: 10px">${course.couName}</p>
							<p>${course.couinfor}</p>
						</div>
					</div>
					<hr style="margin: 20px">
				</c:forEach>
			</div>
		</div>
		<c:if test="${not empty pagebean}">	
		<nav aria-label="Page navigation" class="text-center" id="page">
		<ul class="pagination">
			<li><a href="ShowHistoryAction?curpage=1">首页</a></li>

			<c:if test="${curpage>1}">
				<li><a href="ShowHistoryAction?curpage=${curpage-1}"
					aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
				</a></li>
			</c:if>

			<c:forEach begin="${pagebean.star}" end="${pagebean.end}" var="i">
				<c:if test="${curpage==i}">
					<li class="active"><span aria-hidden="true">${i }</span></li>
				</c:if>
				<c:if test="${curpage!=i}">
					<li><a href="ShowHistoryAction?curpage=${i}" aria-label="Next">
							<span aria-hidden="true">${i }</span>
					</a></li>
				</c:if>
			</c:forEach>

			<c:if test="${pagebean.curPage<pagebean.pageCount}">
				<li><a href="ShowHistoryAction?curpage=${curpage+1}"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</c:if>
			<li><a href="ShowHistoryAction?curpage=${pagebean.pageCount}">末页</a></li>
		</ul>
		</nav>
		</c:if>
	</div>
	</article>

</body>
</html>