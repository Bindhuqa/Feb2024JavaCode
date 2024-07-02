package javasessions;

public class Grading {
	public int user(String name ,int a) {
		System.out.println("student name:"+" "+name);
		if(a>=91&&a<=100) {
			System.out.println("Grade AA");
		}
		else if(a>=81&&a<=90) {
			System.out.println("Grade AB");	
		}
		else if(a>=71&&a<=80) {
			System.out.println("Grade BB");
		}
		else if(a>=61&&a<=70) {
			System.out.println("Grade BC");
		}
		else if(a>=51&&a<=60) {
			System.out.println("Grade CD");
		}
		else if(a>=41&&a<=50) {
			System.out.println("Grade DD");
		}
		else {
			System.out.println("FAIL");
		}
		return a;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grading obj = new Grading();
		obj.user("karthik", 97);
		obj.user("rani", 37);

	}

}
