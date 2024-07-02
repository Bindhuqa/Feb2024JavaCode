package oopsInterface;

public class TestEducation {

	public static void main(String[] args) {
		
		IITUniversity obj1 = new IITUniversity();
		
		obj1.accountingcollege();
		obj1.pharmacycollege();
		obj1.medicalcollege();
		obj1.managementcollege();
		obj1.researchandDevelopment();
		obj1.artscollege();
		obj1.scholarship();
		obj1.codingclasses();
		IITUniversity.funding();
		
		
		System.out.println("----------------------");
		IAMUniversity obj2 = new IAMUniversity();
		
		obj2.photographycollege();
		obj2.accountingcollege();
		obj2.engineeringcollege();
		obj2.researchandDevelopment();
		obj2.commercecollege();
		obj2.scholarship();
		obj2.codingclasses();
		

	}

}
