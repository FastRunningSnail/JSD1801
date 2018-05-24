<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@include file="inc/inc_css.jsp" %>

<body>
	<!--Top-->
	<%@include file="inc/inc_head.jsp" %>
	<!--//////////////////////////////////////////////////-->
	<!--///////////////////HomePage///////////////////////-->
	<!--//////////////////////////////////////////////////-->
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >ç½é¡µæ¨¡æ¿</a></div>
	<div id="page-content" class="home-page">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<!-- Carousel -->
					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators hidden-xs">
							<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
							<li data-target="#carousel-example-generic" data-slide-to="1"></li>
							<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						</ol>
						<!-- Wrapper for slides -->
						<div class="carousel-inner">
							<c:forEach items="${list3 }" var="lists" varStatus="vs">
								<div class="item ${vs.index==0?'active':'' }">
									<img src="${ctx}/${lists.pic}" alt="First slide">
									<!-- Static Header -->
									<div class="header-text hidden-xs">
										<div class="col-md-12 text-center">
										</div>
									</div><!-- /header-text -->
								</div>
							</c:forEach>
							
						</div>
						<!-- Controls -->
						<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
							<span class="glyphicon glyphicon-chevron-left"></span>
						</a>
						<a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
							<span class="glyphicon glyphicon-chevron-right"></span>
						</a>
					</div><!-- /carousel -->
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="heading"><h2>推荐产品</h2></div>
					<div class="products">
					
					
						<c:forEach items="${list }" var="lists">
						
							
						
					
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="product">
								<div class="image"><a href="${ctx }/front/detail.html?id=${lists.id}"><img src="${ctx}/${lists.productPic1}" /></a></div>
								<%--<div class="buttons">
									<a class="btn cart" href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a>
									<a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
									<a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
								</div> --%>
								<div class="caption">
									<div class="name"><h3><a href="${ctx }/front/detail.html?id=${lists.id}">${lists.productName}</a></h3></div>
									<div class="price">${lists.price }元<span>${lists.oldPrice }元</span></div>
												<div class="rating">
												<c:if test="${lists.tjxj=='一星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												</c:if>
												<c:if test="${lists.tjxj=='二星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												</c:if>
												<c:if test="${lists.tjxj=='三星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												</c:if>
												<c:if test="${lists.tjxj=='四星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												</c:if>
												<c:if test="${lists.tjxj=='五星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												</c:if>
												
												</div>
								</div>
							</div>
						</div>
						</c:forEach>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="heading"><h2>大家都在看</h2></div>
					<div class="products">
						<c:forEach items="${list2 }" var="lists">
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="product">
								<div class="image"><a href="${ctx }/front/detail.html?id=${lists.id}"><img src="${ctx}/${lists.productPic1}" /></a></div>
								<%--<div class="buttons">
									<a class="btn cart" href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a>
									<a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
									<a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
								</div> --%>
								<div class="caption">
									<div class="name"><h3><a href="${ctx }/front/detail.html?id=${lists.id}">${lists.productName}</a></h3></div>
									<div class="price">${lists.price }元<span>${lists.oldPrice }元</span></div>
												<div class="rating">
												<c:if test="${lists.tjxj=='一星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												</c:if>
												<c:if test="${lists.tjxj=='二星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												</c:if>
												<c:if test="${lists.tjxj=='三星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												</c:if>
												<c:if test="${lists.tjxj=='四星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star-empty"></span>
												</c:if>
												<c:if test="${lists.tjxj=='五星' }">
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												<span class="glyphicon glyphicon-star"></span>
												</c:if>
												
												</div>
								</div>
							</div>
						</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="inc/inc_foot.jsp" %>
</body>
</html>
