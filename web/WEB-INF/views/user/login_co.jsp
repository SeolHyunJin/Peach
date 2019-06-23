<%--
  Created by IntelliJ IDEA.
  User: seolhyeonjin
  Date: 2019-03-14
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width-device-width" >
    <title>Login</title>
    <style>
        .textBar {
            width: 378px;
            line-height: 60px;
            font-size: 15pt;
            border-radius: 30px;
            margin-top: 10px;
        }

        .loginCO {
            background-color: #FF6D70;
            width: 378px;
            height: 40px;
            font-size: 20pt;
            text-align: center;
            vertical-align: middle;
            color: white;
            border-radius: 30px;
            margin-top: 10px;
        }

        .loginBTNL {
            background-color: #FF6D70;
            width: 378px;
            height: 60px;
            font-size: 20pt;
            text-align: center;
            vertical-align: middle;
            color: white;
            border-radius: 30px;
            margin-top: 10px;
        }
    </style>

</head>

<body>

<div style="margin: 0 auto; padding: 10px; position: relative; background-color: #FF6D70; height: 30px;">
    <p style="color: white; font-weight: bold; font-size: 20pt; text-align: center; margin-top: 0px; padding-top: 0px;">
        Peach
    </p>
</div>

<div style="text-align: center; vertical-align: middle; position: relative; margin-top: 170px; margin-bottom: 10px;">
    <p style="text-align: center; font-weight: bold; font-size: 40pt;">
        Login For Company
    </p>


    <form action="${path}/user/E_Profile" method="post">
        <input type="text" name="email" size="40" placeholder="이메일" autofocus required class="textBar">
        <br/>
        <input type="password" name="pw" size="40" height="20" placeholder="비밀번호" required class="textBar">
        <br/>
        <input type="submit" value="로그인" class="loginBTNL" style="margin-left: 1px;">
        <br/>
        <input type="button" value="회원가입" class="loginBTNL" onclick="location.href = ''">
    </form>
</div>


</body>
</html>