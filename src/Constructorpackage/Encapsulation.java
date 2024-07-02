package Constructorpackage;

public class Encapsulation {
	
	public void login() {
		System.out.println("logging in the account");
		search();
		click();
		addtocart();
		billing();
		
		
	}
	
	private void search() {
		System.out.println("searching the product");
	}
	
	private void click() {
		System.out.println("clicking the product");
	}
	
	private void addtocart() {
		System.out.println("adding the product to cart");
	}
	
	private void billing() {
		System.out.println("billing the product");
	}


}
