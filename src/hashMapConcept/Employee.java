package hashMapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		
		HashMap<String,String> employeemap = new HashMap<String,String>();
		
		employeemap.put("Arthi", "A+");
		employeemap.put("Ravi", "A+");
		employeemap.put("Naveev", "O");
		employeemap.put("Tom", "B");
		employeemap.put("Revanth", "C");
		
		System.out.println(employeemap);
		employeemap.put(null, null);
		System.out.println(employeemap);
//		employeemap.put("Ravi", null);
//		System.out.println(employeemap);
		

	}

}
