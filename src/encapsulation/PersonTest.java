package encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("arthi");
		p1.setAge(28);
		p1.setGender("female");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getGender());
		
		System.out.println("------------");
		
		p1.printInfo(p1.getName(), p1.getAge(), p1.getGender());

	}

}
