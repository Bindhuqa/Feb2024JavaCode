package javaInterviewQuestions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("please give the number : ");
		int num = reader.nextInt();
		
		if (num%2==0) {
			System.out.println(num + " is the even number");
		}
		else {
			System.out.println(num + " is the odd number");
		}

	}

}
