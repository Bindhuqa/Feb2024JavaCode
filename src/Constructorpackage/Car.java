package Constructorpackage;

public class Car {
	
	String make;
	String model;
	int year;
	
	public Car() {
		
	}
	
	public Car(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}
    public static void main(String[] args) {
		Car c1 = new Car();
		
		System.out.println("Car information:"+" "+c1.make+" "+c1.model+" "+c1.year);
		
		Car c2 = new Car("Honda","crv",2018);
		System.out.println("Car information:"+" "+c2.make+" "+c2.model+" "+c2.year);

	}

}
