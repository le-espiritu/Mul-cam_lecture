package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class PreparedStatementUpdateTest {
	public static void main(String[] args) {
		/* PreparedStatementUpdateTest obj = new PreparedStatementUpdateTest(); */
			MemberDAO dao = new MemberDAO();
			Scanner key = new Scanner(System.in);
			System.out.print("���̵� : ");
			String id = key.next();
		
			System.out.print("�ּ� : ");
			String addr = key.next();
		
			dao.update(id, addr);
			
			
	}	
			public void update(String id,  String addr) {
				
			
			String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
			String user = "scott";
			String password = "tiger";
			String sql = "update member ";
			sql = sql+"set addr=? ";
			sql = sql+"where id=?";
			Connection con = null;
			PreparedStatement stmt = null;
			
			
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("����̹��ε�����!");
				
				con = DriverManager.getConnection(url,user,password);
				System.out.println("Ŀ�ؼǼ���!"+ con);
				
				stmt = con.prepareStatement(sql);	
				stmt.setString(1, addr);
				stmt.setString(2, id);

				System.out.println("Statement��ü �����Ϸ�" + stmt);
			
				int result = stmt.executeUpdate();
				System.out.println(result+"�� �� ���Լ���!");
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
