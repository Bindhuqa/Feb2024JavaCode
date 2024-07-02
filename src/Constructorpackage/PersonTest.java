package Constructorpackage;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("Satish", 30, 'm', 5.7);

		System.out.println("name:" + " " + p1.name + " " + "age:" + " " + p1.age + " " + "gender:" + " " + p1.gender
				+ " " + "height:" + " " + p1.height);
		
		
		Person p2 = new Person("mahesh", 35, 'm', 6.2);
		
		System.out.println("name:" + " " + p2.name + " " + "age:" + " " + p2.age + " " + "gender:" + " " + p2.gender
				+ " " + "height:" + " " + p2.height);
		

	}

}
