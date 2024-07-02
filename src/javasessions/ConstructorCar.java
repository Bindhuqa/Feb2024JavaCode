package javasessions;

public class ConstructorCar {
	
	String name;
	String brand;
	double price;
	String liscencenumber;
	String colour;
	
	public ConstructorCar(String name) {
		
		this.name = name;
	}

	public ConstructorCar(String name, String brand) {
		
		this.name = name;
		this.brand = brand;
	}

	public ConstructorCar(String name, String brand, double price) {
		
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public ConstructorCar(String name, String brand, double price, String liscencenumber) {
		
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.liscencenumber = liscencenumber;
	}

	public ConstructorCar(String name, String brand, double price, String liscencenumber, String colour) {
	
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.liscencenumber = liscencenumber;
		this.colour = colour;
	}
	
	
}
