package Constructorpackage;

public class EmpAssignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpAssign obj = new EmpAssign(2396,"rajesh",22.5);
		System.out.println("Employee name:"+" "+obj.name);
		System.out.println("Employee id:"+" "+obj.id);
		System.out.println("Employee salary:"+" "+obj.salary);
		
		System .out.println("--------------");
		
		obj.setSalary(25.6);
		System.out.println("Employee name:"+" "+obj.name);
		System.out.println("Employee id:"+" "+obj.id);
		System.out.println("Employee salary:"+" "+obj.salary);
		
		
		

	}

}
