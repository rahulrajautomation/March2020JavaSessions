package OOP_Abstract;

public abstract class WebPage {
	
	//0% abstraction
	public void history(String name)
	{
		System.out.println("Weppage history");
	}
	public void history(String name,String date)
	{
		System.out.println("Weppage history");
	}
	
	public abstract void history1(String name);
	public abstract void history1(String name,String date);
	
	// 0%, abstraction,partial abstraction , 100% abstraction


}
