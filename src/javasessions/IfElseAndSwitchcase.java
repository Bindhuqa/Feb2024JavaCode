package javasessions;

public class IfElseAndSwitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=25;
		int b=78;
		int c=87;
		if(a>=b)
		System.out.println("b is the greatest");
	    else if(b<=c)
		System.out.println("c is the greatest");
		
		
		
		byte d=25;
		byte e=78;
		byte f=87;
		byte g=97;
	    if(d>=e) {
	    System.out.println("d is the greatest");
	    }
	    else if(e>=f) {
	    System.out.println("e is the greatest");}
	    else if(f<=g) {
		System.out.println("g is the greatest");}
	    
	    int h=35;
	    int i=-11;
	    if(h>0)
	    	System.out.println("h is a positive number");
	    else System.out.println("h is a negative number");
	    
	    if(i>0)
	    	System.out.println("i is a positive number");
	    else System.out.println("i is a negative number");
	    
	    
	    int j=18;
	    if(j%2==0)
	    	System.out.println("j is a even number");
	    else System.out.println("j is a odd	` number");
	    
	    char ch='i';
	    switch (ch) {
		case 'a':
			System.out.println(ch + " is a vowel");
			break;
		case 'e':
			System.out.println(ch + " is a vowel");
			break;
		case 'i':
			System.out.println(ch + " is a vowel");
			break;
		case 'o':
			System.out.println(ch + " is a vowel");
			break;
		case 'u':
			System.out.println(ch + " is a vowel");
			break;
			
			
	default:
		    System.out.println(ch + " is a consonant");
			break;
		}
	    
	    
	    String environment = "Tester";
	    switch (environment) {
		case "stage":
			System.out.println("Run the program in stage env");
			break;
			
		case "QA":
			System.out.println("Run the program in QA env");
			break;
		case "production":
			System.out.println("Run the program in production env");
			break;	
		case "development":
			System.out.println("Run the program in development env");
			break;		
	

		default:
			System.out.println("Run the program in UAT env");
			break;
		}
	    
	    
	    String car = "SUV";
	    switch (car) {
		case "sedan":
			System.out.println("book sedan");
			break;
		case "SUV":
			System.out.println("book SUV");
			break;
		case "mini":
			System.out.println("book mini");
			break;	
	

		default:
			System.out.println("please give correct car name");
			break;
		
		}
	    
	    
		String browser = "safari";
		if (browser.equals("firefox")) {
			System.out.println("Launch firefox");
		} else if (browser.equals("chrome")) {
			System.out.println("Launch chrome");
		} else if (browser.equals("edge")) {
			System.out.println("Launch edge");

		} else if (browser.equals("i.e")) {
			System.out.println("Launch i.e");
		} else {
			System.out.println("please pass the right browser name");
		}
	    	
		
	String browsername = "chrome";
	switch (browsername) {
	case "chrome":
		System.out.println("Launch chrome");
		break;
	case "safari":
		System.out.println("Launch safari");
		break;
	case "edge":
		System.out.println("Launch edge");
		break;
	case "firefox":
		System.out.println("Launch firefox");
		break;


	default:
		System.out.println("please give right browser name");
		
		break;
	}
	
	String loantype = "Housingloan";
	double salary = 30000;
	double interestrate = 0.0;
	
	switch (loantype) {
	case "Carloan":
		interestrate = 6.5;
		break;
	case "Educationloan":
		interestrate = 4.5;
		break;
	case "Housingloan":
		if(salary<=35000)
			System.out.println("NOT APPLICABLE FOR Housing Loan");
		break;
	case "Personalloan":
		interestrate = 7.5;
		break;

default:System.out.println("INVALID");
		break;
	}
	
	int x = 5;
	int y = 10;
	
	if(x<y&&x>0&&y<0&&y>5)
		System.out.println("hi");
	else System.out.println("bye");
	
	if(x<y||x>0||y<0||y>5)
		System.out.println("hi");
	else System.out.println("bye");
	
	
		
	    
	    
	    	
		    
	    
	    
			
	
		
		

	}

	}

