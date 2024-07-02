package javasessions;

public class Greatest_Num {
	public int max(int a,int b,int c) {
		System.out.println("maximum value out of three has");
		if (a>=b&&a>=c) {
		System.out.println("a is the greatest value");
		}
		else if(b>=c&&b>=a){
		System.out.println("b is the greatest value");}
		else {
		System.out.println("c is the greatest value");	
		}
	return a;
	}
	
	public int min(int a,int b,int c) {
		System.out.println("minimum value out of three has");
		if (a<=b&&a<=c) {
		System.out.println("a is the lowest value");
		}
		else if(b<=c&&b<=a){
		System.out.println("b is the lowest value");}
		else {
		System.out.println(c+" "+"is the lowest value");	
		}
	return a;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greatest_Num obj= new Greatest_Num();
		obj.max(50, 30, 20);
		obj.min(50, 30, 20);
		
		
		

	}

}
