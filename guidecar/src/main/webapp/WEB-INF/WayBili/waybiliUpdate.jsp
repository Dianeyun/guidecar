<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 导入layUIcss文件 -->
  <link rel="stylesheet" href="../layui/css/layui.css">
</head>
<body class="layui-view-body">
    <form class="layui-form" action="">
      <div class="layui-form-item" style="display: none;">
	    <label class="layui-form-label">id</label>
	    <div class="layui-input-block">
	      <input type="text" id="id" name="id" value="${waybill.id}" required  lay-verify="required" placeholder="请输入id" autocomplete="off" disabled="disabled" class="layui-input">
	    </div>
	</div>
    <div class="layui-form-item">
	    <label class="layui-form-label">订单号</label>
	    <div class="layui-input-block">
	      <input type="text" id="wb_id" name="wb_id" value="${waybill.wb_id}" required  lay-verify="required" placeholder="请输入订单号" autocomplete="off" class="layui-input">
	    </div>
	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">货物名称</label>
	    <div class="layui-input-inline">
	      <input type="text" id="name" name="name" value="${waybill.name}" required lay-verify="required" placeholder="请输入货物名称" autocomplete="off" class="layui-input">
	    </div>
	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">收货人姓名</label>
	    <div class="layui-input-inline">
	      <input type="text" id="consignee_name" name="consignee_name" value="${waybill.consignee_name}" required lay-verify="required" placeholder="请输入收货人姓名" autocomplete="off" class="layui-input">
	    </div>
	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">收货人电话</label>
	    <div class="layui-input-inline">
	      <input type="text" id="consignee_phone" name="consignee_phone" value="${waybill.consignee_phone}" required lay-verify="required" placeholder="请输入收货人电话" autocomplete="off" class="layui-input">
	    </div>
	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">发货人姓名</label>
	    <div class="layui-input-inline">
	      <input type="text" id="consignor_name" name="consignor_name" value="${waybill.consignor_name}" required lay-verify="required" placeholder="请输入发货人姓名" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">发货人电话</label>
	    <div class="layui-input-inline">
	      <input type="text" id="consignor_phone" name="consignor_phone" value="${waybill.consignor_phone}" required lay-verify="required" placeholder="请输入发货人电话" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">包装</label>
	    <div class="layui-input-inline">
	      <input type="text" id="packing" name="packing" value="${waybill.packing}" required lay-verify="required" placeholder="包装" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">件数</label>
	    <div class="layui-input-inline">
	      <input type="text" id="number" name="number" value="${waybill.number}" required lay-verify="required" placeholder="请输入件数" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">重量</label>
	    <div class="layui-input-inline">
	      <input type="text" id="weight" name="weight" value="${waybill.weight}" required lay-verify="required" placeholder="请输入重量" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">赔偿费</label>
	    <div class="layui-input-inline">
	      <input type="text" id="damages" name="damages" value="${waybill.damages}" required lay-verify="required" placeholder="请输入赔偿费" autocomplete="off"  class="layui-input">
	    </div>
	  </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">运单状态</label>
	    <div class="layui-input-inline">
	      <input type="text" id="wb_status" name="wb_status" value="${waybill.wb_status}" required lay-verify="required" placeholder="请输入运单状态" autocomplete="off"  class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">备注</label>
	    <div class="layui-input-inline">
	      <input type="text" id="remarks" name="remarks" value="${waybill.remarks}" required lay-verify="required" placeholder="请输入备注" autocomplete="off"  class="layui-input">
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <div class="layui-input-block">
	      <button class="layui-btn" lay-submit lay-filter="formModeify">立即修改</button>
	    </div>
	  </div>
	</form>
  
	<!-- 导入layUI核心js文件 -->
 	<script src="../layui/layui.js"></script>
 	<script type="text/javascript">
 		//模块化加载layui  用到哪个模块才去加载
 		layui.use(['form','jquery','layer'], function () {
		  	//获得组件对象
		  	var form   = layui.form;//获得from模块
        	
        	var layer  = layui.layer;//获得弹出层组件
		 	
		 	var $ = layui.jquery;//获得jquery模块
		 	//监听修改提交
		 	  form.on('submit(formModeify)', function(data){
		 		   //$("#d1").css("display","");
		 		   console.log(data.field);
		 		   var waybill=data.field;
				 		  $.ajax({
				         	url:'updateWayBill',
				            data:waybill,
				            dataType:'json',
				            type:'post',
				            success:function (data) {
				                if (data.status == '1'){
				                	layer.msg(data.msg);
				                	layer.closeAll('iframe');//关闭所有的iframe层  
				                }else{
				                    layer.msg(data.msg);
				                    
				                }
				            }
				         })  
				   return false;
		 	  });
		 	});
   
 </script>

</body>
</html>