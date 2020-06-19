<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.xzy.entity.*" %>
<%
      User u=(User)request.getSession().getAttribute("user");
	 Company company=(Company)request.getSession().getAttribute("company");
 %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>指南车物流</title>
  <link rel="stylesheet" href="../layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo"><%=company.getName() %></div>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
        <%= u.getNick_name()%>
        </a>
        <dl class="layui-nav-child">
          <dd><a href="javascript:;" id="up">基本资料</a></dd>
          <dd><a href="javascript:;" id="modify">修改密码</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/login/logout">退了</a></li>
    </ul>
  </div>
  	<!--头部结束  -->
  			<div class="layui-side layui-bg-black">
    			<div class="layui-side-scroll">
    				 <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
    				<ul class="layui-nav layui-nav-tree"  lay-filter="test">
       					 <li class="layui-nav-item layui-nav-itemed">
        					  <a class="" href="javascript:;">快递管理</a>
          					<dl class="layui-nav-child">
          						 <dd><a data-id="0" data-url="../waybili/toWayBiliList" data-title="订单管理" data-type="tabAdd" class="menu">订单管理</a></dd>
								<!-- <dd><a data-id="1" data-url="user/toUserList" data-title="会员管理" data-type="tabAdd" class="menu">会员管理</a></dd>
								<dd><a data-id="2" data-url="" data-title="评价管理" data-type="tabAdd" class="menu">评价管理</a></dd> -->
							
							</dl>
							<dl class="layui-nav-child">
          						 <dd><a data-id="1" data-url="../waybili/toWayBiliDepot" data-title="出库管理" data-type="tabAdd" class="menu">入库管理</a></dd>
							
							</dl>
							<dl class="layui-nav-child">
          						 <dd><a data-id="2" data-url="../waybili/toWayBiliSign" data-title="签收管理" data-type="tabAdd" class="menu">签收管理</a></dd>
							
							</dl>
							<dl class="layui-nav-child">
          						 <dd><a data-id="3" data-url="../quality/toQuality" data-title="监督管理" data-type="tabAdd" class="menu">监督管理</a></dd>
							
							</dl>
							
      					 </li>
						 
					</ul>
					
   				</div>
  			</div>
  			<div class="layui-body">
   			 <!-- 选项卡面板 -->
       			<div class="layui-tab" lay-filter="tabs" lay-allowclose="true">
					<ul class="layui-tab-title"></ul>
					<div class="layui-tab-content"></div>
   				 </div>
  			</div>

  
  			<!-- <div class="layui-footer"> 
  			  底部固定区域
    			© layui.com - 底部固定区域
  			</div> -->
		</div>
		<script src="../layui/layui.js"></script>
		<script>
		
		  
			//JavaScript代码区域
			layui.use(['element','jquery','layer'], function(){
  				var element = layui.element;
  				var $= layui.jquery;
  			 	var layer = layui.layer;
  			 
  			 	/* $(function(){
  			 		var s=$.cookie('userName');
  			 		//console.log("1111");
  			 		//console.log(s);
  			 		$('#usera').html(s);
  			 	}); */
  				$('.menu').on('click',function(){
  								
  								var dataid = $(this);
  								
  								if ($(".layui-tab-title li[lay-id]").length <= 0) {
  									//如果比零小，则直接打开新的tab项
  									
  									active.tabAdd(dataid.attr("data-url"), dataid
  													.attr("data-id"), dataid
  													.attr("data-title"));
  								} else {
  									//否则判断该tab项是否以及存在
  									var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
  									$.each($(".layui-tab-title li[lay-id]"),
  											function() {
  												//如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
  												if ($(this).attr("lay-id") == dataid
  														.attr("data-id")) {
  													isData = true;
  												}
  											})
  									if (isData == false) {
  										//标志为false 新增一个tab项
  										active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
  									}
  								}
  								//最后不管是否新增tab，最后都转到要打开的选项页面上
  								active.tabChange(dataid.attr("data-id"));
  							});
  				
  				
  						var active = {
  								//在这里给active绑定几项事件，后面可通过active调用这些事件
  								tabAdd : function(url, id, name) {
  									
  									//新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
  									//关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
  									element.tabAdd('tabs', {
  										title : name,
  										content : '<iframe data-frameid="' + id
  												+ '" scrolling="auto" frameborder="0" src="'
  												+ url
  												+ '" style="width:100%;height:99%;"></iframe>',
  										id : id
  									//规定好的id
  									})
  									FrameWH(); //计算ifram层的大小
  								},
  								tabChange : function(id) {
  									//切换到指定Tab项
  									element.tabChange('tabs', id); //根据传入的id传入到指定的tab项
  								},
  								tabDelete : function(id) {
  									element.tabDelete("tabs", id);//删除
  								}
  							};
  							function FrameWH() {
  								var h = $(window).height();
  								$("iframe").css("height", h + "px");
  							}
  				
  				$("#up").on("click",function(){
  					layer.open({
			           	type:2,//表示使用iframe嵌入一个窗口引入一个页面
			           	title:"编辑信息",
			           	content:"../user/toUpdateUser?id="+<%=u.getId()%>,//访问控制器,查询部门,菜单数据
			           	area: ['500px', '400px'],//设置宽高
			           	offset: '10px'
			        });
  				});
  				$("#modify").on("click",function(){
  					layer.open({
  						type:2,
  						title:"",
  						content:"../user/toModifyUser?id="+<%=u.getId()%>,
  						area: ['500px','400px'],
  						offset: '10px'
  					});
  				});
  				
  				
  
			});

		</script>
	</body>
</html>