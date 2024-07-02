package oopsAbstract;

public class LoginTest {

	public static void main(String[] args) {
		
		 LoginPage p1 = new LoginPage(10);
		 p1.title();
		 p1.url();
		 p1.displayLogo();
		 p1.getLoginInfo();
		 p1.doLogin("bindhu","bindhu@2" );
		 
		 //topcasting
		 
		 Page p2 = new LoginPage();
		 p2.title();
		 p2.url();
		 p2.displayLogo();
		 p2.getLoginInfo();
		 
		 System.out.println(p1.timeout);
		// System.out.println(p2.timeout);
		 System.out.println(Page.TIME_OUT);
		 System.out.println(LoginPage.TIME_OUT);
		 
		 p1.getBillingInfo();
		 p2.getBillingInfo();
		 

	}

}
