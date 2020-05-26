package JavaSessions;

public class StaticVsNonStaticConcept {
	
	String name;
	static int age;
	
	public void getName()
	{
		System.out.println("getName Method");
	}
	
	public static void getemail()
	{
		System.out.println("getemail Method");
	}

	public static void main(String[] args) {
		
	 // Static are not allowed for local,its always a class property
		//how to access non static stuff: create the object
		StaticVsNonStaticConcept obj=new StaticVsNonStaticConcept();
		obj.name="Tom";
	System.out.println(obj.name);
	//how to access static stuff
	//calling them directly or by class name.
	//object of class can be used to call static variable and methods but with a warning.
	getemail();
	age=20;
	System.out.println(age);
	StaticVsNonStaticConcept.age=30;
	System.out.println(age);
	StaticVsNonStaticConcept.getemail();

	}

}
