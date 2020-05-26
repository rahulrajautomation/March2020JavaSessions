package OOP_Inheritance;

public class BMW extends Car{
	
	@Override
	public void start(){  //Method Overriding
		System.out.println("BMW Start");
	}
	public void autoparking()
	{ 
		System.out.println("BMW - Auto parking");
	}

}
