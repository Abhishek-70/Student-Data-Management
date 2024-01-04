package SchoolDetails;

//import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SchoolDetailsBackend
 */
@WebServlet("/SchoolDetailsBackend")
public class SchoolDetailsBackend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SchoolDetailsBackend() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
System.out.println("from the get mrthod");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("post method");

	String s1=request.getParameter("school");
	String s2=request.getParameter("pata");
	String s3=request.getParameter("section");
	String s4=request.getParameter("presence");
	
	System.out.println(s1);
	System.out.println(s2);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root","test");
	Statement st= con.createStatement();
	st.executeUpdate("insert into FormDetails  values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
	st.close();
	con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	}

}
