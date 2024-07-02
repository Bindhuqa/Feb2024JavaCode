package oopsInheritance;

public class Vehicle extends Automobile {
	
	@Override
	public void manual() {
		System.out.println("Vehicle----manual");
	}
	
	public void engine() {
		System.out.println("Vehicle----engine");
	}
	
	public void power() {
		System.out.println("Vehicle----power");
	}
	

}
