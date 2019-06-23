<%--
  Created by IntelliJ IDEA.
  User: seolhyeonjin
  Date: 2019-03-14
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
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
            position: absolute;
            left: 50%;
            background-color: #FF6D70;
            width: 378px;
            height: 30px;
            font-size: 18pt;
            text-align: center;
            vertical-align: middle;
            color: white;
            border-radius: 30px;
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
        Login
    </p>


  <form action="${path}/user/loginPost" method="post">
        <input type="text" name="userEmail" size="40" placeholder="이메일" autofocus required class="textBar">
        <br/>
        <input type="password" name="userPw" size="40" height="20" placeholder="비밀번호" required class="textBar">
        <br/>
        <input type="submit" value="로그인" class="loginBTNL" style="margin-left: 1px;">
        <br/>
        <input type="button" value="기업용 로그인" class="loginBTNL" onclick="location.href = '${path}/user/login_co';">
        <br/>
        <input type="button" value="회원가입" class="loginBTNL" onclick="location.href = '${path}/user/register';">
    </form>
</div>

<script>
    var msg = "${msg}";
    if(msg === "REGISTERED"){
        alert("회원가입이 완료되었습니다. 로그인 해주세요 ~ ");
    } else if(msg === "FAILURE"){
        alert("아이디와 비밀번호를 확인해주세요");
    }
</script>

</body>
</html>