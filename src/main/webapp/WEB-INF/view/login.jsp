<%--
  Created by IntelliJ IDEA.
  User: wanwan
  Date: 16/7/10
  Time: 下午6:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    * {
        margin: 0;
        padding: 0;
    }

    .login-back {
        background: url("/static/img/login-back.jpg") round;
        background-size: cover;
        font-family: "微软雅黑 Light";
    }

    @-moz-document url-prefix(http://), url-prefix(https://), url-prefix(about:blank) {
        body {
            background: url("/static/img/login-back.jpg");
        }
    }

    .login-div {
        width: 500px;
        height: 230px;
        border: 1px solid silver;
        border-radius: 15px;
        background-color: transparent;
        margin: auto;
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        text-align: center;
    }

    .span-font {
        text-align: center;
        font-weight: bold;
        font-size: 22px;
    }

    #user, #pass {
        width: 150px;
        height: 30px;
        border: 1px solid #dddddd;
        margin: 10px;
        text-indent: 5px;
        font-size: 14px;
        color: #ccc;
    }

    .form-input {
        width: 100px;
        height: 30px;
        border: 1px solid #dddddd;
        margin: 10px;
        text-indent: 5px;
        font-size: 14px;
        color: #ccc;
    }

    .login-input-code1 {
        width: 70px;
        height: 30px;
        border: 0;
        font-family: Arial;
        font-style: italic;
        color: #ff97cf;
        padding: 2px 3px;
        letter-spacing: 9px;
        font-weight: bolder;
        background-color: #00A000;
    }

    a > span {
        border: 1px solid silver;
        padding: 3px 10px;
        border-radius: 10%;
        box-shadow: silver 3px 3px 3px 3px;
    }
</style>

<script src="/static/jquery/jquery.min.js" type="text/javascript"></script>
<script src="/static/jquery/jquery.form.js" type="text/javascript"></script>
<link href="/static/jquery/themes/icon.css" rel="stylesheet" type="text/css"/>
<link href="/static/jquery/themes/color.css" rel="stylesheet" type="text/css"/>
<link href="/static/jquery/themes/default/easyui.css" rel="stylesheet" type="text/css"/>
<script src="/static/jquery/jquery.easyui.min.js" type="text/javascript"></script>
<script src="/static/jquery/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>

<%--<body>--%>
  <%--<form method="post" action="/login/login" >--%>

      <%--<table>--%>
          <%--<tr>--%>

            <%--<td> 姓名:</td>--%>
              <%--<td><input type="text"  name="username"></td>--%>

          <%--</tr>--%>
          <%--<tr>--%>
              <%--<td>密码:</td>--%>
              <%--<td><input type="text" name="password"></td>--%>
          <%--</tr>--%>
          <%--<tr>--%>

              <%--<td><input type="submit" value="提交"></td>--%>
          <%--</tr>--%>
      <%--</table>--%>

  <%--</form>--%>



<%--</body>--%>


<body class="login-back">
<div class="login-div">
    <div style="margin-top: 10px">
        <span class="span-font">估价宝管理员登陆</span>
    </div>
    <div>
        <form id="loginForm" action="/login/login" method="post">
            <div>
                <label>用户名：</label>
                <input type="text" id="user" name="username"
                       onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" maxlength="30">
            </div>
            <div>
                <label>密&emsp;码：</label>
                <input type="password" id="pass" name="password" maxlength="30">
            </div>
            <%--<div style="margin-left: 23px">--%>
                <%--<label>验证码：</label>--%>
                <%--<input type="text" id="input1" maxlength="4" class="form-input">--%>
                <%--<input type="text" readonly="readonly" id="checkCode" onclick="createCode()" class="login-input-code1">--%>
            <%--</div>--%>
            <div style="margin-top: 6px">

                <%--<a class="easyui-linkbutton" onclick="validate()"--%>
                   <%--style="margin: 5px"><span>确&emsp;定</span></a>--%>
                <input type="submit" value="提交">
            </div>
        </form>
    </div>
</div>
</body>
<%--<script language="javascript" type="text/javascript">--%>

    <%--var count = 0;--%>
    <%--var code;//定义全局变量--%>
    <%--function createCode() {--%>
        <%--code = "";//定义验证码--%>
        <%--var codeLength = 4;//验证码的长度--%>
        <%--var checkCode = document.getElementById("checkCode");--%>
        <%--var selectChar = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D',--%>
                <%--'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',--%>
                <%--'T', 'U', 'V', 'W', 'X', 'Y', 'Z');//所有候选组成验证码的字符--%>
        <%--for (var i = 0; i < codeLength; i++) {--%>
            <%--var charIndex = Math.floor(Math.random() * 36);--%>
            <%--code += selectChar[charIndex];--%>
        <%--}--%>
        <%--//alert(code);--%>
        <%--if (checkCode) {--%>
            <%--//checkCode.className = "code";--%>
            <%--checkCode.value = code;--%>
        <%--}--%>
    <%--}--%>
    <%--function validate() {--%>
        <%--var inputCode = document.getElementById("input1").value.toLowerCase();//toLowerCase()将字符串转换成小写--%>
        <%--var autodata = document.getElementById("checkCode").value.toLowerCase();--%>
        <%--if (inputCode.length <= 0 || inputCode != autodata||inputCode==1234) {--%>
<%--//            $.messager.confirm("提示", '验证码输入错误，请重新输入验证码');--%>
            <%--alert("验证码输入错误，请重新输入验证码！");--%>
            <%--createCode();--%>
        <%--} else if (inputCode == autodata) {--%>
            <%--checkpost();--%>
        <%--}--%>
    <%--}--%>
    <%--function init() {--%>
        <%--createCode();--%>
    <%--}--%>
    <%--init();--%>
    <%--function checkpost() {--%>
        <%--var httpConfig = {--%>
            <%--username: $("#user").val(),--%>
            <%--password: $("#pass").val()--%>
        <%--};--%>
        <%--console.log(httpConfig);--%>
        <%--$.ajax(--%>
                <%--{--%>
                    <%--method: "post",--%>
                    <%--url: "/admin/doLogin",--%>
                    <%--params: httpConfig,--%>
                    <%--success: function (resultJson) {--%>
                        <%--console.log(resultJson);--%>
                        <%--alert(resultJson.code);--%>


                        <%--//   alert(JSON.stringify(resultJson));--%>
                        <%--if (resultJson.code == 200) {--%>
                            <%--window.location.href = "/admin/index";--%>
                        <%--} else {--%>
                            <%--//回调操作--%>
                            <%--alert("用户名或密码不正确！");--%>
<%--//                $.messager.confirm("提示", "用户名或密码不正确！");--%>
                            <%--createCode();--%>
                        <%--}--%>
                    <%--}--%>
                <%--});--%>


    <%--}--%>
<%--</script>--%>
</body>



</html>
