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
	      <input type="text" id="id" name="id" value="${article.id }" required  lay-verify="required" placeholder="请输入名字" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">名字</label>
	    <div class="layui-input-block">
	      <input type="text" id="title" name="title" value="${article.title }" required  lay-verify="required" placeholder="请输入名字" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">作者</label>
	    <div class="layui-input-inline">
	      <input type="text" id="author" name="author" value="${article.author }" required lay-verify="required" placeholder="请输入作者" autocomplete="off" class="layui-input">
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">类型</label>
	    <div class="layui-input-block">
	     <select id="city" name="typeId" lay-verify="required">
			<c:forEach  items="${typeList }" var="Type">
				<option value="${Type.id }" ${Type.id==article.typeId?'selected':'' }>${Type.name }</option>
			</c:forEach>
		</select>    
	    </div>
	  </div>
	  <div class="layui-form-item layui-form-text">
	    <label class="layui-form-label">内容</label>
	    <div class="layui-input-block">
	      <textarea id="content" name="content" placeholder="请输入内容" class="layui-textarea">${article.content}</textarea>
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
		 		   var article=data.field;
				 		  $.ajax({
				         	url:'articleModify2',
				            data:article,
				            dataType:'json',
				            type:'post',
				            success:function (data) {
				                if (data.status == '1'){
				                	layer.msg(data.msg);
				                	$("#d1").css("display","none");
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