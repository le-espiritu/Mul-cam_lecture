package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memberInsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//1. 사전작업
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//2. 클라이언트의 요청정보 추출하기
		//           ---------------
		//           클라이언트가 입력한 내용
		String deptno = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		
		//3. 비지니스메소드call
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		MemberDAO dao  = new MemberDAO();
		int result = dao.insert(user);
		
		//4. 결과만들기 - response페이지 만들기
//		PrintWriter out = response.getWriter();
//		if(result>=1) {
//			out.print("<h2>"+result+"개 행 삽입성공!!</h2>");
//		}else {
//			out.print("<h2>삽입실패</h2>");
//		}
		//4. 결과로 새로운 서블릿을 요청하기 - 요청재지정
		response.sendRedirect("/serverweb/member/list.do");
	}

}







