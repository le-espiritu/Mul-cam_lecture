package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//member���̺��� �׼����ϴ� ����� ���� �ִ� Ŭ����
//=> member���̺��� ���ؼ� �����ؾ� �ϴ� ��� ����� �޼ҵ�� ����
public class MemberDAO {
	//�Ű������� ����ڰ� �Է��� ���� ǥ���� DTO��ü�� �޵��� �ۼ�
	public void insert(MemberDTO user) {
		System.out.println("���������� ����ڰ� �Է��� ������:"+user); //user.toString()ȣ���� �Ͱ� ����
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;			
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPass());
			stmt.setString(3, user.getName());
			stmt.setString(4, user.getAddr());
			stmt.setString(5, user.getDeptno());
				
			int result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���~~~~~");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
	}
	//member���̺� insert�ϱ� - ȸ�����Ա��
	public void insert(String id, String pass, String name, String addr, String deptno) {
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;			
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, id);
			stmt.setString(2, pass);
			stmt.setString(3, name);
			stmt.setString(4, addr);
			stmt.setString(5, deptno);
				
			int result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���~~~~~");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
	}

    //member���̺� update - ȸ����������
	public void update(String id,  String addr) {
		
		
		String sql = "update member ";
		sql = sql+"set addr=? ";
		sql = sql+"where id=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);	
			stmt.setString(1, addr);
			stmt.setString(2, id);
			System.out.println("Statement��ü �����Ϸ�" + stmt);
			int result = stmt.executeUpdate();
			System.out.println(result+"�� �� ��������~!~!~!~!");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,stmt,con);
		}	
	}
	//member���̺��� �����͸� �����ϴ� �޼ҵ� - ȸ��Ż����
	public void delete(String id) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from member ");
		sql.append("where id=? ");
		Connection con = null;
		PreparedStatement stmt = null;
				
		
		try {
			con = DBUtil.getConnect();
			System.out.println("Ŀ�ؼǼ���!"+ con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			System.out.println("Statement��ü �����Ϸ�" + stmt);
			int result =  stmt.executeUpdate();
			System.out.println(result+"�� �� ��������!!!~~!~~~!~##");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt,con);
		}
	}
	//member���̺��� ��ü ���ڵ带 ��ȸ�ϴ� �޼ҵ� - ȸ�������ȸ
	public void select() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql.toString());
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString("pass")+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getInt(5)+"\t");
				System.out.println(rs.getString(6));
			}	
			System.out.println("��ȸ���� ~!~!~!!%#!@#");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
	}
	//DBMS���� ��ȸ�� ���̺��� ArrayList�� ��ȯ�ؼ� ����
	//select�� ����� �� �� �̻��� ���ڵ带 ���� �ִ� ���̺� - ArrayList<XXXDTO>
	//select�� ����� �� ���� ���ڵ带 ���� �ִ� ���̺� - XXXDTO
	public ArrayList<MemberDTO> getMemberList() {
		//��ü ���ڸ� ������ ArrayList ������ �����ϱ� - dto�� ����� �ڷᱸ���� ����� ����
		ArrayList<MemberDTO> userlist = new ArrayList<MemberDTO>();
		//���ڵ� �� ���� ������ DTO���� �����ϱ�
		MemberDTO user = null; // ���ڵ带 ��ȸ�Ҷ����� �ϳ��� �����ؾ� �ϹǷ� �ʱⰪ�� null
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql.toString());
			while(rs.next()) {
				//1. ��ȸ�� ���ڵ带 �̿��ؼ� MemberDTO��ü�� ����
				user = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5),rs.getString(6));
				//2. ������ MemberDTO��ü�� ArrayList�� �����ϱ�
				userlist.add(user);
			}	
			System.out.println("��ȸ���� ~!~!~!!%#!@#");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return userlist;
	}
}
