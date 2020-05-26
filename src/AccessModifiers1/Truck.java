package AccessModifiers1;

public class Truck {
	
	public Truck(){
		System.out.println("Default param..");
	}
	
	private Truck(int a)
	{
		System.out.println("1 param.." +a);

	}

	public static void main(String[] args) {

		Truck t=new Truck(1);
		
	}

}
