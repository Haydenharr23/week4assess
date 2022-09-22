package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Task;

/**
 * Servlet implementation class descriptionServlet
 */
@WebServlet("/descriptionServlet")
public class descriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public descriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Task userInput = new Task();
		userInput.setDescription(request.getParameter("userInput"));
		
		
		
	    request.setAttribute("taskList", userInput);
	    
	
	    getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	    
	}

}
