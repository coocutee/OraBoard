<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<script src="http://code.jquery.com/jquery-1.10.2.js"></script>

<div> 

<form id="FormObj" method="post"> 

<input type="hidden" name="bno" value="${boardVO.bno}"> 
<input type="hidden" name="page" value="${cri.page}"> 
<input type="hidden" name="perPageNum" value="${cri.perPageNum}"> 

제목 : ${boardVO.title}
<p>
글쓴이 : ${boardVO.nick}
<p>
내용 : ${boardVO.content}
</form>

</div>

<div class="btn">
<button type="submit" class ="btn_modify"> 수정  </button>
<button type="submit" class="btn_remove"> 삭제  </button>
<button type="submit" class="btn_list"> 목록  </button>
</div>

<script>

	$(document).ready(function(){
		
		//수정버튼 눌렀을때 이벤트 활성화
		$(".btn_modify").on("click",function(){
			$("#FormObj").attr("action","/board/modify");
			$("#FormObj").attr("method","get");
			$("#FormObj").submit();
			
		});
		
		//삭제버튼 이벤트
		$(".btn_remove").on("click",function(){
			$("#FormObj").attr("action","/board/remove");
			$("#FormObj").submit();
			
		});
		
		//목록버튼 이벤트
		$(".btn_list").on("click",function(){
			self.location = "/board/listPage";
		});
		
		
		
		
	});
	
	


</script>

</body>
</html>