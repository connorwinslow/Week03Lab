
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean numberInvalid;
        String errorMessage = "";
        String age = request.getParameter("age");
        int ageCalc = 0;
        request.setAttribute("age", age);
        try 
		{ 
			Integer.parseInt(age); 
			numberInvalid = false;
		}  
		catch (NumberFormatException e)  
		{ 
			numberInvalid = true;
		} 
        if(age == null || age.equals("")){
            errorMessage = "You must give your current age";
            request.setAttribute("errorMessage", errorMessage);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
          
        if(numberInvalid){
            errorMessage = "You must enter a number";
            request.setAttribute("errorMessage", errorMessage);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        else{
            ageCalc = ageCalc + Integer.parseInt(age) + 1;
            request.setAttribute("ageCalc", ageCalc);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    }
   }



