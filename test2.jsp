<%@ page
	contentType="text/html;charset=utf-8"
%>
<%! 
	/*느낌표를 붙인 코드 영역을 가리켜 선어부라 하며
		멤버변수 및 메소드를 기재할 수 있는 영역이다.
	*/
	int a=3;
	public int myMethod(){
		return a;
	}

%>
<%
	/*
		@영역과 같이 현재 페이지에 대한 설정 정보를 작성하는 영역을 가리켜
		지시영역이라 하며, page와 같은 키워드를 지시어라 한다.
	*/

	int result=myMethod();
	//out객체는 지금 접속한 클라이언트와 연결된 문자기반의 출력스트림을 이용하여 출력을 수행
	out.print(result);
%>
<!--아래의 html 클라이언트측에 전달되어 브라우저에서 표현되고 실행된다.-->
<!doctype html>
<html>
<head>
<title>Document</title>
<meta charset="utf-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

</head>
<body>
	<%
		//jsp의 3가지 문법기재 영역 중 이영역을 스크립트를 작성하는 영역이라 해서
		//스크립틀릿 영역이라 한다. 개발자는 이 영역에 로직을 작성한다.
		for (int i=0; i<10; i++){
			out.print(i+"<br>");
		}
	%>
</body>
</html>
