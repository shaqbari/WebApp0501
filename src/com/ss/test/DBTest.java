//�� Ŭ������ �� �����󿡼��� �ؼ� �� �����ϰ� ������̴�.

package com.ss.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;//http��������.
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest extends HttpServlet{
	//�� Ŭ���̾�Ʈ�� ��û�� ������ �޼ҵ� ����
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="bread";
	String password="bread";
	
	Connection con;
	PreparedStatement pstmt;	
	ResultSet rs;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		/*����) throw:���� �޼ҵ忡�� �߻��� ������ ó������ �ʰ�, �̸޼ҵ带 ȣ���� ȣ��ο� ���� ��ü�� �����ϴ� ���*/
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		//����� ���Ǵ� ��Ʈ���� �̿��Ͽ�, ���ڿ� ���
		PrintWriter out=response.getWriter();
		out.print("member���� �۵��Ѵ�.");

		String sql="select * from emp";
		out.print("�ߵǳ�?"+sql);
		
		try{
			Class.forName(driver);

			con=DriverManager.getConnection(url, user, password);
			if (con!=null)	{
				out.println("���Ӽ���");
			}

			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()){
			  out.print(rs.getString("ename"));
			}

		}catch(ClassNotFoundException e){
		
		}catch(SQLException e){
		
		}finally{
			if (pstmt!=null){				
				try{
					pstmt.close();				
				}catch(SQLException e){
				
				}				
			}
		}


	}
}
