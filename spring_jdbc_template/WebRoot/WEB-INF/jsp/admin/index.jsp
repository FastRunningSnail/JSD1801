<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script>
var ctx='${ctx}';
</script>
<!DOCTYPE>
<html>
<head>
<title>基于精准产业扶贫的微信电商平台</title>
<link type="text/css" rel="stylesheet" href="${ctx }/resource/index/one/css/style.css" />
<script type="text/javascript" src="${ctx }/resource/index/one/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${ctx }/resource/index/one/js/menu.js"></script>
</head>

<body>
<div class="top"></div>
<div id="header">
	<div class="logo">基于精准产业扶贫的微信电商平台</div>
	<div class="navigation">
		<ul>
		 	<li>欢迎您！</li>
			<li><a href="">${adminBean.username }</a></li>
			<%--
			<li><a href="">修改密码</a></li>
			<li><a href="">设置</a></li> --%>
			<li><a href="${ctx }/adminLogin/out.html">退出</a></li>
		</ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
	<ul id="nav_dot">
			<li>
	          <h4 class="M1"><span></span>个人中心</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/password.html' target="page">修改密码</a>
	          </div>
	        </li>
	        <li>
	          <h4 class="M1"><span></span>轮播图管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/lbt/frame.html?flag=1' target="page">轮播图列表</a>
	          </div>
	        </li>
			<li>
	          <h4 class="M1"><span></span>客户管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/customer/frame.html?flag=1' target="page">客户列表</a>
	          </div>
	        </li>
			<li>
	          <h4 class="M1"><span></span>订单管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/order/frame.html?flag=1' target="page">订单列表</a>
	          </div>
	        </li>
	        <li>
	          <h4 class="M1"><span></span>分类管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/types/frame.html?flag=1' target="page">分类列表</a>
	          </div>
	        </li>
			<li>
	          <h4 class="M1"><span></span>产品管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/product/frame.html?flag=1' target="page">产品列表</a>
	          </div>
	        </li>
	        <li>
	          <h4 class="M1"><span></span>联系客服管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/contact/frame.html?flag=1' target="page">联系客服列表</a>
	          </div>
	        </li>
	        <%--
			<li>
	          <h4 class="M1"><span></span>信息交流管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/message/frame.html?flag=1' target="page">信息交流列表</a>
	          </div>
	        </li> --%>
			<li>
	          <h4 class="M1"><span></span>统计中心</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/tj/tj1.html' target="page">按天销售额</a>
	            <a href='${ctx}/admin/tj/tj2.html' target="page">按地区统计销售数量</a>
	          </div>
	        </li>
	        
 	 </ul>
		</div>
		<div class="m-right">
			<div class="main">
				<iframe src="${ctx }/admin/main.html" width="100%" height="100%" frameborder="0" scrolling="yes" name="page"></iframe>
			</div>
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><p>基于精准产业扶贫的微信电商平台</p></div>
<script>navList(12);</script>
</body>
</html>

