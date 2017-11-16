<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<%--<script type="text/javascript">--%>
    <%--function getNum(){--%>
        <%--$.ajax({--%>
            <%--type: "POST",--%>
            <%--url: "/user/ajaxNum",--%>
            <%--data: "phonenum="+document.getElementById("phone").value,--%>
            <%--success: function(msg){--%>
                <%--document.getElementById("code").value=msg;--%>
            <%--}--%>
        <%--});--%>
    <%--}--%>
<%--</script>--%>
<body>
<form action="/user/register" id="registFosm" method="post">

<table width="600" border="1">
  <tr>
    <td>账号</td>
    <td><input type=text name="username" id="userName" value="" onblur="check('username')"/><span id="msg"></span></td>
  </tr>
  <tr>
    <td>密码</td>
    <td><input type="text" name="password"/></td>
  </tr>
  <tr>
    <td>确认密码</td>
    <td><input type="text" name="repPas"/></td>
  </tr>
  <tr>
    <td>用户手机</td>
    <td><input type="text" id="phone" name="phonenum"/></td>
  </tr>
  <tr>
    <td>验证码</td>
    <td><input type="text" name="code" id="code"/><input type="button" onclick="getNum()" value="获取手机验证码"/></td>
  </tr>
  <tr>
    <td>身份设定</td>
    <td><input type="radio" name="retype" value="0"/>我是学生<input type="radio" name="retype" value="1"/>我是教师</td>
  </tr>
  <tr>
    <td>绑定邮箱</td>
    <td><input type="text" name="email"/></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><input name="btn" type=button id="btn" value="提交" onclick="check('btn')"/></td>
  </tr>
</table>

</form>
<script type="text/javascript" src="/js/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
  function check(obj){
      $.ajax({

          url:"/user/checkUser",
          data:"username="+$("#userName").val(),
          method:"post",
          success:function (data) {

                  $("#msg").html(data.msg);
                  if (data.status == true && obj=="btn") {
                      $("#registFosm").submit();
                  }
          }
      })
  }
</script>
</body>
</html>
