package builderpattern;

public class EcommerceTest {

	public static void main(String[] args) {
		
		Ecommerce e1 = new Ecommerce();
		e1.login("ravi", "ravi123")
		   .search("applepro")
		      .addtocart("applepro")
		         .payment("2345 5634 7823 3590", 234)
		            .orderid()
		              .logout();

	}

}
