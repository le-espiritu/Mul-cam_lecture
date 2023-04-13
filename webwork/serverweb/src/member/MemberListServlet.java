package member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "memberList", urlPatterns = { "/member/list.do" })
public class MemberListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 사전작업
		request.setCharacterEncoding("UTF-8");
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> userlist = dao.getMemberList();
		request.setAttribute("userlist",userlist);
		
		RequestDispatcher rd =
		request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
	}
}

















