package OOP_Interfaces;

public class FortisHospital extends WHO implements USMedical,UKMedical,IndiaMedical{

	@Override
	public void oncologyServices() {
		System.out.println("FS- oncology");
	}

	@Override
	public void radioServices() {
		System.out.println("FS- radio");
		
	}

	@Override
	public void pathologyServices() {
		System.out.println("FS- pathology");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FS- physio");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FS- pedia");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FS- ortho");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FS- cardio");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FS- neuro");
		
	}

	@Override
	public void services911() {
		System.out.println("FS- services911");
		
	}
	public void medinsurance()
	{
		System.out.println("FS- medical ins");

	}
	public void optServices()
	{
		System.out.println("FS- opt services");

	}
	@Override
	public void vacin()
	{
		System.out.println("FS - vacin");
	}

}
