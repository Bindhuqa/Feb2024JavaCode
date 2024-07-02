package javaInterviewQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("before swaping");
		System.out.println("a :"+ a);
		System.out.println("b :"+ b);
		
		System.out.println("after swaping");
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a :"+ a);
		System.out.println("b :"+ b);
		

	}

}
