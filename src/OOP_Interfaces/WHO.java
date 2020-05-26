package OOP_Interfaces;

public class WHO implements UNHC{

	public void pandemic()
	{
		System.out.println("WHO pandemic");
	}
	public void vacin()
	{
		System.out.println("WHO vacin");
	}
	@Override
	public void ebola() {
		System.out.println("WHO ebola");		
	}
	@Override
	public void polio() {
		System.out.println("WHO polio");		
	}
}
