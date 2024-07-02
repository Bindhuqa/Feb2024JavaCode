package oopsAbstract;

public class LoginPage extends Page{
	
	int timeout = 30;
	
	public LoginPage() {
		System.out.println("LoginPage----------default constructor");
	}
	public LoginPage(int a) {
		System.out.println("LoginPage one parameter constructor"+" "+a);
	}

	@Override
	public void title() {
		System.out.println("Loginpage-----------title");
		
	}

	@Override
	public void url() {
		System.out.println("Loginpage-----------url");	
		
	}
	
	public void doLogin(String username,String password) {
		System.out.println("user logged in with"+ username + password);
	}

}
