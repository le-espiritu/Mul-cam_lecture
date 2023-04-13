package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class PreparedStatementSelectTest {
	public static void main(String[] args) {
		/* PreparedStatementSelectTest obj = new PreparedStatementSelectTest(); */
			MemberDAO dao = new MemberDAO();
			Scanner key = new Scanner(System.in);
			System.out.println();
			
			//dao.select();
			ArrayList<MemberDTO> userlist =  dao.getMemberList();
			for(int i = 0;i<userlist.size();i++) {
				MemberDTO user = userlist.get(i);
				System.out.print(user.getId()+",");
				System.out.print(user.getPass()+",");
				System.out.print(user.getName()+",");
				System.out.print(user.getAddr()+",");
				System.out.print(user.getPoint()+",");
				System.out.println(user.getDeptno());
			}
	}
	public void select() {
			System.out.println("");
		 	String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
			String user = "scott";
			String password = "tiger";
			StringBuffer sql = new StringBuffer();
			sql.append("select * from member");	
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("����̹��ε�����!");
				
				con = DriverManager.getConnection(url,user,password);
				System.out.println("Ŀ�ؼǼ���!"+ con);
				
				stmt = con.createStatement();
				
				rs = stmt.executeQuery(sql.toString());
				System.out.println("��ȸ����-"+rs);
			
				
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString("pass")+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getInt(5)+"\t");
					System.out.println(rs.getString(6));
				}	
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs!=null) rs.close();
					if(stmt!=null) stmt.close();
					if(con!=null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}