<%--
  Created by IntelliJ IDEA.
  User: seolhyeonjin
  Date: 2019-03-25
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width-device-width">
    <title>Profile</title>
    <style>
        .profile-container {
            width: 960px;
            margin: 0px auto;
            padding: 20px;
            position: relative;
        }

        .profile-content {
            width: 600px;
            padding: 20px;
            margin-bottom: 0px;
            float: left;
            border: 1px solid #bcbcbc;
            position: relative;
            border-radius: 10px;
        }

        .profile-sidebar {
            width: 300px;
            float: right;
            position: relative;
        }

        .profile-sidebar2 {
            width: 260px;
            height: 230px;
            padding: 20px;
            margin-bottom: 20px;
            border: 1px solid #bcbcbc;
            border-radius: 10px;
        }

        .profile-photoline {
            width: 150px;
            height: 150px;
            border: 1px solid #bcbcbc;
            border-radius: 50%;
            margin-bottom: 25px;
            text-align: center;
            vertical-align: middle;
            position: relative;
            float: left;
        }

        .profile-photo {
            width: 150px;
            height: 150px;
            border-radius: 50%;
            float: left;
        }

        .profile-box {
            width: 400px;
            height: 150px;
            margin-left: 10px;
            margin-right: 10px;
            margin-bottom: 25px;
            text-align: center;
            vertical-align: middle;
            position: relative;
            float: right;
        }

        .profile-edit {
            border: 1px solid #bcbcbc;
            text-align: center;
            vertical-align: middle;
            font-size: 15pt;
            width: 380px;
            border-radius: 10px;
            background-color: #FF6D70;
            color: white;
        }

        .logout {
            border: 1px solid #bcbcbc;
            text-align: center;
            vertical-align: middle;
            font-size: 10pt;
            width: 100px;
            background-color: #FF6D70;
            color: white;
        }

        .profile-introduce {
            padding: 15px;
            padding-top: 50px;
            margin: 0px auto;
            clear: both;
        }

        .show-all {
            text-align: center;
            font-size: 10pt;
            border: 1px solid #bcbcbc;
            border-radius: 5px;
            width: 100px;
            height: 20px;
            float: right;
            background-color: #FF6D70;
            color: white;
        }

        .BTN {
            background-color: #FF6D70;
            width: 300px;
            height: 50px;
            font-size: 15pt;
            text-align: center;
            vertical-align: middle;
            color: white;
            border-radius: 50px;
            float: left;
        }

        div.gallery {
            margin: 5px;
            margin-left: 7px;
            border: 1px solid #bcbcbc;
            float: left;
            width: 185px;
            height: 185px;
        }

        div.gallery:hover {
            border: 1px solid #bcbcbc;
        }

        div.gallery img {
            width: 100%;
            height: auto;
        }

        a:link {
            color: black;
            text-decoration: none;
        }

        a:visited {
            color: black;
            text-decoration: none;
        }

        a:hover {
            color: black;
            text-decoration: none;
        }
    </style>
</head>

<body>
<div class="profile-container">
    <div class="profile-content" style="border-bottom-left-radius: 0px; border-bottom-right-radius: 0px;">
        <div class="profile-photoline">
            <img src="" class="profile-photo">
        </div>

        <div class="profile-box">
            <p style="text-align: center; font-size: 25pt;">${login.userNickName}</p>
            <input type="button" name="edit" value="프로필 편집" onclick="" class="profile-edit">
        </div>

        <div class="profile-introduce">
            ${login.userNickName}<br/><br/>
            카테고리 : ${login.category}<br/><br/>
            ${login.user.cateogory}<br/><br/>
        </div>
    </div>

    <div class="profile-sidebar">
        <div class="profile-sidebar2">
            <div>
                진행중인 공고 <input type="button" value="모두 보기" onclick="" class="show-all">
            </div>
            <br/>
            <br/>

            <div>
                <a href="https://www.naver.com" target="_blank">공고 1</a>
                <br/>
                <br/>
                <a href="https://www.naver.com" target="_blank">공고 2</a>
                <br/>
                <br/>
                <a href="https://www.naver.com" target="_blank">공고 3</a>
                <br/>
                <br/>
                <a href="https://www.naver.com" target="_blank">공고 4</a>
                <br/>
                <br/>
                <a href="https://www.naver.com" target="_blank">공고 5</a>
                <br/>
                <br/>
            </div>
        </div>
        <div class="profile-sidebar2">
            <div>
                아티스트 목록 <input type="button" value="모두 보기" onclick="" class="show-all">
            </div>
            <br/>
            <br/>

            <div>
                <a href="https://www.naver.com" target="_blank">아티스트 1</a>
                <br/>
                <br/>
                <a href="https://www.naver.com" target="_blank">아티스트 2</a>
                <br/>
                <br/>
                <a href="https://www.naver.com" target="_blank">아티스트 3</a>
                <br/>
                <br/>
                <a href="https://www.naver.com" target="_blank">아티스트 4</a>
                <br/>
                <br/>
                <a href="https://www.naver.com" target="_blank">아티스트 5</a>
                <br/>
                <br/>
            </div>
        </div>
    </div>

    <div class="profile-content" style="border-top-left-radius: 0px; border-top-right-radius: 0px;">
        <div style="height: 70px;">
            <input type="button" value="Upload" onclick="" class="BTN">
            <input type="button" value="Delete" onclick="" class="BTN">
        </div>

        <div class="gallery">
            <a target="_blank" href="">
                <img src="" alt="" width="600" height="400">
            </a>
        </div>

        <div class="gallery">
            <a target="_blank" href="">
                <img src="" alt="" width="600" height="400">
            </a>
        </div>

        <div class="gallery">
            <a target="_blank" href="">
                <img src="" alt="" width="600" height="400">
            </a>
        </div>

        <div class="gallery">
            <a target="_blank" href="">
                <img src="" alt="" width="600" height="400">
            </a>
        </div>
    </div>
</div>
</body>
</html>
