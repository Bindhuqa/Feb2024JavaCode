package javasessions;

public class CompareMethods {
	
	public boolean compareStrings(String strg1,String strg2) {
		if (strg1==null&&strg2==null) {
			return true;
		}
		else if(strg1==null||strg2==null){
			return false;
		}
		boolean result = strg1.equals(strg2);
		return result;
	}
	
	public double calculateAverage(double numbers[]) {
		double sum =0.0;
		double average = sum/numbers.length;
		for(double e:numbers) {
			sum = sum+e;
			
			
		}
		return average;
	}

	public static void main(String[] args) {
		
		CompareMethods obj = new CompareMethods();
		
		
		boolean result = obj.compareStrings("naveen", "karthik");
		System.out.println(result);
		
		
		double numbers[]= {2,4,9.5,4.6};
		double avg = obj.calculateAverage(numbers);
		System.out.println(avg);
		
		

	}

}
