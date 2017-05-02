
/*jsp가 출시되기 전에, 자바 개발자들이 사용해왔던 서블릿을 이용하여 table을 표현하는 코드를 작성해 본다.
이예제를 통해 서블릿이 얼마나 디자인을 표현하기에 불편한지 체험해 본다.

jsp와 서블릿은 각각 어디에 사용되는 것인가?
-주의) 서블릿이 불편하기 때문에 개발자 편의를 위해 개발된 기술이 jsp이다.
		따라서 jsp가 실행시 서블릿으로 변환된다. 즉 두개는 동일한 서블릿이다.

-jsp: 디자인 작업에 유리
-서블릿: 디자인 이외의 작업에 중요한 비중을 차지한다.

*/

package com.ss.test;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


public class TableServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//테이블을 출력하자.!!
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		out.print("<!doctype html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>테이블 구현하기</title>");
		out.print("<meta charset=\"utf-8\">");		
		out.print("</head>");
		out.print("<body>");
		out.print("<table border=\"1px\" width=\"400px\" align=\"center\">");
		for(int i=10; i>=1; i--){
			out.print("<tr>");
			out.print("<td>"+(i)+"01호</td>");
			out.print("<td>"+(i)+"02호</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		
	}
}
