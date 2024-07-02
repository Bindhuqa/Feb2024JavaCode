package Constructorpackage;

public class Employee {
	
	String name;
	int age;
	
	public static  void details(Employee d1) {
	System.out.println("Employee details");
	System.out.println(d1.name);
	System.out.println(d1.age);
		
	}
    public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "rahul";
		e1.age = 30;
		
		Employee.details(e1);
		
		
		Employee e2 = new Employee();
		e2.name = "mahesh";
		e2.age = 18;
		Employee.details(e2);
		
		

	}

}
