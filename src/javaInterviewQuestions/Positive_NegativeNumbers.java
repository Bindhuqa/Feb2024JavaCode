package javaInterviewQuestions;

public class Positive_NegativeNumbers {

	public static void main(String[] args) {
		
		double number = -5.98;
		
		if(number>0) {
			System.out.println(number + " is a positive number");
		}
		else if(number<0) {
			System.out.println(number + " is a negative number");
		}
		else {
			System.out.println(number + " is a zero");
		}

	}

}
