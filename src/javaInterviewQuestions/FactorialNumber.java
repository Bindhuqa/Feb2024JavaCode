package javaInterviewQuestions;

public class FactorialNumber {
	
	public static void getnum(int num) {
        int product = 1;
		
		for(int i=num;i>=1;i--) {
			product = product*i;
		}
		System.out.println("Factorial of "+ num + " is " + product);

	}

	public static void main(String[] args) {
		
		//5!=5*4*3*2*1
		
		FactorialNumber.getnum(5);

	}

}
