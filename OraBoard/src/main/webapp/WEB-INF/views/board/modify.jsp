<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1> 수정페이지 </h1>



<form id="modify" method="post"> 

닉네임 : ${boardVO.nick}
<div class="mod">  

<p>
제목 : <input type="text" name="title" value="${boardVO.title}" placeholder="${boardVO.title}">
<p> 
내용 : <input type="text" name="content" value="${boardVO.content}" placeholder="${boardVO.content}" > 

</div>

<button type="submit"> 수정하기 </button>

</form>

</body>
</html>