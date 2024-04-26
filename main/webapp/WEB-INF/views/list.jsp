<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>list page</h1>
    <table border="1">
    <thead>
        <td>번호</td>
        <td>제목</td>
        <td>내용</td>
        <td>작성자</td>
        <td>작성날짜</td>
    </thead>
    <c:forEach var="dto" items="${list}">
        <tr>
            <td>${dto.bno}</td>
<<<<<<< HEAD
            <td><a href="detail?title=${dto.title}">${dto.title}</a></td>
=======
            <td>${dto.title}</td>
>>>>>>> 63199a069a013e52a6a706871cc9578d706af47d
            <td>${dto.content}</td>
            <td>${dto.writer}</td>
            <td>${dto.regdate}</td>
        </tr>
    </c:forEach>
</table>
<<<<<<< HEAD
<a href="writeForm">글작성하기</a><br>
=======
>>>>>>> 63199a069a013e52a6a706871cc9578d706af47d
</body>
</html>