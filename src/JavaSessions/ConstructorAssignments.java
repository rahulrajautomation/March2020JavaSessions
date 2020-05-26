package JavaSessions;

import java.util.ArrayList;

public class ConstructorAssignments {

	public static void main(String[] args) {
		ArrayList<String>Listofcourse = new ArrayList<String>();
		Listofcourse.add("Computer Science");
		Listofcourse.add("History");
		Listofcourse.add("Biology");

		ArrayList<String>Listofplugins = new ArrayList<String>();
		Listofplugins.add("Chropath");
		Listofplugins.add("Chromium");
		Listofplugins.add("Greenshot");


		Univ obj=new Univ("DU", "India", "2000-01-01", Listofcourse);
		
		Browser obj1=new Browser("Chrome", "Google", 12.0, Listofplugins);
		/*System.out.println(obj.getUnivName());
		System.out.println(obj.getstablishdate());
		*/
		//System.out.println(obj.name + " " + obj.country + " " + obj.stablishedDate + " " + obj.Lisofcourse);
		
		System.out.println(obj1.getBrowserName());
		System.out.println(obj1.getCurrentVersion());
		System.out.println(obj1.getVendorName());
		System.out.println(obj1.getlistname());
		
	}

}
