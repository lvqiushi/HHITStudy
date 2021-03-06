<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%
 	String path = request.getContextPath();
 	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="author" content="ycw">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>添加章节</title>
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
<div class="text-center">
    <h3>添加小节</h3>
</div>
<form class="form-horizontal" role="form" action="addjoint"  target="_parent" method="post">
	<input name="chapterid" type="hidden" value="${chapterid }" />
	<input name="couid" type="hidden" value="${couid }" />
	<div class="form-group">
        <div class="col-xs-12">
            <div><label class="control-label">选择小节</label></div>
            <select name="jointIndex" class="form-control">
                <option value=1>第一节</option>
                <option value=2>第二节</option>
                <option value=3>第三节</option>
                <option value=4>第四节</option>
                <option value=5>第五节</option>
                <option value=6>第六节</option>
                <option value=7>第七节</option>
                <option value=8>第八节</option>
                <option value=9>第九节</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="add-course-title2" class="col-sm-2 control-label">小节标题</label>
        <div class="col-sm-10">
            <input type="text" name="jointTitle" class="form-control" id="add-course-title2" placeholder="小节标题" required>
        </div>
    </div>
    <div class="form-group">
        <label for="add-course-summary2" class="col-sm-2 control-label">小节概述</label>
        <div class="col-sm-10">
            <textarea class="form-control" name="jointInfor" rows="4" id="add-course-summary2" placeholder="小节概述" required></textarea>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10 text-left">
            <button type="submit" class="btn btn-default">保存</button>
            <button type="reset" class="btn btn-default">取消</button>
        </div>
    </div>
</form>

</body>
</html>