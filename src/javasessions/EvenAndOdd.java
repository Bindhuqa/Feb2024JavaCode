package javasessions;

public class EvenAndOdd {
	
	public boolean numbers(int a) {
		if(a%2==0) {
		System.out.println("a is the even number");}
		else {
			System.out.println("a is the odd number");	
		}
		return true;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenAndOdd e1 = new EvenAndOdd();
		e1.numbers(25);

	}

}
