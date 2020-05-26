package OOP_Interfaces;

public interface USMedical {
	
	int fee=10;
	//Only Method declaration; No method body
	//Abstract methods - No definition
	public void orthoServices();
	public void cardioServices();
	public void neuroServices();
	public void services911();
	
	//can define static method with body
	
	public static void medicine()
	{
		System.out.println("medicine");
	}
	
	//default method in interface
	
	default void nursing()
	{
		System.out.println("Nursing method");
	}

}
