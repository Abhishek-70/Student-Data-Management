package SchoolDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
	System.out.println("go-post");
	
	String ob1 =(String) request.getAttribute("x1");
String ob2 = (String)request.getAttribute("x2");
String ob3 = (String)request.getAttribute("x3");
  PrintWriter pw = response.getWriter();
	pw.println(ob1);
	pw.println(ob2);
	pw.println(ob3);
	}

}
