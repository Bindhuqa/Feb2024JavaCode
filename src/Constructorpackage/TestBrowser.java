package Constructorpackage;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Browser.get();
       Browser.close();
       
       
       Worker w1 = new Worker();
       w1.setName("arthi");
       w1.setAge(30);
       w1.setSalary(25.5);
       w1.setIsactive(true);
       
      System.out.println(w1.getName());
      System.out.println(w1.getAge());
      System.out.println(w1.getSalary());
      System.out.println(w1.isIsactive());
	}

}
