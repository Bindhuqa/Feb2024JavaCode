package Constructorpackage;

public class Rectangle {
	
	double length;
	double width;
	
	public Rectangle() {
		
	}
	
	
	
	

	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea(double length, double width) {
		double areaofrectangle = length*width;
		return areaofrectangle;
		
	}

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1.length);
		System.out.println(r1.width);
		
		r1.calculateArea(r1.length, r1.width);
		double lengthdefault = r1.length;
		double widthdefault = r1.width;
		double defaultareaofrectangle = lengthdefault*widthdefault;
		System.out.println(defaultareaofrectangle);
		
		System.out.println("----------------");
		
		Rectangle r2 = new Rectangle(24.4,33.6);
		System.out.println(r2.length);
		System.out.println(r2.width);
		
		System.out.println("----------------");
		
		r2.calculateArea(r2.length, r2.width);
		double length = r2.length;
		double width = r2.width;
		double areaofrectangle = length*width;
		System.out.println(areaofrectangle);
		
		System.out.println("----------------");
		
		
		
		
		
		 

	}

}
