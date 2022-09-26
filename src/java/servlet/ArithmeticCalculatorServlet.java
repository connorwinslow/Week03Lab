
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = "---";
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean numberInvalidFirst;
        boolean numberInvalidSecond;
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String submit = request.getParameter("submit");
        String result = "";
        int calcResult;
        try 
		{ 
			Integer.parseInt(first); 
			numberInvalidFirst = false;
		}  
		catch (NumberFormatException e)  
		{ 
			numberInvalidFirst = true;
		} 
        try 
		{ 
			Integer.parseInt(second); 
			numberInvalidSecond = false;
		}  
		catch (NumberFormatException e)  
		{ 
			numberInvalidSecond = true;
		} 
        if(first == null || first.equals("") || second == null || second.equals("") || numberInvalidFirst || numberInvalidSecond){
            result = "invalid";
               request.setAttribute("result", result); 
            }
        else if (submit.equals("+")){
            calcResult =Integer.parseInt(first) + Integer.parseInt(second);
            result = calcResult + "";
            request.setAttribute("result", result);
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if (submit.equals("-")){
            calcResult =Integer.parseInt(first) - Integer.parseInt(second);
            result = calcResult + "";
            request.setAttribute("result", result);
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if(submit.equals("*")){
            calcResult =Integer.parseInt(first) * Integer.parseInt(second);
            result = calcResult + "";
            request.setAttribute("result", result);
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if(submit.equals("%")){
          calcResult =Integer.parseInt(first) % Integer.parseInt(second);
            result = calcResult + "";
            request.setAttribute("result", result);
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);  
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
