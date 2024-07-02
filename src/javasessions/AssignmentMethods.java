package javasessions;

import java.awt.datatransfer.StringSelection;
import java.lang.reflect.Array;
import java.util.Arrays;

public class AssignmentMethods {
	
	public void HelloWorld() {
		System.out.println("HelloWorld");
	}
	
	public double add(double num1,double num2) {
		System.out.println("adding two numbers");
		double sum = num1+num2;
		return sum;
	}
	
	public boolean compare(String a,String b) {
		System.out.println("comparing two strings");
		if(a.trim().equalsIgnoreCase(b)){
		System.out.println("true");
		return true;}
		else {
			System.out.println("false");
			return false;
		}
		}
	
	 public double calculateAverage(double numbers[]) {
		 System.out.println("calculating average of numbers");
		 int length = Array.getLength(numbers);
		 double sum = 0;
		 for(int i=0;i<length;i++) {
			 sum = sum+numbers[i];
			 
		 }
		 double average = sum/length;
		 return average;
		 
	 }
	 
	 public String concatenateStrings(String[] strings) {
		 System.out.println("concatenating strings");
		 String joinedstring = String.join(" ", strings);
		 return joinedstring;
		  }
	 
	 public Object[] reverseArray(Object[] array) {
		 System.out.println("reversing the object array");
		 int length = array.length;
		 Object data[] = new Object[length];
		 int j=0;
		 System.out.println(Arrays.toString(array));
		 for(int i=4;i>=0;i--) {
			 data[j]= array[i];
			 j++;
			 System.out.println(i);
			  }
		 return data;
	 }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AssignmentMethods obj = new AssignmentMethods();
		obj.HelloWorld();
		
		double sum = obj.add(20, 35);
		System.out.println(sum);
		
		obj.compare("Login ", "login");
		
		double numbers[]= {12.9,6.9,52.9,44.1};
		double average = obj.calculateAverage(numbers);
		System.out.println(average);
		
		String strings[]= {"How","to","learn","java"};
		String joinedstring = obj.concatenateStrings(strings);
		System.out.println(joinedstring);
		
		Object array[]= {"ravi",30,26.7,'m',true};
		Object data[] = obj.reverseArray(array);
		System.out.println(Arrays.toString(data));
		
		
		

	}

}
