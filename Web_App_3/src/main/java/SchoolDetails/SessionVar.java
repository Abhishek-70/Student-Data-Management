package SchoolDetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servletOne")
public class SessionVar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionVar() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("from the Get Method");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String s1 = request.getParameter("name");
		String s2 = request.getParameter("Roll");
		request.setAttribute("x9", s1);
		request.setAttribute("x8", s2);
		RequestDispatcher rd = request.getRequestDispatcher("SessionTwo");
		rd.forward(request, response);

		HttpSession ses1 = request.getSession();
		ses1.setAttribute("x1", s1);
		ses1.setAttribute("x2", s2);
		System.out.println("from the post method");
	}

}
