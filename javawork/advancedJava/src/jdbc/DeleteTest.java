package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//CRUD (CLRUD)
//C - insert, R - select, U - update, D - delete
//C - insert, L - select(전체목록조회), R - select(조건에 만족하는 정보 조회), U - update, D - delete
//모든 DB연동은 작업은 무조건 DB서버에 커넥션을 먼저 해야 한다.
public class DeleteTest {
	public static void main(String[] args) {
		
			String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
			String user = "scott";
			String password = "tiger";
			StringBuffer sql = new StringBuffer();
			sql.append("delete from member ");
			sql.append("where id='lee' ");
			Connection con = null;
			Statement stmt = null;
					
			
			try {
				//1. 드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버로딩성공!");
				//2. DB서버에 커넥션
				con = DriverManager.getConnection(url,user,password);
				System.out.println("커넥션성공!"+ con);
				//3. SQL을 실행하는 기능을 갖고 있는 객체 Statement생성
				//   => java.sql.Statement지만 내부적으로 맵핑되는 객체는 oracle제조사에서 만든 클래스 타입
				stmt = con.createStatement();
				System.out.println("Statement객체 생성완료" + stmt);
				//4. SQL실행 - toString메소드를 호출해서 StringBuffer를 String으로 변환
				int result = stmt.executeUpdate(sql.toString());
				System.out.println(result+"개 행 삭제성공!");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(stmt!=null) stmt.close();
					if(con!=null) con.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}