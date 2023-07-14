<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.onload = function(){
		getList();
	}


	function getList(){
		let bno = document.querySelector('#bno').value;
		
		fetch('/reply/list/' + bno)
		.then(response => response.json())
		.then(map => replyView(map));
	
	}
	
	function replyView(map){
		let list = map.list;

		
		// 콘솔창에 리스트 출력
		console.log(list);
		
		// div 초기화
		replyDiv.innerHTML = '';
		
		// 댓글 리스트로 부터 댓글을 하나씩 읽어와서 div에 출력
		list.forEach((reply, index)=>{
			// 답글을 DIV에 출력
			replyTable.innerHTML += 
				'<tr>          '
				+'	<td>'+ reply.bno +'</td>  '
				+'	<td>'+ reply.reply +'</td>  '
				+'	<td>'+ reply.replyer +'</td>  '
				+'	<td>'+ reply.updatedate +'</td>  '
				+'</tr>         ';
		});
	}
</script>



</head>
<body>
<h1>댓글 처리</h1>
<form>
	<input type="text" name="bno" id="bno" value ="136">
	<input type="submit" value="제출하기">
</form>
<table border = "1">
	<tr>
		<td>bno</td>
		<td>reply</td>
		<td>replyer</td>
		<td>등록일</td>
	</tr>
</table>

<table border="1" id="replyTable">
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	
</table>
</body>
</html>