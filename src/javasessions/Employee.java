package javasessions;

public class Employee {
	String name;
	int age;
	double salary;
	double totalsalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalemployees = 0;
		
		
		Employee e1 = new Employee();
		e1.name = "mahesh";
		e1.age = 30;
		e1.salary = 22.5;
		totalemployees++;
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);
		System.out.println("------------------------");
		
		
		Employee e2 = new Employee();
		e2.name = "pavan";
		e2.age = 35;
		e2.salary = 25.8;
		totalemployees++;
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
		System.out.println("------------------------");
		
		
		Employee e3 = new Employee();
		e3.name = "naresh";
		e3.age = 29;
		e3.salary = 18.5;
		e3.salary = 20.3;
		totalemployees++;
		System.out.println(e3.name+" "+e3.age+" "+e3.salary);
		System.out.println("------------------------");
		
		System.out.println("Total number of employees:"+" "+totalemployees);
		double totalsalary = e1.salary+e2.salary+e3.salary;
		System.out.println("Total salary of all employees:"+" "+totalsalary);
		
		System.out.println("------------------------");
		
		Employee e4 = new Employee();
		e4.name = "kumar";
		e4.age = 34;
		e4.salary = 20;
		totalemployees++;
		System.out.println(e4.name+" "+e4.age+" "+e4.salary);
		double finaltotalsalary = e1.salary+e2.salary+e3.salary+e4.salary;
		System.out.println("Total salary of all employees:"+" "+finaltotalsalary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
