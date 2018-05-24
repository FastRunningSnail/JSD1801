<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@include file="inc/inc_css.jsp"%>
<body>
	<%@include file="inc/inc_head.jsp"%>
	<div id="page-content" class="single-page">
		<div class="container">
			<div class="row">
				<div class="product well">
					<c:forEach items="${orderList }" var="lists">
						<div class="col-md-12">
							<div class="caption">
								<div class="name">
									<h3>
										<a href="#">${lists.productDetail }</a>
									</h3>
								</div>
								<div class="info">
									<ul>
										<li>价格: ${lists.allPrice }</li>
										<li>状态: ${lists.status }</li>
										<li>订单编号: ${lists.orderNum }</li>
									</ul>
								</div>
								<label>物流信息:<br>${lists.pl }
								</label>
								<hr>
								<a href="#" onclick="deleteOne('${lists.id}');"
									class="btn btn-default pull-right">删除</a>
							</div>
						</div>

					</c:forEach>

					<div class="clear"></div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="inc/inc_foot.jsp"%>
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
