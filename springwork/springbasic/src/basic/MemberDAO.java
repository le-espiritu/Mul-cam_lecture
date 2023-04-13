package basic;
public class MemberDAO {
	public void add(MemberDTO user){
		System.out.println("회원가입");
	}
	public MemberDTO getUser(String id){
		System.out.println("회원정보조회");
		return null;
	}
}