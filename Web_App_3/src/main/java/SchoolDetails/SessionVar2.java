package SchoolDetails;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTwo")
public class SessionVar2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionVar2() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String a1 = (String)request.getAttribute("x9");
		String a2 = (String)request.getAttribute("x8");
		System.out.println(a1);
		System.out.println(a2);
		HttpSession sess = request.getSession();
		String name = (String) sess.getAttribute("x1");
		String RollNo = (String) sess.getAttribute("x2");
		System.out.println(name);
		System.out.println(RollNo);
		System.out.println("from the Get method of servlet two");
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String a1 = (String)request.getAttribute("x9");
		String a2 = (String)request.getAttribute("x8");
		System.out.println(a1);
		System.out.println(a2);
		HttpSession sess = request.getSession();
		String name = (String) sess.getAttribute("x1");
		String RollNo = (String) sess.getAttribute("x2");
		System.out.println(name);
		System.out.println(RollNo);
		System.out.println("from the post method of servlet two");

	}

}
