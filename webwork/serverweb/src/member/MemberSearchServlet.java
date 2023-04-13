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

@WebServlet(name = "memberSearch", urlPatterns = { "/member/search.do" })
public class MemberSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
						throws ServletException, IOException {
		doPost(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//1. 사전작업
		request.setCharacterEncoding("UTF-8");
		//2. 클라이언트의 요청정보 추출하기
		String action = request.getParameter("action");
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> userlist = null;
		//action에 저장된 값에 따라서 비지니스메소드를 다르게 호출
		if(action.equals("SEARCH")) {
			String addr = request.getParameter("search");
			userlist = dao.search(addr);
		}else {
			 userlist = dao.getMemberList();
		}
		
		//4. 데이터공유
		request.setAttribute("userlist",userlist);
		
		//5. 요청재지정
		RequestDispatcher rd = 
		request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
	}

}







