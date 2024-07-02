package javasessions;

public class Vote {
	
	
	public boolean age(String name ,int a)
	
	{
		
		System.out.println("Eligibility age for the vote");
		if(a>=18) {
			System.out.println(name+" "+"is eligible for the vote");
			return true;
			}
			else {
				System.out.println(name+" "+"is not eligible for the vote");
				return false;
			}
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vote v = new Vote();
		boolean eligible = v.age("geetha", 25);
		System.out.println(eligible);
		
		//v.age("ravi", 16);

	}

}
