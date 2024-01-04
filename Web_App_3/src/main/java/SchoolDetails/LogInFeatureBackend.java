package SchoolDetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginFeatureBackend")
public class LogInFeatureBackend extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LogInFeatureBackend() {
        super();
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("user");
	String s2 = request.getParameter("pass");
	PrintWriter p1=response.getWriter();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindetails","root","test");
	Statement stm=con.createStatement();
	ResultSet res=stm.executeQuery("select* from logindata where email='"+s1+"' and Password='"+s2+"'");
	if(res.next()) {
		p1.print("Welcome");
			
	}else {
		p1.print("Invalid!");
	}
	
	} catch (Exception e) {
		// TODO: handle exception
	}

	}

}
