<%@page
	contentType="text/html; encoding=utf-8"
%>

<%
	/*
	JSP란
	1.Java Server Page(자바 기반의 서버측에서 실행되는 스크립트 언어를 의미)
	2.문법 구성
		-지시영역(directive) : @문자를 기재하는 영역으로, 현재 페이지에 대한 설정정보를 작성할 수 있다.
									ex)인코딩 방식, 파일형식 html or xml등
		-선언부 : 멤버영역(멤버변수 및 멤버 메소드 작성)
		-스크립틀릿 : 로직을 작성할 수 있는 영역
		**jsp는 자바의 문법을 따른다.!
	*/
	for(int i=0; i<10; i++){
		out.print("this is my website<br>");// \n은 응용프로그램에서만 먹히고 여기서는 안먹힌다. html을 이용해야 한다.
	}
%>