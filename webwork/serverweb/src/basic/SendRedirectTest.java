package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDTO;


@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 사전작업
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =  response.getWriter();
		
		System.out.println("sendRedirect연습 - Redirect서블릿");
		out.print("<h1>요청재지정연습-sendRedirect</h1>");
		
		//데이터공유하기
		MemberDTO user = new MemberDTO("jang", "장동건");
		request.setAttribute("mydata", user);
		
		//요청재지정 - sendRedirect
		response.sendRedirect("/serverweb/servletexam/resultPage.jsp");
	}

}
