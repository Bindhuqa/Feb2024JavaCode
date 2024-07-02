package javasessions;

public class LoopsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=2;
		for(x=2;x<=100;x++) {
			if(x%2==0)
			System.out.println(x);
		}
		
		char ch='a';
		for(ch='z';ch>='a';ch--) {
			System.out.println(ch);	
		}
		
		float f=1.0f;
		while(f<=10.0f) {
			System.out.println(f);	
			f++;
			}
		
		int p=0;
		for(p=0;p<=99;p++) {
			if(p%9==0)
			System.out.println(p);	
		}
		
		char t='a';
		for(t='a';t<='z';t++) {
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
				System.out.println(t+" "+"is a vowel");
		}
		 
		System.out.println("---------");
		
		char i='a';
		while(i<='z') {
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u') 
				System.out.println(t+" "+"is a vowel");	
			i++;
			
			}
		
		int a=1;
		for(a=1;a<=10;a++) {
			System.out.println(a);
			if(a%7==0) {
				System.out.println("Bye,see you tomorrow");
				break;
			}
		}
		

	}

}
