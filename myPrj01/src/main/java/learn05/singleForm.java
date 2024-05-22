package learn05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class singleForm
 */
@WebServlet("/singleform")
public class singleForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// ServletContext 저장소 생성
//		ServletContext singleForm = request.getServletContext();
//		
//		String num = request.getParameter("num");
//		String operator = request.getParameter("operator");
//		
//		System.out.println("num: " + num);
//		
//		if(!operator.equals("=")) {			// 저장소에 값을 저장
//			singleForm.setAttribute("setNum", num);
//			singleForm.setAttribute("setOperator", operator);
//			
////			String str = (String)singleForm.getAttribute("setNum");
////			System.out.println("저장된 Num: " + str);
//		}else {
//			String str = (String)singleForm.getAttribute("setNum");
//			String op = (String)singleForm.getAttribute("setOperator");
//			int n1 = Integer.parseInt(str);
//			int n2 = Integer.parseInt(num);
//			
//			System.out.println("n1: " + n1);
//			System.out.println("n2: " + n2);
//			
//			long result = 0;
//			switch(op) {
//			case "+":
//				result = n1+n2;
//				break;
//			case "-":
//				result = n1-n2;
//				break;
//			case "/":
//				result = n1/n2;
//				break;
//			case "*":
//				result = n1*n2;
//				break;
//			}
//			response.setContentType("text/html; charset=utf-8");
//			PrintWriter out = response.getWriter();
//			out.append("<html><body><h2>Attribute를 이용한 계산기</h2><hr>")
//			.append("계산결과:"+result+"</body></html>");
//		}
		
		// Session 저장소 생성
		HttpSession session = request.getSession();
		
		String num = request.getParameter("num");
		String operator = request.getParameter("operator");
		
		System.out.println("num: " + num);
		
		if(!operator.equals("=")) {			// 저장소에 값을 저장
			session.setAttribute("setNum", num);
			session.setAttribute("setOperator", operator);
			
			String str = (String)session.getAttribute("setNum");
			System.out.println("저장된 Num: " + str);
		}else {
			String str = (String)session.getAttribute("setNum");
			String op = (String)session.getAttribute("setOperator");
			int n1 = Integer.parseInt(str);
			int n2 = Integer.parseInt(num);
			
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
			
			long result = 0;
			switch(op) {
			case "+":
				result = n1+n2;
				break;
			case "-":
				result = n1-n2;
				break;
			case "/":
				result = n1/n2;
				break;
			case "*":
				result = n1*n2;
				break;
			}
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.append("<html><body><h2>Attribute를 이용한 계산기</h2><hr>")
			.append("계산결과:"+result+"</body></html>");
		}
		
	}
}
