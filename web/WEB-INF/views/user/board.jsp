<%--
  Created by IntelliJ IDEA.
  User: seolhyeonjin
  Date: 2019-04-17
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width-device-width">
    <title>Board</title>
    <style>
        .list {
            border: 1px solid;
            border-radius: 10px;
            text-align: center;
            background-color: #FF6D70;
            color: white;
            height: 30px;
        }

        .table1 {
            width: 80%;
            border: 0;
            margin: auto;
        }
    </style>
</head>
<body>
<%
    /*
            Class.forName("");
            String url = "";
            String id = "";
            String pass = "";
            int total = 0;

            try {
                Connection conn = DriverManager.getConnection(url,id,pass);
                Statement stmt = conn.createStatement();

                String sqlCount = "SELECT COUNT(*) FROM board";
                ResultSet rs = stmt.executeQuery(sqlCount);

                if(rs.next()){
                    total = rs.getInt(1);
                }
                rs.close();

                String sqlList = "SELECT NUM, USERNAME, TITLE, TIME, HIT from board order by NUM DESC";
                rs = stmt.executeQuery(sqlList);*/

%>


<div style="text-align: center; vertical-align: middle; position: relative; margin-top: 50px; margin-bottom: 50px;">
    <p style="text-align: center; font-weight: bold; font-size: 30pt;">
        진행중인 공고
    </p>
</div>

<table class="table1">
    <tr style="height: 5px;">
        <td width="5"></td>
    </tr>
    <tr class="list">
        <td width="50" style="border-bottom-left-radius: 20px; border-top-left-radius: 20px;">번호</td>
        <td width="80">카테고리</td>
        <td width="300">제목</td>
        <td width="70">작성자</td>
        <td width="140">작성일</td>
        <td width="60" style="border-bottom-right-radius: 20px; border-top-right-radius: 20px;">하트</td>
    </tr>
    <%
        //if(total==0) {
    %>
    <tr align="center" bgcolor="#FFFFFF" style="height: 30px;">
        <td colspan="6">등록된 글이 없습니다.</td>
    </tr>
    <%
        /*
                } else {
                    나중에 수정할 부분1
                    while(rs.next()) {
                        int idx = rs.getInt(1);
                        String name = rs.getString(2);
                        String title = rs.getString(3);
                        String time = rs.getString(4);
                        int hit = rs.getInt(5);

               */
    %>
    <!-- 나중에 수정할 부분2
        <tr height="25" align="center">
            <td>&nbsp;</td>
            <td><%//=idx %></td>
            <td align="left"><%//=title %></td>
            <td align="center"><//%=name %></td>
            <td align="center"><//%=time %></td>
            <td align="center"><//%=hit %></td>
            <td>&nbsp;</td>
        </tr>
        <tr height="1" bgcolor="#D2D2D2"><td colspan="6"></td></tr>
        -->
    <%
        /*
                            }
                        }
                        rs.close();
                        stmt.close();
                        conn.close();
                    } catch(SQLException e) {
                        out.println( e.toString() );
                    }*/
    %>
    <tr style="height: 1px;" bgcolor="#D2D2D2">
        <td colspan="6"></td>
    </tr>
</table>
</body>
</html>