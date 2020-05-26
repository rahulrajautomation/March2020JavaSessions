package JavaSessions;

import java.util.ArrayList;

public class FuntionsInJava {
	
public static void main(String[] args) {
		
		FuntionsInJava obj=new FuntionsInJava();
		obj.test();
		String n1=obj.getTrainerName();
		System.out.println(n1);
		int n2=obj.getScore();
		System.out.println(n2);
		int summ=obj.add(12, 13);
		System.out.println(summ);
		int m1=obj.getMarks("Anu");
		System.out.println(m1);
		String c1=obj.getCapital("India");
		System.out.println(c1);
		String s1=obj.launchBrowser("OP");
		System.out.println(s1);
		ArrayList<String> ar1= obj.getPageLinks("login");
		System.out.println(ar1.size());
		System.out.println(ar1);
	}
	public void test()
	{
		System.out.println("Test Method");
	}
	
	public String getTrainerName()
	{
		System.out.println("getTrainerName");
		String name="Naveen";
		return name;
		
	}
	public int getScore()
	{
		System.out.println("Get Score");
		int p1=20;int p2=30;
		int total=p1+p2;
		return total;
	}
	public int add(int a,int b)
	{
		System.out.println("add method");
		int z=a+b;
		return z;
	}
	public int getMarks(String stname)
	{
		System.out.println("Get method");int marks=0;
		if(stname.equals("Anu"))
		{
			marks=90;
		}
		else if (stname.equals("Sita"))
		{
			marks=98;
		}
		else if (stname.equals("Nav"))
		{
			marks=10;
		}
		else{
			System.out.println(stname + "Not found");
		}
		return marks;
	}
	
	public String getCapital(String Country)
	
	{ String capital=null;
		System.out.println("Capital of " +Country);
		if(Country.equals("India"))
		{
			capital ="New Delhi";
		}
		else if(Country.equals("Spain"))
		{
			capital ="New Spain";
		}
		else if(Country.equals("China"))
		{
			capital ="New China";
		}
		else 		{
			System.out.println("Country not found");
		}
		return capital;
	}
	public String launchBrowser(String browsername)
	{
		System.out.println("Browser name is ");
		String driver=null;
		
		switch (browsername) {
		case "Chrome":
			driver="U are chrome";
			break;
		case "IE":
			driver="U are IE";
			break;
		case "Mozilla":
			driver="U are Mozilla";
			break;
		default:
			System.out.println("Browser not found");
			break;
		}return driver;
	}
	
	public ArrayList<String> getPageLinks(String pageName)
	{
		ArrayList<String> ar=new ArrayList<String>();
		System.out.println("links on the page" +pageName);
		
		if(pageName.equals("login"))
		{
			ar.add("Forgot pass");
			ar.add("Signup");
			ar.add("Reset pass");
			
		}
		else if(pageName.equals("homepage"))
		{
			ar.add("Home pass");
			ar.add("Home Signup");
			ar.add("Home Reset pass");
			
		}
		else if(pageName.equals("Account"))
		{
			ar.add("Order Hstory");
			ar.add("profile");
			ar.add("card detail pass");
			
		}else{System.out.println("Page not found");
	}return ar;}

}
