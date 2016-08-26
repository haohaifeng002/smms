<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/jquery.min.js"></script>
    <script type="text/javascript">
    var rand = getRandom(4); //验证码全局值（真正的验证码值）
    
    //验证码展示值，展示的时候在每个字符之间添加空格
    function showRand(){
    	var sr = "";
    	for(var i=0,len=rand.length;i<len;i++){
    		sr += rand.charAt(i)+" ";
    	}
    	return sr;
    }
    
    //初始化函数 
    $(function() {
    	$(window).resize(); //初始化登录图展示位置
    	$("#randCode").html(showRand()); //初始化展示验证码
    	
    	//验证码点击事件
    	 $("#randCode").on("click",function(){
   	    	rand = getRandom(4);
   	    	$("#randCode").html(showRand()); //初始化展示验证码
    	 });
    	
    	//回车键事件
    	$("#loginForm").keyup(function (e){
    		if(e.keyCode == 13){
    			submitForm();
    		}
    	});i
    });

    //设定登录页面的上下左右位置居中
    $(window).resize(function() {
    	//设置登录图片div在浏览器中垂直水平居中显示
    	$('#d1').css({
    		position: 'relative',
    		left: ($(window).width() - $('#d1').outerWidth()) / 2,
    		top: ($(window).height() - $('#d1').outerHeight()) / 2 + $(document).scrollTop()
    	});
    	//设置表单表格在图片div中垂直居中
    	$('#d2').css({
    		position: 'absolute',
    		top: ($("#d1").height() - $('#d2').outerHeight()) / 2 + $(document).scrollTop()
    	});

    });

    //生成验证码用的随机码，n表示要生成的位数，验证码一般是4-6位，本系统选择4位
    function getRandom(n) {
    	var chars = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
    	var res = "";
    	for (var i = 0; i < n; i++) {
    		var id = Math.ceil(Math.random() * 35);
    		res += chars[id];
    	}
    	return res;
    }

    //登录提交表单
    function submitForm() {
    	$("#warnMsg").html("登陆中,请稍后..."); 
    	var lv = loginValid(); //验证登录信息
    	if (lv) {
    		window.location.href = "index.do"; //验证登录成功，跳转到index页面
    	}
    }

    //验证登录信息
    function loginValid() {
    	var result = false;
    	var v1 = validLoginInfo(); //用户名和密码验证
    	var v2 = validCheckCode(); //验证码验证
    	if (!(v1 == "ok")) {
    		$("#warnMsg").html("<p style='color:red'>" + v1 + "</p>");
    	} else if (!v2) {
    		$("#warnMsg").html("<p style='color:red'>验证码输入错误！</p>");
    	} else {
    		//$("#warnMsg").html(""); //清空div中的值
    		$("#warnMsg").html("登陆中,请稍后..."); 
    		result = true;
    	}
    	return result;
    }

    //用户名和密码验证
    function validLoginInfo() {
    	var result = "ok";
    	var uname = $.trim($("#userName").val());
    	var pmmd = $("#password").val();
    	if (isBlank(uname) || isBlank(pmmd)) {
    		result = "用户名或密码不能为空！";
    	} else {
    		var obj = {
    			empName: uname,
    			password: pmmd
    		};
    		var jsonStr = JSON.stringify(obj); //对象转换为json字符串
    		var url = "loginValid.do";
    		$.ajax({
    			type: "post",
    			url: url,
    			async: false,
    			data: jsonStr,
    			dataType: "json",
    			contentType: "application/json;charset=UTF-8",
    			success: function(res) {
    				if (res == null) {
    					return;
    				} else {
    					result = res; //res如果验证成功传"ok",否则传需要提示的字符串
    				}
    			}
    		});
    	}

    	return result;
    }

    //验证码验证
    function validCheckCode() {
    	
    /*	if ($("#checkCode").val().toUpperCase() == rand){
    		return true
	    } else {
	    	return false;
	    }
   	*/
   		return true
    }

    function isBlank(res) {
    	return res == "" || res == null;
    }
    
    </script>   
</head>

<style type="text/css">
    *{font-size:12px;}
    #d1 {width:652px; height:539px;background:url(<%=request.getContextPath() %>/images/login3.jpg) no-repeat;background-size:cover;}
    #d2{ width:280px;height:120px;margin:10px 0 0 80px; padding: 10px}
    .inputStyle{border:0;background: #B4D7F3;width: 200px;height:22px;margin:3px 0; padding:0 5px;}
    .laberStyle{color:#fff;font-weight:bold}
    .btn{display:block;width:80px;height:24px;line-height:24px; text-align:center; background:#1074CA;}
    .randCode{font-size:20px;background:#D1E6F9;cursor:pointer}
</style>

<body style="background:#D7E8F6">
<div id="d1">
    <div id="d2">
        <form id="loginForm">
        <table>
            <tr>
                <td><span class="laberStyle">账号:</span></td>
                <td><input type="text" id="userName" class="inputStyle"/></td>
            </tr>
            <tr>
                <td><span class="laberStyle">密码:</span></td>
                <td><input type="password" id="password" class="inputStyle"/></td>
            </tr>
            <tr>
                <td><span class="laberStyle">验证码:</span></td>
                <td><input type="text" id="checkCode" style="width:50%" class="inputStyle"/>　<span id="randCode" class="laberStyle randCode"> </span></td>
            </tr>
            <tr>
                <td>　</td>
                <td><a href="javascript:void(0)" onClick="submitForm()" class="laberStyle btn">登陆</a></td>
            </tr>
            <tr><td colspan="2"><p id="warnMsg">　</p></td></tr>
        </table>
        </form>
    </div>
    
</div>
</body>
</html>