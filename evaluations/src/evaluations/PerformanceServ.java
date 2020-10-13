package evaluations;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PerformanceServ
 */
@WebServlet("/PerformanceServ")
public class PerformanceServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Evaluation ev=new Evaluation();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PerformanceServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int vitesse=Integer.parseInt(request.getParameter("vitesse"));
		ev.setVitesse(vitesse);
		response.getWriter().append(ev.evalvitesse());

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		int rythme=Integer.parseInt(request.getParameter("rythme"));
		ev.setRythme(rythme);
		response.getWriter().append(ev.evalrythme());
		
	}

}
