package oopsAbstract;

public abstract class Page {
	
	 static final int TIME_OUT = 20;
	
	public Page() {
		System.out.println("Page----------default constructor");
	}
	public Page(int a) {
		System.out.println("Page one parameter constructor"+a);
	}
	public abstract void title();
	public abstract void url();
	
	public void displayLogo() {
		System.out.println("page----------displaylogo");
	}
	
	public void getLoginInfo() {
		System.out.println("page----------getlogininfo");
		
	}
	
	private void billing() {
		System.out.println("Page--------billing");
	}
	
	public void getBillingInfo() {
		billing();
	}
	

}
