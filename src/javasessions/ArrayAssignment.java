package javasessions;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[] = {1,4,5,2,3,22,31,2}; 
		
		int a[] = new int[p.length-1];
		int j = 0;
		for(int i=0;i<p.length;i++) {
			if(p[i]!=22) {
				a[j]=p[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		Object cricketer1[]= {"kohli",35,"india","1989",'m',6.5};
		System.out.println(Arrays.toString(cricketer1));
		System.out.println("----------");
		for(int i=0;i<cricketer1.length;i++) {
			System.out.println(cricketer1[i]);
		}
		
		Object cricketer2[]= {"dhoni",40,"india","1985",'m',7.0};
		System.out.println(Arrays.toString(cricketer2));
		 System.out.println("----------");
		 
		 for(Object e:cricketer2) {
			 System.out.println(e); 
		 }
		
		
		
		Object cricketer3[]= new Object[6];
		cricketer3[0]= "warner";
		cricketer3[1]= 30;
	    cricketer3[2]= "australia";
	    cricketer3[3]= "1990";  
	    cricketer3[4]= 'm';
	    cricketer3[5]= 6.8;
	    
	    for(int i=0;i<cricketer3.length;i++) {
	    	System.out.println(cricketer3[i]);
	    }
	    
	    System.out.println("----------");
	    
	    for(Object e:cricketer3 ) {
	    	System.out.println(e);
	    }
	    
	    
	    System.out.println("----------");
	    
	    int k[] = {1,3,4,5,22,56,89,90};
	    for(int i=0;i<k.length;i++) {
	    	System.out.println(k[i]);
	    }
	    System.out.println("----------");
	    
	    for(int e:k) {
	    	System.out.println(e);
	    }
	    System.out.println("----------");
	    
	    int i=0;
	    while(i<k.length) {
	    	System.out.println(k[i]);
	    	i++;
	    }
	    System.out.println("----------");
	    
	    for(int m=k.length-1;m>=0;m--) {
	    	System.out.println(k[m]);
	    }
	    
	    System.out.println("----------");
	    
	    int h=k.length-1;
	    while(h>=0){
	    	System.out.println(k[h]);
	    	h--;
	    }
	    
	    int b[]= {2,7,98,56,43,22,92};
	    int c[]= new int[b.length-1];
	    int e=0;
	    for(int d=0;d<b.length;d++) {
	    	if(b[d]!=98) {
	    	c[e]=b[d];
	    	e++;
	    	}
	    }
	    System.out.println(Arrays.toString(c));
	    
	    
	    


		
		
		
		
		
		

	}

}
