package oopsInheritance;

public class Fortis extends Hospital {

	@Override
	public void treatPatient() {
		System.out.println("treating the patient in the hospital");
	}

	@Override
	public void DischargePatient() {
		System.out.println("Discharging the patient from a hospital");
	}
	
	public void prescribeMedication() {
		System.out.println("prescribing medication to the patient");
	}

}
