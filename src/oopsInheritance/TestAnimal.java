package oopsInheritance;

public class TestAnimal {

	public static void main(String[] args) {
		
		
		Dog d1 = new Dog();
		d1.bark();
		System.out.println("breed is"+" "+d1.breed);
		
		Eagle e1 = new Eagle();
		e1.hunt();
		System.out.println(e1.NestLocation);
		
		Snake s1 = new Snake();
		s1.crawl();
		s1.eat();
		s1.sleep();
		s1.strike();
		System.out.println(s1.scalepattern+" "+s1.venomous);
		
		Mammal m1 = new Dog();
		System.out.println("colour is"+" "+m1.furcolour);
		
		m1.eat();
		m1.sleep();
		m1.giveBirth();
		
		
	}

}
