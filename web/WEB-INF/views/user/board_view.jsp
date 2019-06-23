<%--
  Created by IntelliJ IDEA.
  User: seolhyeonjin
  Date: 2019-04-22
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>View</title>
    <style>
        .view {
            border: 2px solid;
            border-radius: 10px;
            width: 70%;
            margin: auto;
        }

        .list {
            border-right: 1px solid;
            border-bottom: 1px solid;
            text-align: center;
        }
    </style>
</head>
<body>
<div style="text-align: center; vertical-align: middle; position: relative; margin-top: 50px; margin-bottom: 50px;">
    <p style="text-align: center; font-weight: bold; font-size: 30pt;">
        Details
    </p>
</div>

<div>
    <table class="view">
        <tr style="height: 5px;">
            <td width="5"></td>
        </tr>
        <tr class="list">
            <td class="list" width="50">번호</td>
            <td class="list" width="80">카테고리</td>
            <td class="list" width="300">제목</td>
            <td class="list" width="70">작성자</td>
            <td class="list" width="140" style="border-right: 0px">작성일</td>
        </tr>
        <tr>
            <td class="list" colspan="2" rowspan="2">내용</td>
            <td colspan="3"></td>
        </tr>
        <tr class="list">
            <td colspan="3" style="border-right: 0px"><img src="" alt="" width="510" height="600"></td>
        </tr>
        <tr>
            <td colspan="5" style="border-top: 1px solid;"></td>
        </tr>
    </table>
</div>
</body>
</html>
