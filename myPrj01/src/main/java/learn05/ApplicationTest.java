package learn05;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApplicationTest
 */
@WebServlet("/applicationt")
public class ApplicationTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// application 저장소 생성
		//ServletContext application = request.getServletContext();
		// session 저장소 생성
		HttpSession session = request.getSession();
		
		String str = request.getParameter("data");
		
		// 확인
		System.out.println("data: " + str);
		
		// 저장
		session.setAttribute("data", str);
		
		// 꺼내기
		//str = (String)application.getAttribute("data");
		str = (String)session.getAttribute("data");
		
		System.out.println("Adata: " + str);
	}

}
