<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head lang="ZH">
    <meta charset="UTF-8">
    <title>登录页面</title>
    <link rel="stylesheet" href="CSS/index.css"/>
</head>
<body>
<div class="ID">
    <form action="login" method="post">
        管理员登录
        <label>账号:
            <input type="text" name="name">
        </label>
        <label>密码:
            <input type="password" name="password">
        </label>
        <input type="submit" name="submit" id="submit">
    </form>
</div>

</body>
</html>
