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
	      <input type="text" id="id" name="id" value="${company.id}" required  lay-verify="required" placeholder="请输入id" autocomplete="off" disabled="disabled" class="layui-input">
	    </div>
	</div>
    <div class="layui-form-item">
	    <label class="layui-form-label">公司编号</label>
	    <div class="layui-input-block">
	      <input type="text" id="comnumber" name="comnumber" value="${company.comnumber}" required  lay-verify="required" placeholder="请输入编号" autocomplete="off" disabled="disabled" class="layui-input">
	    </div>
	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">公司简称</label>
	    <div class="layui-input-inline">
	      <input type="text" id="fshort" name="fshort" value="${company.fshort}" required lay-verify="required" placeholder="请输入简称" autocomplete="off" class="layui-input">
	    </div>
	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">公司全称</label>
	    <div class="layui-input-inline">
	      <input type="text" id="name" name="name" value="${company.name}" required lay-verify="required" placeholder="请输入全称" autocomplete="off" class="layui-input">
	    </div>
	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">注册时间</label>
	    <div class="layui-input-inline">
	      <input type="date" id="regtime" name="regtime" value="${company.regtime}" required lay-verify="required" placeholder="请输入时间" autocomplete="off" class="layui-input">
	    </div>
	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">营业证号</label>
	    <div class="layui-input-inline">
	      <input type="text" id="bulino" name="bulino" value="${company.bulino}" required lay-verify="required" placeholder="请输入号码" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">公司法人</label>
	    <div class="layui-input-inline">
	      <input type="text" id="corname" name="corname" value="${company.corname}" required lay-verify="required" placeholder="请输入法人" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">公司电话</label>
	    <div class="layui-input-inline">
	      <input type="text" id="phone" name="phone" value="${company.phone}" required lay-verify="required" placeholder="请输入电话" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">公司地址</label>
	    <div class="layui-input-inline">
	      <input type="text" id="detaress" name="detaress" value="${company.detaress}" required lay-verify="required" placeholder="请输入地址" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	   <div class="layui-form-item">
	    <label class="layui-form-label">公司账号</label>
	    <div class="layui-input-inline">
	      <input type="text" id="comadmin" name="comadmin" value="${company.comadmin}" required lay-verify="required" placeholder="请输入账号" autocomplete="off" disabled="disabled" class="layui-input">
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
		 		   var company=data.field;
				 		  $.ajax({
				         	url:'companyModify',
				            data:company,
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