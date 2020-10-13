package evaluations;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParametreServ
 */
@WebServlet("/ParametreServ")
public class ParametreServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Evaluation eval=new Evaluation();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParametreServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int poid=Integer.parseInt(request.getParameter("poid"));
		
		eval.setPoids(poid);
		response.getWriter().append("votre poid est "+poid+" qui est "+eval.evalpoids());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		int age=Integer.parseInt(request.getParameter("age"));
		Evaluation ev=new Evaluation(nom, prenom, age);
		response.getWriter().append(ev.evalage());
	
	}

}
