package in.co.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.Model.UserModel;
import in.co.bean.UserBean;

/**
 * Servlet implementation class loginctl
 */
@WebServlet("/login")
public class loginctl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginctl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session=request.getSession();
			RequestDispatcher rd=request.getRequestDispatcher("User.jsp");
			session.invalidate();
			rd.forward(request, response);
		
		}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("type/html");
		String gmailid= request.getParameter("gmail");
		String password = request.getParameter("password");
		UserBean bean = new UserBean();
		bean.setGmailid(gmailid);
		bean.setPassword(password);
		PrintWriter out=response.getWriter();
		UserModel m=new UserModel();
		HttpSession session=request.getSession();
		System.out.println("hi");
		try {
			bean=m.authenticate(bean.getGmailid(),bean.getPassword());
			System.out.println("hii");
			if(bean!=null) {
				
				RequestDispatcher r=request.getRequestDispatcher("welcome.jsp");
				session.setAttribute("user1",bean.getFname());
				r.forward(request, response);
			}else {
				RequestDispatcher r= request.getRequestDispatcher("login.jsp");
				request.setAttribute("error", "invalid gmailid and password");
				r.forward(request, response);
				}
		} catch(Exception e){
			e.printStackTrace();
			
		}
		
		
				
		
	}

}
