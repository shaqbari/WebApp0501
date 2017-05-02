//자바의 클래스 중, 오직 웹서버에서만 해석 및 실행될 수 있는 클래스를 가리켜 서블릿이라 한다.!!
/*서블릿 vs jsp
jsp가 곧 서블릿이다. 질문이 완전 잘못되었다.
예전 초창기 자바 분야에서 웹프로그래밍시엔 서블릿을 이용해왔었다.
하지만 서블릿은 순수 자바 클래스만을 이용하다 보니
디자인 코드 작성시 엄청나게 비효율적이었다. 이러한 문제를 해결하기 위해
html과 섞어쓸수 있는 가벼운 스크립트를 개발하게 되었는데, 그게 바로 jsp였다.
결론) 서블릿의 디자인 표현의 문제를 해결하기 위해 jsp가 출시된 것이다.

개발자가 jsp코드를 작성하면, 내부적으로 개발자의 편의를 위해 jsp는 survlet으로 자동변경이 일어난다.


*/

//서블릿은 브라우저에서 직접적으로 호출할수 없어 mapping을 해줘야 한다.

package com.ss.test;

//import java.util.List; //rt.jar에 있다.
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;//javaSE
import javax.servlet.ServletException;
import java.io.IOException;

//웹용클래스라 사용하는 서버에서 제공하는 클래스를 쓴다.
//톰캣에서는 servlet-api.jar이다., lib폴더에 넣고 classpath도 지정해줘야 한다.
//컴파일된 class파일은 항상 WEB-INF폴더의 classes에 만들어져야 하므로 editplus를 쓸때는 환경변수를 설정해줘야 한다.

public class MyServlet extends HttpServlet{
	//클라이언트가 브라우저로 접근시 해당 요청을 처리하는 메소드 정의	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			/*<!-- 서블릿은 브라우저에서 직접 호출이 불가하므로, 가상의 이름을 두고 간접호출해야 한다.
	이러한 서블릿 연결 방법을 서블릿 매핑(mapping)이라 한다. xml에서 진행하며 한글주석 달면 안된다.-->*/


		//현재 접속한 클라이언트와 연결된 문자 기반출력스트림 얻기!!
		PrintWriter out=response.getWriter();
		out.print("my servlet test is successful");
	}
	
}
