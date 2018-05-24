<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>

<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>后台信息管理</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="images/leftico01.png" /></span>信息管理
    </div>
    	<ul class="menuson">
        <li  class="active"><cite></cite><a href="index.jsp" target="rightFrame">欢迎页面</a><i></i></li>
        <li><cite></cite><a href="<%=path%>/servlet/RegisterAction?action_flag=listUser" target="rightFrame">教师管理</a><i></i></li>
        
                
                
        <li><cite></cite><a href="<%=path%>/servlet/StudentAction?action_flag=listMessage" target="rightFrame">学生管理</a><i></i></li>
                <li><cite></cite><a href="<%=path%>/servlet/StudentAction?action_flag=listMessageChoice" target="rightFrame">添加学生</a><i></i></li>
                
                <li><cite></cite><a href="<%=path%>/servlet/StudentAction?action_flag=listTypeMessage" target="rightFrame">考场管理</a><i></i></li>
                 <li><cite></cite><a href="formType.jsp" target="rightFrame">添加考场</a><i></i></li> 
                 
        </ul>    
    </dd>
        
    
    
    
    
    </dl>
</body>
</html>
