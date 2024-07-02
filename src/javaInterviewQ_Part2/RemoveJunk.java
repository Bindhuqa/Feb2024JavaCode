package javaInterviewQ_Part2;

public class RemoveJunk {

	public static void main(String[] args) {
		
		//this can be done by using regular expression:[a-zA-Z0-9]
		
		String s = "&**%$ Naveen@$#%*(&$%#%Automation%&*&Labs";
		
		s = s.replaceAll("[^a=zA-z0-9]","" );
		System.out.println(s);

	}

}
