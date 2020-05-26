package JavaSessions;

import java.util.ArrayList;

public class Univ {

	String name;
	String country;
	String stablishedDate;
	ArrayList<String> Lisofcourse;
 	
	public Univ(String name, String country, String stablishedDate, ArrayList<String> Listofcourse) {
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.Lisofcourse=Listofcourse;
	}

	public Univ(String name, String stablishedDate) {
		this.name = name;
		this.stablishedDate = stablishedDate;
	}
	
	public String getUnivName()
	{
		return this.name;
	}
	public String getstablishdate()
	{
		return this.stablishedDate;
	}
}
