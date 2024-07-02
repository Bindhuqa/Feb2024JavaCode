package javasessions;

import java.util.Arrays;

public class StringAssignments {

	public static void main(String[] args) {
		String a = "Naveen";
		String b = "Naveen";
		
		if(a.equals(b)) {
			System.out.println(a+" " + "and" +" "+  b +" "+"are same values");
		}
		else {
			System.out.println(a+" " + "and" +" "+  b +" "+"are  not same values");
		}
		
		String a1 = "Naveen";
		String b1 = "naveen";
		
		if(a1.toLowerCase().trim().equals(b1)) {
			System.out.println(a1+" " + "and" +" "+  b1 +" "+"are same values");
		}
		else {
			System.out.println(a1+" " + "and" +" "+  b1 +" "+"are  not same values");
		}
		
		String Test = "this is my java code and i am so happy";
		System.out.println(Test.length());
		System.out.println(Test.charAt(0));
		System.out.println("Hi=" +(Test.length()-1));
		System.out.println(Test.charAt(37));
		//System.out.println(Test.charAt(-1));
		
		System.out.println(Test.indexOf('s'));//1st occurence of s
		System.out.println(Test.indexOf('s', Test.indexOf('s')+1));//2nd occ of s
		int p = Test.indexOf('s', Test.indexOf('s')+1);
		System.out.println(Test.indexOf('s', p+1));
		
		System.out.println(Test.indexOf("java"));
		System.out.println(Test.indexOf("happy"));
		
		String msg = "welcome admin";
		if(msg.indexOf("admin")==8) {
			System.out.println("admin is found");
          }
		else {
			System.out.println("admin is not found");
		}
		
		String test = "naveen automation";
		System.out.println(test.toUpperCase());
		String pop = "NAVEEN AUTOMATION LABS";
		System.out.println(pop.toLowerCase());
		
		//trim()
		String unit = "  test automation ";
		System.out.println(unit.trim());
		
		//replace
		String dob = "14-02-2015";
		System.out.println(dob.replace('-', '/'));
		
		String text = "i am loving testing";
		System.out.println(text.replaceAll("loving", "enjoying"));
		
		System.out.println("automation".replaceAll("a", "p"));
		
		String mesg = "welcome admin";
		System.out.println(mesg.contains("admin"));
		
		//split
		String data = "java_python_ruby_postman";
		String d[] = data.split("_");
		System.out.println(Arrays.toString(d));
		
		String name1 = "my;name;is;vidhun";
		String n[] = name1.split(";");
		System.out.println(Arrays.toString(n));
		
		String rest = "automation | selenium | cypress | postman";
		String r[] = rest.split("\\|");
		System.out.println(Arrays.toString(r));
		System.out.println(r[0]);
		System.out.println(r[2]);
		
		String word = "i love 'java' coding";
		System.out.println(word);
		
		
		String word2 = "i love \"java\" coding";
		System.out.println(word2);
		


		


	}

}
