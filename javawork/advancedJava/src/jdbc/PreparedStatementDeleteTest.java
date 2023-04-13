package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementDeleteTest {
	public static void main(String[] args) {
			MemberDAO dao = new MemberDAO();
			Scanner key = new Scanner(System.in);
			System.out.println("������ id : ");
			String id = key.next();
			
			dao.delete(id);
			
	}
	
			public void delete(String id) {
		
			String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
			String user = "scott";
			String password = "tiger";
			StringBuffer sql = new StringBuffer();
			sql.append("delete from member ");
			sql.append("where id=? ");
			Connection con = null;
			PreparedStatement stmt = null;
					
			
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("����̹��ε�����!");
				
				con = DriverManager.getConnection(url,user,password);
				System.out.println("Ŀ�ؼǼ���!"+ con);
				
				stmt = con.prepareStatement(sql.toString());
				stmt.setString(1, id);
				System.out.println("Statement��ü �����Ϸ�" + stmt);
				
				int result =  stmt.executeUpdate();
				System.out.println(result+"�� �� ��������!");
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
