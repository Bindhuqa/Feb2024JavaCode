package javasessions;

public class Browser {
	
	
	public boolean getBrowser(String browsername) {
		System.out.println("launching browser is"+" "+browsername);
		
		boolean b1 = true;
		switch (browsername) {
		case "chrome":
			System.out.println("launching chrome");
			break;
		case "firefox":
			System.out.println("launching firefox");
			break;
		case "edge":
			System.out.println("launching edge");
			break;
		case "safari":
			System.out.println("launching safari");
			break;
		default:
			System.out.println("plz give the right browser name");
		    b1 = false;
			break;
		}
		
		return b1;
		
		}
	
	public int add(int a,int b) {
		System.out.println("adding two numbers");
		int sum = a*b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser br = new Browser();
		if(br.getBrowser("internet explorer")) {
		System.out.println("enter the url:www.google.com");
		}
		else {
			System.out.println("launching browser failed");
		}
		
		 int x = br.add(6, 10);
		System.out.println(x-6);

	}

}
