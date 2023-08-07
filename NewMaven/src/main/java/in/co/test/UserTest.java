package in.co.test;

import in.co.Model.UserModel;
import in.co.bean.UserBean;

public class UserTest {
	public static void main(String[] args) throws Exception{
		testAdd();
		
	}

	private static void testAdd() throws Exception {
	UserBean bean=new UserBean();
	UserModel model = new UserModel();

	bean.setId(5);
	bean.setFname("dtgr");
	bean.setLname("dfhtf");
	bean.setGmailid("ctfy@gmail.com");
	bean.setGender("male");
	bean.setPassword("ddty");
	model.add(bean);
	System.out.println("done");
	}

}
