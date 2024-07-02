package oopsInheritance;

public class Max extends Hospital {

	@Override
	public void treatPatient() {
		System.out.println("treating the patient in the hospital");
	}

	@Override
	public void DischargePatient() {
		System.out.println("Discharging the patient from a hospital");
	}
	
	public void  conductTests() {
		System.out.println("conducting tests to the patients");
	}

}
