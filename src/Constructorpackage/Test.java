package Constructorpackage;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d[]= {"laptop","android","iphone","canon"};
		Customer obj = new Customer("Ravi", 35, d);
		String Ravidevices[]= obj.getDevicesInfo();
		System.out.println(Arrays.toString(Ravidevices));
		 int count = obj.getDevicesCount();
		 System.out.println(count);
		

	}

}
