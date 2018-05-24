<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@include file="inc/inc_css.jsp" %>
<body>
	<%@include file="inc/inc_head.jsp" %>
	<div id="page-content" class="single-page">
		<div class="container">
			<div class="row">
				<div class="product well">
					<c:forEach items="${list }" var="lists">
					<div class="col-md-12">
						<div class="caption">
							<div class="info">	
								<ul>
									<li>电话: ${lists.phone }</li>
									<li>我说: ${lists.content }</li>
									<li>日期: ${lists.insertDate }</li>
									<li>管理员回复: ${lists.back }</li>
									
								</ul>
							</div>
							<hr>
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
		$.post("deleteOneOrder.html", params, function(result) {
			result = eval("(" + result + ")");
			if (result.status == "true" || result.status == true) {
				alert('成功');
				window.location.reload();
			}
		});
	}

</script>


</html>
