<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@include file="inc/inc_css.jsp" %>
<body>
	<%@include file="inc/inc_head.jsp" %>
	<div id="page-content" class="single-page">
		<div class="container">
			<div  class="row"><a href="wddzEdit.html" class="btn btn-default">添加地址</a></div>
			<div class="row">
			
				<div class="product well">
					
					<c:forEach items="${list }" var="lists">
					<div class="col-md-12">
						<div class="caption">
							<div class="info">	
								<ul>
									<li>联系人：${lists.lxr }</li>
									<li>联系电话：${lists.lxdh }</li>
									<li>省: ${lists.province }</li>
									<li>市: ${lists.city }</li>
									<li>区: ${lists.area }</li>
									<li>详细地址: ${lists.address }</li>
								</ul>
							</div>
							<hr>
							<a href="#" onclick="deleteOne('${lists.id}');" class="btn btn-default pull-right">删除</a>
						</div>
					</div>
						
					</c:forEach>
					
					<div class="clear"></div>
				</div>	
			</div>
		</div>
	</div>	
<%@include file="inc/inc_foot.jsp" %>
</body>

<script type="text/javascript">
function deleteOne(id) {
		if (!confirm("确定要删除吗?")) {
			return false;
		}
		var params = {
			id : id
		};
		$.post("wddzDelete.html", params, function(result) {
			result = eval("(" + result + ")");
			if (result.status == "true" || result.status == true) {
				alert('成功');
				window.location.reload();
			}
		});
	}
	

</script>


</html>
