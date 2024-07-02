package javasessions;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<=10;i++) {
			System.out.println("I AM BATMAN");
		}
		
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
			
		}
		
		System.out.println("---------");
	
		
		int j=10;
		do {
			System.out.println(j);
			j--;
		}
	
		while(j>=1);
		
		int i=0;
		while(i<=10) {
			System.out.println("HELLO WORLD");
			i++;
		}
		
		int a=1;
		for(a=0;a<=100;a++) {
		
		    if(a%5==0) {
		    System.out.println(a);
		    }
		    
		}
		
		System.out.println("---------");
		
		int A=1;
		while(A<=100) {
			if(A%5==0)
			System.out.println(A);
			A++;
			}
		System.out.println("---------");
		
		int c=0;
		for(c=0;c<=100;c++) {
			if(c%2==0)
				System.out.println(c);
			
		}
		
		int c1=0;
		for(c1=0;c1<=100;c1++) {
			if(c1%2!=0)
				System.out.println(c1);
			
		}
		int i1 = 1;
		while(i1<=1){
		System.out.println("Hi Java");
		break;
		}
		
		char ch='A';
		for(ch='A';ch<='Z';ch++) {
			System.out.println(ch+"="+(int)ch);
		}
		System.out.println("---------");
		char ch1='a';
		while(ch1<='z') {
			System.out.println(ch1+"="+(int)ch1);
		ch1++;
		}
		
		int p=0;
		for(p=0;p<=9;p++) {
			System.out.println(p+"="+(int)p);
		}
		
		
		
		

	}
}

