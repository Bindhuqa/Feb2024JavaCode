package javasessions;

public class User {
	
	String name;
	int age;
	String city;
	double salary;

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "bindhu";
		u1.age = 33;
		u1.city = "hyderabad";
		u1.salary = 12.33;
		
		User u2 = new User();
		u2.name = "mouni";
		u2.age = 31;
		u2.city = "langley";
		u2.salary = 30.2;
		
		User u3 = new User();
		u3.name = "ravi";
		u3.age = 40;
		u3.city = "burnaby";
		u3.salary = 25.8;
		
		User u4 = new User();
		u4.name = "siva";
		u4.age = 34;
		u4.city = "vancouver";
		u4.salary = 40.1;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city+" "+u1.salary);
		System.out.println(u2.name+" "+u2.age+" "+u2.city+" "+u2.salary);
		System.out.println(u3.name+" "+u3.age+" "+u3.city+" "+u3.salary);
		System.out.println(u4.name+" "+u4.age+" "+u4.city+" "+u4.salary);
		
		System.out.println("-------------");
		
		u1 = u2;
		System.out.println(u1.name+" "+u1.age+" "+u1.city+" "+u1.salary);
		System.out.println(u2.name+" "+u2.age+" "+u2.city+" "+u2.salary);
		System.out.println(u3.name+" "+u3.age+" "+u3.city+" "+u3.salary);
		System.out.println(u4.name+" "+u4.age+" "+u4.city+" "+u4.salary);
		
        System.out.println("-------------");
		
		u2 = u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city+" "+u1.salary);
		System.out.println(u2.name+" "+u2.age+" "+u2.city+" "+u2.salary);
		System.out.println(u3.name+" "+u3.age+" "+u3.city+" "+u3.salary);
		System.out.println(u4.name+" "+u4.age+" "+u4.city+" "+u4.salary);
		
        System.out.println("-------------");
		
		u3 = u4;
		System.out.println(u1.name+" "+u1.age+" "+u1.city+" "+u1.salary);
		System.out.println(u2.name+" "+u2.age+" "+u2.city+" "+u2.salary);
		System.out.println(u3.name+" "+u3.age+" "+u3.city+" "+u3.salary);
		System.out.println(u4.name+" "+u4.age+" "+u4.city+" "+u4.salary);
		
        System.out.println("-------------");
		
		u4 = u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city+" "+u1.salary);
		System.out.println(u2.name+" "+u2.age+" "+u2.city+" "+u2.salary);
		System.out.println(u3.name+" "+u3.age+" "+u3.city+" "+u3.salary);
		System.out.println(u4.name+" "+u4.age+" "+u4.city+" "+u4.salary);
		
        System.out.println("-------------");
		
		u4 = u2;
		System.out.println(u1.name+" "+u1.age+" "+u1.city+" "+u1.salary);
		System.out.println(u2.name+" "+u2.age+" "+u2.city+" "+u2.salary);
		System.out.println(u3.name+" "+u3.age+" "+u3.city+" "+u3.salary);
		System.out.println(u4.name+" "+u4.age+" "+u4.city+" "+u4.salary);
		
        System.out.println("-------------");
		
		u1 = u2 = u3 = u4;
		System.out.println(u1.name+" "+u1.age+" "+u1.city+" "+u1.salary);
		System.out.println(u2.name+" "+u2.age+" "+u2.city+" "+u2.salary);
		System.out.println(u3.name+" "+u3.age+" "+u3.city+" "+u3.salary);
		System.out.println(u4.name+" "+u4.age+" "+u4.city+" "+u4.salary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
