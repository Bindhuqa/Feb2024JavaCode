package javaInterviewQuestions;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		//1234 = 4
		//123 = 3
		
		long num = 2368629139l;
		int count = 0;
		
		while(num!=0) {
			num=num/10;//123 12 1
			count++;//0 1 2 3 4 5----
			
		}
		System.out.println("Number of digits is " + count);

	}

}
