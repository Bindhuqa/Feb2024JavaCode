package javaInterviewQuestions;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		int a = 1100;
		int b = 700;
		int c = 300;
		if (a > b && a > c) {
			System.out.println("a is the greatest number");
		} else if (b > c) {
			System.out.println("b is the greatest number");
		} else {
			System.out.println("c is the greatest number");
		}

	}

}
