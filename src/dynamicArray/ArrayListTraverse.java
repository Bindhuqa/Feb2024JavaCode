package dynamicArray;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTraverse {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(200);
		ar.add(700);
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		System.out.println(ar);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("--------------");
		
		for(Integer e:ar) {
			System.out.println(e);
		}
		
		Collections.sort(ar);
		System.out.println(ar);
		
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);
		
		ArrayList<String> empdata = new ArrayList<String>();
		empdata.add("naveen");
		empdata.add("jraveen");
		empdata.add("ravi");
		Collections.sort(empdata);
		System.out.println(empdata);
		
		Collections.swap(empdata, 0, 1);
		System.out.println(empdata);
		
		
		

	}

}
