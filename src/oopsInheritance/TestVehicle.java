package oopsInheritance;

public class TestVehicle {

	public static void main(String[] args) {
		
		VehicleAssign v1 = new VehicleAssign();
		
		v1.start();
		v1.accelerate();
		v1.stop();
		
		System.out.println(v1.brand);
		System.out.println(v1.model);
		System.out.println(v1.year);
		
		System.out.println("-------------");
		
		
		CarAssign c1 = new CarAssign();
		c1.playMusic();
		System.out.println(c1.brand);
		System.out.println(c1.model);
		System.out.println(c1.year);
		System.out.println(c1.numdoors);
		
		
		System.out.println("-------------");
		
		Motorcycle m1 = new Motorcycle();
		m1.wheelie();
		
		System.out.println(m1.brand);
		System.out.println(m1.model);
		System.out.println(m1.year);
		System.out.println(m1.enginetype);
		System.out.println("-------------");
		
		Truck t1 = new Truck();
		t1.loadCrago();
		System.out.println(t1.brand);
		System.out.println(t1.model);
		System.out.println(t1.year);
		System.out.println(t1.cargocapacity);
		
		System.out.println("-------------");
		
		VehicleAssign v2 = new CarAssign();
		v2.start();
		v2.accelerate();
		v2.stop();
		System.out.println(v2.model);
		
		
		
		
		

		
		
		


		

		
	}

}
