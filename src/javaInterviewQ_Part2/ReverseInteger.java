package javaInterviewQ_Part2;

public class ReverseInteger {

	public static void main(String[] args) {
//using algorithm
		int num = 12363845;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reverse of integer  is " + rev);

		// using stringbuffer

		int num1 = 236862;
		String s = String.valueOf(num1);

		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

	}

}
