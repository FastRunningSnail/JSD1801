<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<%@include file="inc/inc_css.jsp"%>
<body>
	<!--Top-->
	<%@include file="inc/inc_head.jsp"%>
	<div id="page-content" class="single-page">
		<div class="container">
			<div class="row">
				<div id="main-content" class="col-md-8">
					<div class="product">
						<div class="col-md-6">
							<div class="image">
								<img src="${ctx}/${map.productPic1}" />
								<div class="image-more">
									<ul class="row">
										<li class="col-lg-3 col-sm-3 col-xs-4"><a href="#"><img
												class="img-responsive" src="${ctx}/${map.productPic1}"></a>
										</li>
										<li class="col-lg-3 col-sm-3 col-xs-4"><a href="#"><img
												class="img-responsive" src="${ctx}/${map.productPic2}"></a>
										</li>
										<li class="col-lg-3 col-sm-3 col-xs-4"><a href="#"><img
												class="img-responsive" src="${ctx}/${map.productPic3}"></a>
										</li>
										<li class="col-lg-3 col-sm-3 col-xs-4"><a href="#"><img
												class="img-responsive" src="${ctx}/${map.productPic4}"></a>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="caption">
								<div class="name">
									<h3>${map.productName }</h3>
								</div>
								<div class="info">
									<ul>
										<li>分类: ${map.typesName }</li>
										<li>剩余数量: ${map.nums }</li>
									</ul>
								</div>
								<div class="price">${map.price }元<span>${map.oldPrice }元</span>
								</div>
								<%--
								<div class="options">
									AVAILABLE OPTIONS
									<select>
										<option value="" selected>----Please Select----</option>
										<option value="red">RED</option>
										<option value="black">BLACK</option>
									</select>
								</div> --%>
								<div class="rating">
									<c:if test="${map.tjxj=='一星' }">
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
									</c:if>
									<c:if test="${map.tjxj=='二星' }">
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
									</c:if>
									<c:if test="${map.tjxj=='三星' }">
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
									</c:if>
									<c:if test="${map.tjxj=='四星' }">
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star-empty"></span>
									</c:if>
									<c:if test="${map.tjxj=='五星' }">
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
										<span class="glyphicon glyphicon-star"></span>
									</c:if>
								</div>
								<div class="well">
									<label>数量: </label> <input class="form-inline quantity"
										type="text" name="numbs" value="1"><a href="#"
										onclick="addShopCar();" class="btn btn-2 ">添加到购物车</a>
								</div>
								<div class="share well">
									<!-- JiaThis Button BEGIN -->
									<div class="jiathis_style">
										<a class="jiathis_button_qzone"></a> <a
											class="jiathis_button_tsina"></a> <a
											class="jiathis_button_tqq"></a> <a
											class="jiathis_button_weixin"></a> <a
											class="jiathis_button_renren"></a> <a
											href="http://www.jiathis.com/share"
											class="jiathis jiathis_txt jtico jtico_jiathis"
											target="_blank"></a> <a class="jiathis_counter_style"></a>
									</div>
									<script type="text/javascript"
										src="http://v3.jiathis.com/code/jia.js" charset="utf-8"></script>
									<!-- JiaThis Button END -->
								</div>
							</div>
						</div>
						<div class="clear"></div>
					</div>
					<div class="product-desc">
						<ul class="nav nav-tabs">
							<li class="active"><a href="#description">描述</a></li>
							<%--<li><a href="#review">评论</a></li> --%>
						</ul>
						<div class="tab-content">
							<div id="description" class="tab-pane fade in active">
								<p>${map.content }</p>
							</div>
							<div id="review" class="tab-pane fade">
								<div class="review-text">

									<p>xxxxx</p>
								</div>
								<div class="review-form">
									<form name="form1" id="ff" method="post" action="review.php">
										<label> <span>内容:</span> <textarea name="message"
												id="message"></textarea>
										</label>
										<div class="text-right">
											<input class="btn btn-default" type="reset" name="reset"
												value="清空"> <input class="btn btn-default"
												type="button" name="Submit" value="提交">
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
					<%@include file="inc/inc_tj.jsp"%>
				</div>
				<%@include file="inc/inc_right.jsp"%>
			</div>
		</div>
	</div>
	<%@include file="inc/inc_foot.jsp"%>
</body>
<script type="text/javascript">
	function addShopCar() {
		if (!checkIsLogin()) {
			alert('请先登录');
			window.location.href = '${ctx}/front/register.html';
			return false;
		}
		var id = '${map.id}';
		var num = $("input[name='numbs']").val();
		$.post("addShopcar.html", {
			id : id,
			num : num
		}, function(result) {
			result = eval("(" + result + ")");
			if (result.status == "true" || result.status == true) {
				alert('添加成功');
				window.location.reload();
			} else {

			}
		});
	}
</script>
</html>
