package javasessions;

public class MethodAssign {
	
	public int add(int a,int b) {
		System.out.println("adding two numbers");
		int sum = a+b;
		
		return sum;
	}
	public int subtract(int a,int b) {
		System.out.println("subtracting two numbers");
		int minus = a-b;
		return minus;
	}
	public int multiply(int a,int b) {
		System.out.println("multiplying two numbers");
		int cross = a*b;
		return cross;
	}
	
	public int division(int a,int b) {
		System.out.println("dividing two numbers");
		int divide = a/b;
		return divide;
	}
	
	public double decimal(double a, double b) {
		System.out.println("product of two doubles");
		double product = a*b;
		return product;
		
	}
	
	public double circumference(double radius) {
		double answer = 2*Math.PI*radius;
		
		return answer;
		
	}
	public double area(double radius) {
		double areaofcircle = Math.PI*radius*radius;
		return areaofcircle;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodAssign obt = new MethodAssign();
		int c = obt.add(10, 30);
		System.out.println(c);
		int d = obt.add(50, 60);
		System.out.println(d);
		
		System.out.println("-----------------");
		int e = obt.subtract(30, 15);
		System.out.println(e);
		int f = obt.subtract(20, 30);
		System.out.println(f);
		
		System.out.println("-----------------");
		int g = obt.multiply(10, 8);
		System.out.println(g);
		
		System.out.println("-----------------");
		int h = obt.division(200, 2);
		System.out.println(h);
		
		System.out.println("-----------------");
		double i = obt.decimal(36.8, 12);
		System.out.println(i);
		
		System.out.println("-----------------");
		double j= obt.circumference(13.6);
		System.out.println(j);
		
		System.out.println("-----------------");
		double k = obt.area(13.6);
		System.out.println(k);
		
		
		
	
		
		
		
		

	}

}
