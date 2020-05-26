package JavaSessions;

public class MainMethodOverloading {
	
	//Main method can be overloaded but main() signature should not be changed for JVM
	//Static methods can be overloaded.

	public static void main(String[] args) {
		System.out.println("Hi");
		main(10);
		main("Naveen");
	}
	public static void main(int i) {
		System.out.println("Hello" +i);
	}
	public static void main(String name) {
		System.out.println("Bye" + name);

	}

}
