package javasessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int i = 11;
		
		i = i++ + ++i;
		
		System.out.println(i);
		
		
    int a=11, b=22;
		
	int	c = (a + b + a++ + b++ + ++a + ++b);
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	
	int h=1,j=2,k=3;
	

	int m = h-- - j-- - k--;

	System.out.println("h="+h);

	System.out.println("j="+j);

	System.out.println("k="+k);

	System.out.println("m="+m);
	
	int p=1,q=2; 

	System.out.println(--q - ++p + ++q - --p);
	}
};
