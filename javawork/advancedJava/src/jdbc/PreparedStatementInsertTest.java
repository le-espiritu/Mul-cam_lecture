package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class PreparedStatementInsertTest {
	public static void main(String[] args) {
		/* PreparedStatementInsertTest obj = new PreparedStatementInsertTest(); */
		MemberDAO dao = new MemberDAO();
		Scanner key = new Scanner(System.in);
		System.out.print("���̵� : ");
		String id = key.next();
		System.out.print("�н����� : ");
		String pass = key.next();
		System.out.print("���� : ");
		String name = key.next();
		System.out.print("�ּ� : ");
		String addr = key.next();
		System.out.print("�μ���ȣ : ");
		String deptno = key.next();
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		dao.insert(user);
		/* dao.insert(id, pass, name, addr, deptno); */
			
	}
	public void insert(String id, String pass, String name, String addr, String deptno) {
		String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
		String user = "scott";
		String password = "tiger";
		//SQL���� ���� - �ܺο��� �Է¹��� �κ��� ?�� ó�� (?�� �ٸ� ���� ������ �� ����.)
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;	
			
		
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����!");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Ŀ�ؼǼ���!"+ con);
			
			//PreparedStatement ����
			stmt = con.prepareStatement(sql);
			//?�� ���� ���� �����ϱ�
			stmt.setString(1, id);
			stmt.setString(2, pass);
			stmt.setString(3, name);
			stmt.setString(4, addr);
			stmt.setString(5, deptno);
			//sql���� ���� - �Ű������� ���� executeUpdateȣ��
			
			int result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���!");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			}try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}


