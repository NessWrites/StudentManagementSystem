package controller.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DataBaseController;

@WebServlet(asyncSupported =true, urlPatterns = { "/LoginServlet" })

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DataBaseController dbController = new DataBaseController();

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws

			ServletException, IOException {
		String userName = request.getParameter("username");

		String password = request.getParameter("password");

		int loginResult = dbController.getStudentLoginInfo(userName, password);

		if (loginResult == 1) {
			// Successful login
			response.sendRedirect(request.getContextPath() + "/pages/welcome.html");

		} else if (loginResult == 0) {
			// Fill me in
		} else {
			// Fill me in
		}

	}
}
