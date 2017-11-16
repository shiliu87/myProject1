<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2017/11/15
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="js/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="js/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="js/demo/demo.css">
</head>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.easyui.min.js"></script>
<script src="js/locale/easyui-lang-zh_CN.js"></script>

<body>
<h2>Basic Calendar</h2>
<p>Click to select date.</p>
<div style="margin:20px 0"></div>
<div class="easyui-calendar" style="width:250px;height:250px;"></div>

<input  id="birth" name="birth" type= "text" class= "easyui-datebox" required ="required"> </input>

<table class="easyui-datagrid" style="width:400px;height:250px"
       data-options="url:'data.json',fitColumns:true,singleSelect:true">
    <thead>
    <tr>
        <th data-options="field:'code',width:100">编码</th>
        <th data-options="field:'name',width:100">名称</th>
        <th data-options="field:'price',width:100,align:'right'">价格</th>
    </tr>
    </thead>
</table>

</body>
</html>
