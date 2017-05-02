<%@page
	contentType="text/html;charset=utf-8"

%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>

<%!
	//멤버 변수 or 멤버 메소드 기재 영역=선언부
	//sun사가 지정한 폴더에 lib파일을 넣어야 한다.
	//새로운 jar가 들어오면 tomcat을 재가동해야한다.
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="bread";
	String pass="bread";
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

%>
<%
	/*jsp는 java의 문법을 따르므로, 스탠다드 시절에 사용했던 db연동기술인 jdbc코드는 동일하다.!*/

	//1.드라이버 로드
	Class.forName(driver);
	out.print("드라이버 로드 성공!!");

	//2.접속
	con=DriverManager.getConnection(url, user, pass);
	
	if(con!=null){
		out.print("접속 성공!");

		//상품테이블로 부터 상품명 가져와 출력하기!
		String sql="select product_name from product";
		pstmt=con.prepareStatement(sql);
		rs=pstmt.executeQuery();

		//System.out.println(); //표준 출력 스트림인 모니터에 출력된다(자바콘솔)
		System.out.println("난 어디에 찍히지?");
				
		//아래의 out은 접속한 브라우저와 관련된 출력스트림을 가리키므로, 유저의 브라우저에 출력된다.
		
		while(rs.next()){
			out.print(rs.getString("product_name"));
			out.print("<br>");
		}

	}

	

%>