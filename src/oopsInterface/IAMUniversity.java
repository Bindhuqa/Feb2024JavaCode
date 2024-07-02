package oopsInterface;

public class IAMUniversity extends ISSO implements  USEducation,UKEducation,IndianEducation {
	 //Indian 
		@Override
		public void accountingcollege() {
			System.out.println("Indian------acconting");
			
		}

		@Override
		public void pharmacycollege() {
			
			System.out.println("Indian------pharmacy");
		}
	    //UK
		@Override
		public void photographycollege() {
			
			System.out.println("UK------photography");
		}

		@Override
		public void lawcollege() {
			
			System.out.println("UK------law");
		}
	     //USA
		@Override
		public void medicalcollege() {
			System.out.println("USA------medicine");		
		}

		@Override
		public void managementcollege() {
			System.out.println("USA------management");
			
		}

		@Override
		public void engineeringcollege() {
			System.out.println("USA------Engineering");
			
		}
		
		public void commercecollege() {
			System.out.println("IAM------Commerce");
		}

		@Override
		public void researchandDevelopment() {
			System.out.println("IAM--------RND");
			
		}
		
		public void scholarship() {
			System.out.println("IAM--------scholarship");
		}
		
		
	}

