package dynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("tom");
		ar.add("ravi");
		ar.add("naveen");
		ar.add("ektha");
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(90);
		
		ArrayList<Object> empdata = new ArrayList<Object>();
		empdata.add("tom");
		empdata.add(30);
		empdata.add('m');
		empdata.add(33.5);
		empdata.add(true);
		
		System.out.println(empdata.size());
		
		
		
		
		
		
		}

}
