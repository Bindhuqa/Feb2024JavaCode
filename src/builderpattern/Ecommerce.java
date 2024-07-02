package builderpattern;

public class Ecommerce {
	
	public Ecommerce login() {
		System.out.println("user logged in");
		return this;
	}
	
	public  Ecommerce login(String username,String password) {
		System.out.println("logging the account with"+" "+username+" "+password);
		return this;
	}
	
	public Ecommerce search(String productname) {
		System.out.println("searching the product with"+" "+productname);
		return this;
	}
	public Ecommerce search(String productname,int price) {
		System.out.println("searching the product with"+" "+productname+" "+"and"+" "+price);
		return this;
	}
	
	public Ecommerce addtocart(String productname) {
		System.out.println("adding the product to the cart");
		return this;
	}
	
	public Ecommerce payment(String cc,int cvv) {
		System.out.println("payment in processing"+" "+"with"+" "+cc);
		return this;
	}
	
	public Ecommerce orderid() {
		System.out.println("checking the order id");
		return this;
		
	}
	
	public Ecommerce logout() {
		System.out.println("logging out the account");
		return this;
		
	}

}
