package hashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String,String> empdata = new HashMap<String,String>();
		
		//Map<String,String> empdata = new LinkedHashMap<String,String>();
		//Map<String,String> empdata = new TreeMap<String,String>();
		
		empdata.put("peter", "QA");
		empdata.put("Naveen", "SDET");
		empdata.put("Ravi", "Dev");
		empdata.put("Arthi", "Trainer");
		
	System.out.println(empdata.get("Naveen"));
	System.out.println(empdata.get("Ravi"));
	
	System.out.println(empdata);
	
	for(Map.Entry<String, String> e:empdata.entrySet()) {
		System.out.println(e.getKey()+":"+e.getValue());
		
	}
	//iterating using lambda
	empdata.forEach((k,v)->System.out.println(k+":"+v));
	
	
	
	

	}

}
