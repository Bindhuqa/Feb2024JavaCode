package javaInterviewQ_Part2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementPractise1 {

	public static void main(String[] args) {
		
		String names[]= {"ravi","naveen","aarthi","tom","naveen","karthik"};
		
		//using hashset
		
		Set<String> store = new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("duplicate element is "+name);
			}
		}
		
		//using hashmap
		
		Map<String,Integer> storemap = new HashMap<String,Integer>();
		for(String name:names) {
			Integer count = storemap.get(name);
			if(count==null) {
				storemap.put(name, 1);
			}
			else {
				storemap.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entryset =  storemap.entrySet();
		for(Entry<String,Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is "+entry.getKey());	
				
			}
		}

	}

}
