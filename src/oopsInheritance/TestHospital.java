package oopsInheritance;

public class TestHospital {

	public static void main(String[] args) {
		
		Hospital h1 = new Hospital();
		
		h1.admitPatient();
		h1.treatPatient();
		h1.DischargePatient();
		
		System.out.println("---------------");
		
		Apollo a1 = new Apollo();
		
		a1.admitPatient();
		a1.treatPatient();
		a1.DischargePatient();
		a1.performSurgery();
		
		System.out.println("---------------");
		
		Fortis f1 = new Fortis();
		
		f1.admitPatient();
		f1.treatPatient();
		f1.DischargePatient();
		f1.prescribeMedication();
		
		System.out.println("---------------");
		
		Max m1 = new Max();
		m1.admitPatient();
		m1.treatPatient();
		m1.DischargePatient();
		m1.conductTests();
		
		
		
	}

}
