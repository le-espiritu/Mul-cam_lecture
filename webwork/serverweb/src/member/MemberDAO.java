package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	public int insert(MemberDTO user) {
		System.out.println("웹페이지에 사용자가 입력한 데이터:"+user); //user.toString()호출한 것과 동일
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;	
		int result = 0;
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPass());
			stmt.setString(3, user.getName());
			stmt.setString(4, user.getAddr());
			stmt.setString(5, user.getDeptno());
				
			result = stmt.executeUpdate();
			//System.out.println(result+"개 행 삽입성공~~~~~");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	//member테이블에 insert하기 - 회원가입기능
	public int insert(String id, String pass, String name, String addr, String deptno) {
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, id);
			stmt.setString(2, pass);
			stmt.setString(3, name);
			stmt.setString(4, addr);
			stmt.setString(5, deptno);
				
			result = stmt.executeUpdate();
			/* System.out.println(result+"개 행 삽입성공~~~~~"); */
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}

    //member테이블 update - 회원정보수정
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
			System.out.println("Statement객체 생성완료" + stmt);
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 수정성공~!~!~!~!");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,stmt,con);
		}	
	}
	//member테이블의 데이터를 삭제하는 메소드 - 회원탈퇴기능
	public int delete(String id) {
		System.out.println("dao의 delete메소드");
		StringBuffer sql = new StringBuffer();
		sql.append("delete from member ");
		sql.append("where id=? ");
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			System.out.println("커넥션성공!"+ con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			System.out.println("Statement객체 생성완료" + stmt);
			result =  stmt.executeUpdate();
			System.out.println(result+"개 행 삭제성공!!!~~!~~~!~##");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt,con);
		}
		return result;
	}
	//member테이블의 전체 레코드를 조회하는 메소드 - 회원목록조회
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
			System.out.println("조회성공 ~!~!~!!%#!@#");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
	}
	public ArrayList<MemberDTO> getMemberList() {
		System.out.println("dao의 메소드 호출");
		//전체 레코를 저장할 ArrayList 변수를 선언하기 - dto가 저장될 자료구조를 만들고 시작
		ArrayList<MemberDTO> userlist = new ArrayList<MemberDTO>();
		//레코드 한 개를 저장할 DTO변수 선언하기
		MemberDTO user = null; // 레코드를 조회할때마다 하나씩 생성해야 하므로 초기값은 null
		
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
				//1. 조회한 레코드를 이용해서 MemberDTO객체를 생성
				user = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5),rs.getString(6));
				//2. 생성된 MemberDTO객체를 ArrayList에 저장하기
				userlist.add(user);
			}	
			System.out.println("조회성공 ~!~!~!!%#!@#"+userlist.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return userlist;
	}
	public ArrayList<MemberDTO> search(String search) {
		System.out.println("dao의 search 호출:"+search);
		ArrayList<MemberDTO> userlist =	new ArrayList<MemberDTO>();
		MemberDTO user = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member where addr like ?");	
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, "%"+search+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {
				user = new MemberDTO(rs.getString(1),
						rs.getString(2), rs.getString(3), 
						rs.getString(4),
						rs.getInt(5),rs.getString(6));
				userlist.add(user);
			}
			//조회가 제대로 실행됐는지 체크하기 위해서 ArrayList에 저장된 요소의 갯수를 출력해보기
			System.out.println("dao=======>"+userlist.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return userlist;
	}
	//마이페이지 - 레코드가 한 개인 경우는 ArrayList에 저장하지 않고 DTO객체의 형태로 리턴한다.
	public MemberDTO read(String id) {
		MemberDTO user = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member where id = ?");	
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				user = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5),rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return user;
	}
}




















