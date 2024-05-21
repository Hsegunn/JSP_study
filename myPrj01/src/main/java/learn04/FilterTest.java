package learn04;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class FilterTest
 */
@WebFilter("/*")
public class FilterTest extends HttpFilter implements Filter {
       
    public FilterTest() {
        super();

    }

	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String ip = request.getRemoteAddr();
		System.out.println("Remote IP Address::: " + ip);
		
		chain.doFilter(request, response);
		
		// doFilter() 호출 이후에 처리코드
 		System.out.println("후 처리 코드 실행");
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
