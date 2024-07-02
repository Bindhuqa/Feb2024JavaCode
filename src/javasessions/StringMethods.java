package javasessions;

import java.util.Arrays;

public class StringMethods {
	
	public int employee(String name,String find) {
		int index = (name.indexOf(find));
		return index;
	}

	public static void main(String[] args) {
		
		String data = "Hello Everyone";
		System.out.println(data.replace(" ", ""));
		
		String mg = "magnesium";
		System.out.println(mg.length());
		System.out.println(mg.charAt(0));
		System.out.println(mg.charAt(8));
		
		String text = "vidhun is a good boy";
		System.out.println(text.contains("boy"));
		
		
		StringBuilder sb = new StringBuilder("Bindhu");
		sb.reverse();
		System.out.println(sb);
		
		String name = "happybirthday";
		System.out.println(name.length());
		int mid = name.length()/2;
		System.out.println(mid);
		for(int i= name.length()/2;i<name.length();i++) {
		
			System.out.println(name.charAt(i));
			
		}
		
		String test = "welcome to naveen automation labs";
		System.out.println(test.indexOf('e'));//1
		System.out.println(test.indexOf('e', test.indexOf('e')+1));//2
		int third = test.indexOf('e', test.indexOf('e')+1);
		System.out.println(test.indexOf('e', third+1));
		
		StringMethods s1 = new StringMethods();
		
		int value = s1.employee("ravikiran","kiran");
		System.out.println(value);
		
		int value1 = s1.employee("ravikiran", "bindhu");
		System.out.println(value1);
		
		String statement = "iam learning java selenium from naveen";
		String s[] = statement.split(" ");
		System.out.println(Arrays.toString(s));
		
		String name1 = "tom";
		System.out.println(name1.charAt(1));
		
		

	}

}
