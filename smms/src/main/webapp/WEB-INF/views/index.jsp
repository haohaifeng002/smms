<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../js/easyui/themes/icon.css">
    <script type="text/javascript" src="../js/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
    <!-- ztree -->
    <link rel="stylesheet" type="text/css" href="../js/ztree/zTreeStyle.css">
    <script type="text/javascript" src="../js/ztree/jquery.ztree.all.js"></script>

    <script type="text/javascript">
    $(function(){
        var setting = {
            data: {
                simpleData: {
                    enable: true
                }
            },
            callback : {
                onClick : function (event,treeId,treeNode,clickFlag){

                    //如果选项卡存在，则选中该选项卡
                    if($("#tabsContent").tabs("exists",treeNode.name)){

                        $("#tabsContent").tabs("select",treeNode.name);

                    }else{

                        $("#tabsContent").tabs('add',{      // 不存在则点击添加tab选项卡
                            title:treeNode.name,
                            //注意:此处为tab页iframe标签，src动态给予链接
                            content:"<iframe src='http://www.baidu.com/' style='width:100%;height:100%;border:0;'></iframe>",       //
                            closable:true,
                        });
                    }
                }
            },
        };

        var zNodesPeople=[
            {id:1,pId:0, name:'员工管理',open:true},
            {id:2,pId:0, name:'客户管理'},
            {id:3,pId:0, name:'供应商管理'},
        ];
        var zNodesProduct=[
            {id:1,pId:0, name:'进货管理',open:true},
            {id:2,pId:0, name:'退货管理'},
            {id:3,pId:0, name:'销售管理'},
            {id:4,pId:0, name:'日常盘点'},
            {id:4,pId:0, name:'库存盘点'},
            {id:4,pId:0, name:'辅助工具'},
        ];
        var zNodesFinancial=[
            {id:1,pId:0, name:'成本会计',open:true},
            {id:2,pId:0, name:'财务会计'},
        ];
        var zNodesSys=[
            {id:1,pId:0, name:'漏洞修复',open:true},
            {id:2,pId:0, name:'数据备份'},
            {id:3,pId:0, name:'系统升级'},
            {id:4,pId:0, name:'日志维护'},
        ];
        
        $(document).ready(function(){
            
            $.fn.zTree.init($("#peopleManagerTree"),setting, zNodesPeople);
            $.fn.zTree.init($("#productManagerTree"),setting,zNodesProduct);
            $.fn.zTree.init($("#financialManagerTree"),setting,zNodesFinancial);
            $.fn.zTree.init($("#sysManagerTree"), setting,zNodesSys);
        });
    });

</script>
</head>
<style>
	*{margin:0;padding:0;font-size:12px;}
	a{text-decoration:none}
	a:hover{color:#999}
</style>
<body class="easyui-layout">
    <!-- 北部 （顶部）-->
    <div data-options="region:'north'" style="height:80px;background:#E6FCF0;opacity:0.7;padding:10px 30px 0 30px;">
        <h3 style="font-size:18px;line-height:40px;">SMMS(超市管理系统)</h3>
        <p style="float:right;"><span>欢迎${sessionScope.userLogin.empName}登陆，上次登陆时间：${sessionScope.userLogin.lastLoginTime}</span>　　<a href="logOut.do">注销</a></p>
      	
    </div>

    <!-- 南部 （底部）-->
    <div data-options="region:'south'" style="height:40px;text-align:center;line-height:30px;">
       SMMS开发组  2016-2020  版权©所有，违反必究 
    </div>

    <!-- 西部菜单 -->
    <div data-options="region:'west',title:'菜单导航',split:true" style="width:200px;">
        <!-- 手风琴菜单 -->
        <div class="easyui-accordion" data-options="fit:true">
            <!-- 树菜单 -->
            <div data-options="title:'人员管理',iconCls:'icon-mini-add'">
                <ul id="peopleManagerTree" class="ztree"></ul>
            </div>
            <div data-options="title:'商品管理',iconCls:'icon-mini-add'">
                <ul id="productManagerTree" class="ztree"></ul>
            </div>
            <div data-options="title:'财务管理',iconCls:'icon-mini-add'">
                <ul id="financialManagerTree" class="ztree"></ul>
            </div>
            <div data-options="title:'系统管理',iconCls:'icon-mini-add'">
                <ul id="sysManagerTree" class="ztree"></ul>
            </div>
        </div>
    </div>

    <!-- 中部展示区 -->
    <div data-options="region:'center'">
        <div id="tabsContent" class="easyui-tabs" data-options="fit:true">
            <div data-options="title:'欢迎登陆',closable:true" style="width:100%;height:100%;background:#E6FCF0 url(../images/welcome.jpg);background-size:cover;opacity:0.3">
            </div>
        </div>
    </div>
</body>
</html>