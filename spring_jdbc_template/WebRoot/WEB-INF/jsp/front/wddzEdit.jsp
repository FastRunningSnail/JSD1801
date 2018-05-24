<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@include file="inc/inc_css.jsp" %>
<script type="text/javascript"
	src="${ctx}/resource/jsAddress.js"></script>

<body>
	<!--Top-->
	<%@include file="inc/inc_head.jsp" %>
	<div id="page-content" class="single-page">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="heading"><h2>地址管理</h2></div>
					<form name="form2" id="registerFormcustomer" method="post" action="">
						<input type="hidden" name="id" value="${param.id }"/>
						<div class="form-group">
							省市： <select class="form-control" id="cmbProvince" name="province"></select>  
                        <select class="form-control" id="cmbCity" name="city"></select>
                        <select class="form-control" id="cmbArea" name="area"></select> 
                        <script type="text/javascript">  
                   addressInit('cmbProvince', 'cmbCity', 'cmbArea');  
               </script>  
						</div>
						<div class="form-group">
							<input type="text" class="form-control" id="address" name="address" placeholder="详细收货地址">
						</div>
						<div class="form-group">
							<input type="text" class="form-control" id="lxr" name="lxr" placeholder="联系人">
						</div>
						<div class="form-group">
							<input type="text" class="form-control" id="lxdh" name="lxdh" placeholder="联系电话">
						</div>
						<button type="button" onclick="registerSave();" class="btn btn-1">保存</button>
					</form>
					
				</div>
			</div>
		</div>
	</div>
<%@include file="inc/inc_foot.jsp" %>
</body>
<script type="text/javascript">
	
	
	
	function registerSave(){
		var address = $("#address").val();
		var lxr = $("#lxr").val();
		var lxdh = $("#lxdh").val();
		if(address==''){
			alert('详细地址必须填写');
			return false;
		}
		if(lxr==''){
			alert('联系人必须填写');
			return false;
		}
		if(lxdh==''){
			alert('联系电话必须填写');
			return false;
		}
		$.ajax({
		      type: "POST",
		      async:false,  // 设置同步方式
		      cache:false,
		      url: "${ctx}/front/wddzSave.html",
				data:$("#registerFormcustomer").serializeArray(),
				success:function(result){
				result = eval("("+result+")");
				if(result.status=='true'||result.status==true){
						alert('添加成功');
						window.location.href="${ctx}/front/wddz.html";
				}
		      }
			});
	}
</script>
</html>