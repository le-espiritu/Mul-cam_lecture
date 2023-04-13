package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mypost", urlPatterns = { "/mypost.do" })
public class PostFormServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		//여러 개의 parameter명이 동일한 경우 추출하는 방법
		String[] item = request.getParameterValues("item");
		PrintWriter out =  response.getWriter();
		out.print("<h2>customer</h2>");
		out.print("<hr/>");
		out.print("<h2>아이디:"+userId+"</h2>");
		out.print("<h2>성명:"+userName+"</h2>");
		out.print("<h2>패스워드:"+passwd+"</h2>");
		out.print("<h2>성별:"+gender+"</h2>");
		out.print("<h2>job:"+job+"</h2>");
		out.print("<h2>Favorites :");
		for (int i = 0; i < item.length; i++) {
			out.print(item[i]+" ");
		}
		out.print("</h2>");
	}

}
