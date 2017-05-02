<%@page
	contentType="text/html;charset=utf-8"
%>

<!doctype html>
<html>
<head>
<title>테이블 구현하기</title>
<meta charset="utf-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>




</head>
<body>
<!--jsp, asp, php등은 html과 섞어 쓸 수 있기 때문에 디자인 관련된 작업시 상당히 유용하다.-->

	<table border="1px" width="400px" align="center">
	<%for(int i=10; i>=1; i--){%>
		<tr>
			<td><%=i%>01호</td> <!-- 단축표현식으로 out.print(i);가 생략된것이다. ;를 붙이면 안된다.-->
			<td><%=i%>02호</td>
		</tr>
	<%}%>
	</table>
</body>
</html>
