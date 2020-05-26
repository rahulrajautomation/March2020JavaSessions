package JavaSessions;

public class Car {

	String name;
	String color;
	int price;
	String model;
	static int wheels =4;
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.name="BMW";
		c1.color="Red";
		c1.price=12;
		c1.model="Q5";

		Car c2=new Car();
		c2.name="Audi";
		c2.color="Blue";
		c2.price=122;
		c2.model="1Q5";
		
		System.out.println(c1.name +" " + c1.model);
		System.out.println(Car.wheels);
	}

}
