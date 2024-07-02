package dataconversions;

public class StringReverseTest {
	
	public static String reversestring(String value) {
		
		if(value==null) {
			return null;
		}
		
		if(value.isBlank()||value.isEmpty()) {
			return value;
		}
		int length = value.length();
		if(length==1) {
			return value;
		}
		String rev = "";
		
		for(int i=length-1;i>=0;i--) {
			rev = rev + value.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		
	System.out.println(StringReverseTest.reversestring("testing"));
	System.out.println(StringReverseTest.reversestring("testing automation"));
	System.out.println(StringReverseTest.reversestring("t"));
	System.out.println(StringReverseTest.reversestring(""));
	System.out.println(StringReverseTest.reversestring(null));
	System.out.println(StringReverseTest.reversestring("1234"));
		

	}

}
