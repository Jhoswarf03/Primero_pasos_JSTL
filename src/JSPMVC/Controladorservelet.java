package JSPMVC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controladorservelet extends HttpServlet {  

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
		
	    out.println("TestServlet says hi jhoswar<br/>");
	    String  name = request.getParameter("name");
		String  pasword = request.getParameter("password");
	    LoginBean bean = new LoginBean();
	    bean.setName(name);
	    bean.setPassword(pasword);
	    request.setAttribute("bean", bean);
	    
	    boolean estatus = bean.validate();
	    if(estatus)
	    {
	    	RequestDispatcher rd = request.getRequestDispatcher("JSPMVCentrada-exitosa.jsp");
	    	rd.include(request, response);
	    }
	    else {
	    	RequestDispatcher rd = request.getRequestDispatcher("JSPMVCentrada-error.jsp");
	        rd.forward(request, response);
	    }
	}
	 @Override  
	protected void  doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException , IOException{
		doPost(req, resp);
		
	}
	
	
	
	
	
}

