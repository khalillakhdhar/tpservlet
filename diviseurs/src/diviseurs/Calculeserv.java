package diviseurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculeserv
 */
@WebServlet("/Calculeserv")
public class Calculeserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculeserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int a=Integer.parseInt(request.getParameter("v1"));
		int b=Integer.parseInt(request.getParameter("v2"));
		Calculer c=new Calculer(a, b);
		response.getWriter().append("le ppcm de"+a+" et "+b+" est: "+c.ppcm());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int a=Integer.parseInt(request.getParameter("v1"));
		int b=Integer.parseInt(request.getParameter("v2"));
		Calculer c=new Calculer(a, b);
		response.getWriter().append("le pgcd entre"+a+" et "+b+" est: "+c.pgcd());
	}

}
