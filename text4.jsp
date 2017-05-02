<%@page
	contentType="text/html; encoding=utf-8"

%>

<!doctype html>
<html>
<head>
<title>Document</title>
<meta charset="utf-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js">
	<!--자바스크립트와 같이 클라이언트의 브라우저에서 해석 및 실행되는 스크립트 언어를 가리켜
		클라이언트 스크립트라 하고, asp, php, jsp와 같이 오직 서버에서만 해석 및 실행될 수 있는 스크립트 언어를 가리켜
		서버 스크립트라 한다.
	-->
	
	
	function myFunc(){
		alert("사과");		
	}



</script>
<%
	myFunc();

%>



</head>
<body>

</body>
</html>
