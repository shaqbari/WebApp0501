
/*jsp�� ��õǱ� ����, �ڹ� �����ڵ��� ����ؿԴ� ������ �̿��Ͽ� table�� ǥ���ϴ� �ڵ带 �ۼ��� ����.
�̿����� ���� ������ �󸶳� �������� ǥ���ϱ⿡ �������� ü���� ����.

jsp�� ������ ���� ��� ���Ǵ� ���ΰ�?
-����) ������ �����ϱ� ������ ������ ���Ǹ� ���� ���ߵ� ����� jsp�̴�.
		���� jsp�� ����� �������� ��ȯ�ȴ�. �� �ΰ��� ������ �����̴�.

-jsp: ������ �۾��� ����
-����: ������ �̿��� �۾��� �߿��� ������ �����Ѵ�.

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
		
		//���̺��� �������.!!
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		out.print("<!doctype html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>���̺� �����ϱ�</title>");
		out.print("<meta charset=\"utf-8\">");		
		out.print("</head>");
		out.print("<body>");
		out.print("<table border=\"1px\" width=\"400px\" align=\"center\">");
		for(int i=10; i>=1; i--){
			out.print("<tr>");
			out.print("<td>"+(i)+"01ȣ</td>");
			out.print("<td>"+(i)+"02ȣ</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		
	}
}
