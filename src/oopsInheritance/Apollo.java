package oopsInheritance;

public class Apollo extends Hospital{
	
    @Override
	public void treatPatient() {
		System.out.println("treating the patient in the hospital");	
	}
	@Override
	public void DischargePatient() {
		System.out.println("Discharging the patient from a hospital");	
	}
	
	public void performSurgery() {
		System.out.println("performin the surgery to patient");	
	}

}
