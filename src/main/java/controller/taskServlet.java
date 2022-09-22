package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Task;

/**
 * Servlet implementation class todoServlet
 */
@WebServlet("/taskServlet")
public class taskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public taskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			Task task = new Task();
			
			
			String userInput = request.getParameter("input");
			task.setName(userInput);
			
		    request.setAttribute("taskList", task);
		    
		
		    getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		    
		
	//	PrintWriter writer = response.getWriter();
	//	writer.println(userInput.toString());
	//	writer.close();
	}

}
