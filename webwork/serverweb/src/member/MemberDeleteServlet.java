package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "memberDelete", urlPatterns = { "/member/delete.do" })
public class MemberDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("서블릿요청");
		//1. 사전작업
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =  response.getWriter();
		//2. 요청정보추출 - 클라이언트가 파라미터로 넘긴 id추출
		String id = request.getParameter("id");
		System.out.println(id);
		//3. 비지니스메소드호출
		MemberDAO dao = new MemberDAO();
		int result = dao.delete(id);
		
		//4. 결과처리
//		if(result>0) {
//			out.print("<h2>삭제성공!!</h2>");
//		}else {
//			out.print("<h2>삭제실패!!</h2>");
//		}
		//4. 결과로 새로운 서블릿을 요청하기 - 요청재지정(클라이언트에서 새롭게 요청하는 것과 동일한 작업)
		response.sendRedirect("/serverweb/member/list.do");
	}

}








