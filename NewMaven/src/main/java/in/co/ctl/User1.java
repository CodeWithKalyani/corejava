package in.co.ctl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.Model.UserModel;
import in.co.bean.UserBean;

/**
 * Servlet implementation class User1
 */
@WebServlet("/user")
public class User1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		

			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String gmail = request.getParameter("gmailid");
			String gender = request.getParameter("gender");

			String password = request.getParameter("password");

			UserBean bean = new UserBean();
			bean.setFname(fname);
			bean.setLname(lname);
			bean.setGmailid(gmail);
			bean.setPassword(password);
			bean.setGender(gender);
			UserModel model = new UserModel();
            String op = request.getParameter("operation");
        	
        	try {
            if(op.equals("add")) {
            	
            	
			model.add(bean);
			System.out.println("data inserted");

            
			
            }  else if(op.equals("delete")){
           
            	model.delete(bean);
            	System.out.println("data deleted");
			 
           
            	
            	
			  }  else if(op.equals("update")) {
            	model.Update(bean);
            	System.out.println("data update");
            
            }
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
           
            		
            	
            	            	
            }        }
	
            
               