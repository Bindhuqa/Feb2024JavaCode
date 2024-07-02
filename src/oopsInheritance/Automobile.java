package oopsInheritance;

public class Automobile extends Mechanical {
	@Override
	public void refuel() {
		System.out.println("Automobile-----refuel");
	}
	
	public void restart() {
		System.out.println("Automobile-----restart");
	}
	
	public void manual() {
		System.out.println("Automobile-----manual");
	}

}
