package javaInterviewQ_Part2;

public class ReverseString {

	public static void main(String[] args) {
		
		//String is immutable where as StringBuffer is mutable
		//String has no reverse function where as sb has reverse function
		
		String s = "selenium";
		int length = s.length();
		//System.out.println(length);
		
		String reverse = "";
		
		for(int i=length-1;i>=0;i--) {
			reverse = reverse+s.charAt(i);
			
		}
		System.out.println(reverse);
		
		//stringBuffer
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		

	}

}
