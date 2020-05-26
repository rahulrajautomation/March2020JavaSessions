package JavaSessions;

import java.util.ArrayList;

public class ConstructorConcept {

	String name;
	int age;
	String email;
	boolean isactive;
	char gender;
	long phone;
	ArrayList<String> paymentoptions;
	
	public ConstructorConcept()
	{
		System.out.println("default constructor");
	}
	public ConstructorConcept(int i)
	{
		System.out.println("1 param constructor" +i);
	}
	public ConstructorConcept(int i,String s)
	{
		System.out.println("2 param constructor" +s);
	}
	//Constructor with limited class variable
	public ConstructorConcept(String name,int age, String email)
	{
		// to use the class variable
		this.name=name;
		this.age=age;
		System.out.println();
	}
	//Constructor with all class variable
	
	public ConstructorConcept(String name, int age, String email, boolean isactive, char gender, long phone,
			ArrayList<String> paymentoptions) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.isactive = isactive;
		this.gender = gender;
		this.phone = phone;
		this.paymentoptions = paymentoptions;
	}

	
	
	public static void main(String[] args) {
		ConstructorConcept obj=new ConstructorConcept(10);
		ConstructorConcept obj1=new ConstructorConcept("Tom", 11, "a@");
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Gpay");ar.add("Debit");
		ConstructorConcept obj2=new ConstructorConcept("Deep", 23, "a@a", true, 'M', 999, ar); 
		System.out.println(obj2.age + ""+ obj2.paymentoptions);
		
	}
	
}
