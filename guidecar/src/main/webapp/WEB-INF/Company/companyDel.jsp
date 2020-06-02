<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 导入layUIcss文件 -->
  <link rel="stylesheet" href="../layui/css/layui.css">
</head>
<body class="layui-view-body">
    <div class="layui-content">
    	<div class="layui-row">
            <div class="layui-card">
                <div class="layui-card-header">删除文章</div>
                <form class="layui-form layui-card-body" action="">
                  <div class="layui-form-item">
                    <label class="layui-form-label">文章名字</label>
                    <div class="layui-input-inline">
                      <input type="text" id="a_title" name="a_title" required  lay-verify="required" placeholder="请输入文章名字" autocomplete="off" class="layui-input">
                    </div>
                     <div class="layui-input-inline">
                      <button class="layui-btn layui-btn-blue" lay-submit lay-filter="formFind">立即查找</button>
                    </div>
                  </div>
                </form>  
            </div>
        </div>
         <div class="layui-row" style="display: none;" id="d1">
            <div class="layui-card">
                <div class="layui-card-header">查找信息如下</div>
                <form class="layui-form" action="">
                <div class="layui-form-item" style="display: none;">
				    <label class="layui-form-label">id</label>
				    <div class="layui-input-block">
				      <input type="text" id="id" name="id" required  lay-verify="required" autocomplete="off" class="layui-input">
				    </div>
				  </div>
				  <div class="layui-form-item">
				    <label class="layui-form-label">名字</label>
				    <div class="layui-input-block">
				      <input type="text" id="title" name="title" required  lay-verify="required" placeholder="请输入名字" autocomplete="off" class="layui-input">
				    </div>
				  </div>
				  <div class="layui-form-item">
				    <label class="layui-form-label">作者</label>
				    <div class="layui-input-inline">
				      <input type="text" id="author" name="author" required lay-verify="required" placeholder="请输入作者" autocomplete="off" class="layui-input">
				    </div>
				  </div>
				  <div class="layui-form-item">
				    <label class="layui-form-label">类型</label>
				    <div class="layui-input-block">
				      <select id="city" name="city" lay-verify="">
						  <option value="0">请选择一个类型</option>
						  <option value="1">唐诗</option>
						  <option value="2">宋词</option>
						  <option value="3">元曲</option>
						  <option value="4">现代诗</option>
						  <option value="5">散文</option>
						  <option value="6">小说</option>
				  	 </select>    
				    </div>
				  </div>
				  <div class="layui-form-item layui-form-text">
				    <label class="layui-form-label">内容</label>
				    <div class="layui-input-block">
				      <textarea id="desc" name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
				    </div>
				  </div>
				  <div class="layui-form-item">
				    <div class="layui-input-block">
				      <button class="layui-btn" lay-submit lay-filter="formDelect">立即删除</button>
				    </div>
				  </div>
				</form>
            </div>
        </div>
	</div>
	
  
	<!-- 导入layUI核心js文件 -->
 	<script src="../layui/layui.js"></script>

 	<script type="text/javascript">
 		
 		//模块化加载layui  用到哪个模块才去加载
 		layui.use(['form','jquery','layer'], function () {
		  	//获得组件对象
		  	var form   = layui.form;//获得from模块
        	
        	var layer  = layui.layer;//获得弹出层组件
		 	
		 	var $ = layui.jquery;//获得jquery模块
		 	  //监听查询提交
		 	  form.on('submit(formFind)', function(){
		 		   $("#d1").css("display","");
				 		  $.ajax({
				         	url:'findArticle',
				            data:{
				            	title:$("#a_title").val()	
				            },
				            dataType:'json',
				            type:'post',
				            success:function (data) {
				            	console.log(data);
				            	var d=data.data;
				                if (data.status == '1'){
				                	layer.msg(data.msg);
				                	$("#id").val(d.id);
				                   	$("#title").val(d.title);
				                   	$("#author").val(d.author)
				                  
				                   	$("#desc").val(d.content);
				                }else{
				                    layer.msg(data.msg);
				                }
				            }
				         })  
				   return false;
		 	  });
		 	//监听删除提交
		 	  form.on('submit(formDelect)', function(){
				 $.ajax({
				    url:'delArticle',
				    data:{
				         id:$("#id").val()	
				     },
				    dataType:'json',
				    type:'post',
				    success:function (data) {
					    console.log(data);
					    var d=data.data;
					    if (data.status == '1'){
					      layer.msg(data.msg);
					    }else{
					       layer.msg(data.msg);
					    }
				    }
				  })  
				   $("#d1").css("display","none");
				   return false;
		 	  });
		 	});
 </script>

</body>
</html>