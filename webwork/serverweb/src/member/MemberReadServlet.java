package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "memberRead", urlPatterns = { "/member/read.do" })
public class MemberReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("서블릿요청");
		//1. 사전작업
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =  response.getWriter();
		//2. 요청정보추출 - 클라이언트가 파라미터로 넘긴 id추출
		String id = request.getParameter("id");
		//3. 비지니스메소드호출
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.read(id);
		
		//4. 데이터공유
		request.setAttribute("user", dto);
		
		//5. 요청재지정
		RequestDispatcher rd =
		request.getRequestDispatcher("/member/member_read.jsp");
		rd.forward(request, response);
	}

}








