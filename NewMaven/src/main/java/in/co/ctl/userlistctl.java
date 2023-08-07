
package in.co.ctl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.Model.UserModel;



/**
 * Servlet implementation class userlistctl
 */
@WebServlet("/userlist")
public class userlistctl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userlistctl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	UserModel m=new UserModel();
	ArrayList list=new ArrayList();
	try {
		list=m.getlist();
		RequestDispatcher rd=request.getRequestDispatcher("userlistview.jsp");
		request.setAttribute("list", list);
		rd.forward(request,response);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	
	
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
