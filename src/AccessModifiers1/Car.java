package AccessModifiers1;

public class Car {
	
	public String name="BMW";
	private int price=30; 
	protected String engine="petrol";
	int wheels=4; //if nothing written then default
	
	public void getName()
	{
		System.out.println("get car name");
	}
	private void getPrice()
	{
		System.out.println("get price");
	}
	protected void getEngine()
	{
		System.out.println("get car engine");
	}
	 void getWheels()
	{
		System.out.println("get car wheels");
	}
	
public static void main(String ar[])
{
	Car c=new Car();
	System.out.println(c.name);
	System.out.println(c.price);
	System.out.println(c.engine);
	System.out.println(c.wheels);
	
	c.getWheels();c.getEngine();c.getName();c.getPrice();

}
}
