package OOP_Interfaces;

public class FortisTest {

	public static void main(String[] args) {

		FortisHospital fs=new FortisHospital();
		fs.cardioServices();
		fs.neuroServices();
		fs.medinsurance();
		fs.pathologyServices();
		fs.ebola();
		fs.polio();
		fs.pandemic();
		fs.vacin();
		fs.nursing();
		
		System.out.println(USMedical.fee);
		
		//top casting
		USMedical us=new FortisHospital();//child class obj can be refrenced by interface variable
		
		us.orthoServices();
		us.cardioServices();
		us.neuroServices();
		us.services911();
		
		UKMedical uk=new FortisHospital();
		
	uk.physioServices();
	uk.pediaServices();
	
	
	}

}
