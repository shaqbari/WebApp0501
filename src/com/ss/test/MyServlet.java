//�ڹ��� Ŭ���� ��, ���� ������������ �ؼ� �� ����� �� �ִ� Ŭ������ ������ �����̶� �Ѵ�.!!
/*���� vs jsp
jsp�� �� �����̴�. ������ ���� �߸��Ǿ���.
���� ��â�� �ڹ� �о߿��� �����α׷��ֽÿ� ������ �̿��ؿԾ���.
������ ������ ���� �ڹ� Ŭ�������� �̿��ϴ� ����
������ �ڵ� �ۼ��� ��û���� ��ȿ�����̾���. �̷��� ������ �ذ��ϱ� ����
html�� ����� �ִ� ������ ��ũ��Ʈ�� �����ϰ� �Ǿ��µ�, �װ� �ٷ� jsp����.
���) ������ ������ ǥ���� ������ �ذ��ϱ� ���� jsp�� ��õ� ���̴�.

�����ڰ� jsp�ڵ带 �ۼ��ϸ�, ���������� �������� ���Ǹ� ���� jsp�� survlet���� �ڵ������� �Ͼ��.


*/

//������ ���������� ���������� ȣ���Ҽ� ���� mapping�� ����� �Ѵ�.

package com.ss.test;

//import java.util.List; //rt.jar�� �ִ�.
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;//javaSE
import javax.servlet.ServletException;
import java.io.IOException;

//����Ŭ������ ����ϴ� �������� �����ϴ� Ŭ������ ����.
//��Ĺ������ servlet-api.jar�̴�., lib������ �ְ� classpath�� ��������� �Ѵ�.
//�����ϵ� class������ �׻� WEB-INF������ classes�� ��������� �ϹǷ� editplus�� ������ ȯ�溯���� ��������� �Ѵ�.

public class MyServlet extends HttpServlet{
	//Ŭ���̾�Ʈ�� �������� ���ٽ� �ش� ��û�� ó���ϴ� �޼ҵ� ����	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			/*<!-- ������ ���������� ���� ȣ���� �Ұ��ϹǷ�, ������ �̸��� �ΰ� ����ȣ���ؾ� �Ѵ�.
	�̷��� ���� ���� ����� ���� ����(mapping)�̶� �Ѵ�. xml���� �����ϸ� �ѱ��ּ� �޸� �ȵȴ�.-->*/


		//���� ������ Ŭ���̾�Ʈ�� ����� ���� �����½�Ʈ�� ���!!
		PrintWriter out=response.getWriter();
		out.print("my servlet test is successful");
	}
	
}
