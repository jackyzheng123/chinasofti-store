<head>
<meta charset="UTF-8">
<title>后台界面</title>
<link rel="stylesheet" type="text/css"
	href="/css/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="/css/zk.css" />
<link rel="stylesheet" type="text/css" href="/css/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="/css/themes/myicon.css" />
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="/js/jquery-easyui-1.5.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="/js/jquery-easyui-1.5.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="/js/menu.js"></script>
</head>

<body class="easyui-layout" id="mainPanel">

	<!--上部展示位置-->
	<div class="zk-header"
		data-options="region:'north',border:false,split:true">
		<div class="zk-header-left">
			<div class="header-1" style="float: left; margin-top: 10px">
				<img src="/images/zrgj.png">
			</div>
			<div class="header-2" style="float: right;">
				<h1 style="color: black;">中软华腾商城</h1>
			</div>
		</div>

		<div class="zk-header-right">
			<button href="javascript:void(0)" id="mb" class="easyui-menubutton"
				data-options="menu:'#mm',iconCls:'icon-personal'"
				style="background-color: white;">admin</button>
			<div id="mm" style="width: 150px;">
				<div data-options="iconCls:'icon-undo'">密码设置</div>
				<div data-options="iconCls:'icon-redo'">退出系统</div>
			</div>
			<button href="javascript:void(0)" id="mb" class="easyui-menubutton"
				data-options="menu:'#mm2',iconCls:'icon-settings32'"
				style="background-color: white;">系统切换</button>
			<div id="mm2" style="width: 150px;">
				<div data-options="iconCls:'icon-house'" onclick="switchMain()">基础平台</div>
				<div data-options="iconCls:'icon-color-swatch'"
					onclick="swicthOperationCenter()">运营中心</div>
				<div data-options="iconCls:'icon-wechat'"
					onclick="swicthWechatCenter()">微信平台</div>
			</div>
		</div>
	</div>

	<!--左菜单栏-->
	<div class="zk-sidebar"
		data-options="region:'west',split:true,title:'菜单'"
		style="width: 150px; padding: 10px;">
		<div class="easyui-accordion" data-options="border:false,fit:true"
			id="acc"></div>
	</div>

	<!--主界面-->
	<div class="zk-main" data-options="region:'center'">
		<div id="zk-tabs" class="easyui-tabs"
			data-options="border:false,fit:true">
			<div title="首页" style="background-image: url(/images/shouye1.png)"
				data-options="closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
		</div>
	</div>

	<!--下方版权标识-->
	<div class="zk-footer"
		data-options="region:'south',border:true,split:true">© 2017
		后台测试界面, 粤ICP备14024044号-2, All Rights Reserved.</div>
		
	<script type="text/javascript">
		
	</script>

</body>