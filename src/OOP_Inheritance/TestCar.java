package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoparking();
		b.engine();
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		Audi au=new Audi();
		au.start();
		au.stop();
		au.refuel();
		
		//Top Casting
		Car c1=new BMW(); //child class object can be referred by parent class reference variable
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
	}

}
