<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	List<Map<String, Object>> list = (List<Map<String, Object>>) request.getAttribute("listMessage");
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head >
<title>网站后台管理系统HTML模板--我爱模板网 www.5imoban.net</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip").fadeIn(200);
		});

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
</script>


</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">数据表</a></li>
			<li><a href="#">基本内容</a></li>
		</ul>
	</div>

	<div class="rightinfo">


		<table class="tablelist">
			<thead>
				<tr>
					<th>准考证号</th>
					<th>学生姓名</th>
					<th>学生性别</th>
					
					<th>学生图像</th>
					
					<th>联系方式</th>
					<th>身份证号</th>
						<th>所在考场</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>




				<%
					int houseNumber = 0;
											if (!list.isEmpty()) {
												/*  for(Map<String,Object> map:list){ */
												for (int i = 0; i < list.size(); i++) {
													houseNumber = i + 1;
													Map<String, Object> map = list.get(i);
				%>


				<tr>
					<td ><%=map.get("stuNo")%></td>
					<td><%=map.get("studentName")%></td>
					<td><%=map.get("studentSex")%></td>
					<td>	
					
					<%
					if(!map.get("studentImage").toString().equals("0")){
					%>
					<img style="padding: 10" height="100" width="100" src="<%=request.getContextPath()+"\\upload\\"+map.get("studentImage")%>"/>
					
					<%
					}else{
					%>
					<img style="padding: 10" height="100" width="100" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1519617657915&di=b4383fa73701d32ac7cc2fe8146a1e2b&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01b6a355fbea206ac7251df8fda889.png"/>
					
					<%
					}
					
					 %>
					
					
					<td><%=map.get("studentPhone")%></td>
					<td><%=map.get("studentCode")%></td>
					<td><%=map.get("typeName")%></td>
					<td><a href="<%=path%>/servlet/StudentAction?action_flag=deleteMessage&studentId=<%=map.get("studentId")%>" class="tablelink"> 删除</a></td>
				</tr>

				<%
					}
											}
				%>
			</tbody>
		</table>







	</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>
