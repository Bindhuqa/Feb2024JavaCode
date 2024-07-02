package dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDeclaration {

	public static void main(String[] args) {
		
		List<Integer> markslist = new ArrayList<Integer>();
		
		List<Integer> numlist =	Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(numlist);
		System.out.println(numlist.size());
//		numlist.add(7);
//		System.out.println(numlist);
		
		markslist.add(200);
		markslist.add(500);
		markslist.add(900);
		markslist.add(1100);
		markslist.add(800);
		
		System.out.println(markslist.size());
		System.out.println(markslist);
		markslist.remove(3);
		System.out.println(markslist);
		markslist.add(2, 600);
		System.out.println(markslist);
		System.out.println(markslist.size());
		
		ArrayList<Object> empdata = new ArrayList<Object>();
		empdata.add("tom");
		empdata.add(30);
		empdata.add('m');
		empdata.add(33.5);
		empdata.add(true);
		
		//empdata.add(0, "naveen");
		System.out.println(empdata);
		System.out.println(empdata.size());
		empdata.set(0, "naveen");
		System.out.println(empdata);
		

		
		
		

	}

}
