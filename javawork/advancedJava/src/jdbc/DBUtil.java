package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBMS�� �ڿ��� �׼����ϴ� ������ ����� ���ǵ� Ŭ����
// => DB����, ����̹��ε�, �ڿ��ݳ�, Ʈ�����ó��
public class DBUtil {
	//����̹��ε�
	//�ý��� ������ Ŭ������ ���Ǹ� �޸𸮿� �ε��ɶ� static{}���� �޼ҵ尡 �ڵ����� �ε�
	//=> �޼ҵ帶�� ����̹��ε��ϴ� �۾��� �������� �ʰ� Ŭ�����δ��� �۾�Ŭ������ �ε��Ҷ�
	//	 ��ü �ý��ۿ��� �� ���� ����ǵ��� �۾��ϱ� ���� static���ȿ� �ڵ带 �ۼ�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//Ŀ�ؼ��ϱ� - Ŀ�ؼ��� ��� DB���� �۾��� �Ҷ� ������ �ʿ��� ���
	//		    ��� DB���� �޼ҵ忡�� getConnect�� ȣ���ؼ� DBMS�� ������ �ϰ� �۾��� �ؾ� �ϱ� ������
	//          �� �޼ҵ带 ȣ���ϴ� ������ Ŀ�ؼǰ�ü�� �޾ƾ��Ѵ�. ���� �����ؾ� �Ѵ�.
	//          => ��û�� ������ DB�� �����ϰ� ���������� Ŀ�ؼǰ�ü�� ���� �����ϴ� �޼ҵ�
	public static Connection getConnect() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//�ڿ��ݳ� - ResultSet, Statement, Connection
	//=> �Ѳ����� ��� �ڿ��� �����ϵ��� �޼ҵ带 �ۼ��ص� ����, �ڿ� �ϳ��� �����ϴ� �޼ҵ带 ���� �����ص� ����.
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Ŀ�ؼ��� �ݳ��ϴ� �޼ҵ�
	public static void close(Connection con) {
		try {
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Statement�� �ݳ��ϴ� �޼ҵ�	
	//ResultSet�� �ݳ��ϴ� �޼ҵ�
	

	
}

	

