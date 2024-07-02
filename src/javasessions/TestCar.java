package javasessions;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCar c1 = new ConstructorCar("crv");
		System.out.println(c1.name);
		System.out.println(c1.liscencenumber);

		System.out.println("------------");

		ConstructorCar c2 = new ConstructorCar("camry", "toyota");
		System.out.println(c2.name + " " + c2.brand + " " + c2.price + " " + c2.liscencenumber + " " + c2.colour);

		System.out.println("------------");
		
		ConstructorCar c3 = new ConstructorCar("x6", "BMW", 40.5);
		System.out.println(c3.name + " " + c3.brand + " " + c3.price + " " + c3.liscencenumber + " " + c3.colour);
		
        System.out.println("------------");
		
		ConstructorCar c5 = new ConstructorCar("hrv", "honda", 15.6, "g2900","white");
		System.out.println(c5.name + " " + c5.brand + " " + c5.price + " " + c5.liscencenumber + " " + c5.colour);
		


	}

}
