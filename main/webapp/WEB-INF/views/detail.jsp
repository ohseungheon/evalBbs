<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>detail page</h1>
   <hr>
   <table border="1">
    <thead>
        <td>번호</td>
        <td>제목</td>
        <td>내용</td>
        <td>작성자</td>
        <td>작성날짜</td>
    </thead>
    <tr>
        <td>${dto.bno}</td>
        <td>${dto.title}</td>
        <td>${dto.content}</td>
        <td>${dto.writer}</td>
        <td>${dto.regdate}</td>
    </tr>

    
        
    </table>
    <a href="delete?id=${dto.bno}">삭제</a>
    <a href="list">목록</a>
   

</body>
</html>