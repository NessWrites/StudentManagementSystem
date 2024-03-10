package controller.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DataBaseController;
import model.StudentModel;

@WebServlet(asyncSupported =true, urlPatterns = { "/RegisterServlet" })

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DataBaseController dbController  = new DataBaseController();
	
	public RegisterServlet()
	{
		super();
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	
			throws
	
			ServletException , IOException
	{
		String userName = request.getParameter("username");
		String firstname = request.getParameter("FirstName");
        String lastname = request.getParameter("LastName");
        String date = request.getParameter("Birthday");
        LocalDate dob = LocalDate.parse(date);
        String gender = request.getParameter("Gender");
        String email = request.getParameter("Email");
        String phoneNumberStr = request.getParameter("PhoneNumber"); 
        String subject = request.getParameter("Subject");
        String password = request.getParameter("password");
        String retypePassword = request.getParameter("retypePassword");
        
        StudentModel studentModel = new StudentModel(firstname, lastname, dob, gender, email,subject, phoneNumberStr, userName, password);
        
        int result = dbController.registerStudent(studentModel);
        
        if (result>0)
        {
        	response.sendRedirect(request.getContextPath() + "/pages/login.html");
        }
        else
        {
        	
        }
        
	}
}
