//이 클래스는 웹 서버상에서만 해석 및 실행하게 만들것이다.

package com.ss.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;//http가빠진다.
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest extends HttpServlet{
	//웹 클라이언트의 요청시 동작할 메소드 정의
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="bread";
	String password="bread";
	
	Connection con;
	PreparedStatement pstmt;	
	ResultSet rs;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		/*참고) throw:현재 메소드에서 발생된 에러를 처리하지 않고, 이메소드를 호출한 호출부에 예외 객체를 전달하는 기능*/
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		//응답시 사용되는 스트림을 이용하여, 문자열 출력
		PrintWriter out=response.getWriter();
		out.print("member서블릿 작동한다.");

		String sql="select * from emp";
		out.print("잘되나?"+sql);
		
		try{
			Class.forName(driver);

			con=DriverManager.getConnection(url, user, password);
			if (con!=null)	{
				out.println("접속성공");
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
