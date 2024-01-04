package SchoolDetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletone")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
      public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String s1=request.getParameter("name");
	String s2 = request.getParameter("address");
	String s3 = request.getParameter("license");
	request.setAttribute("x1",s1);
	request.setAttribute("x2", s2);
	request.setAttribute("x3", s3);
	
	RequestDispatcher rd=request.getRequestDispatcher("ServletTwo");
	rd.forward(request, response);
	System.out.println("it will Run.");
	
	}

}
