package javasessions;

public class Student {
	
	String name;
	int age;
	char gender;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int	totalStudents = 0;
		
		Student st1 = new Student();
		st1.name = "bindhu";
		st1.age = 33;
		st1.gender = 'f';
		totalStudents++;
		
		st1.name = "sandya";
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.gender);
		System.out.println("Student 1:"+" "+st1.name+" "+st1.age+" "+st1.gender);
		
		System.out.println("----------------");
		
		Student st2 = new Student();
		st2.name = "mouni";
		st2.age = 31;
		st2.gender = 'f';
		totalStudents++;
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.gender);
		
		System.out.println("Total number of students:"+" "+totalStudents);
		
		Student st3 = new Student();
		st3.name = "ramya";
		st3.age = 30;
		st3.gender = 'f';
		totalStudents++;
		System.out.println(st3.name);
		System.out.println(st3.age);
		System.out.println(st3.gender);
		
		System.out.println("Total number of students:"+" "+totalStudents);
		
		
		


		

	}

}
