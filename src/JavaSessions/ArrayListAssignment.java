package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment {

	public static void main(String[] args) {
		
		ArrayList<String> color=new ArrayList<String>();
		color.add("Red");
		color.add("Black");
		color.add("White");
		color.add("Orange");
		color.add("Yellow");
		color.add("Pink");
		
		ArrayList<String> al= new ArrayList<String>(color.subList(1, 3));
	
		System.out.println(al);
		
		if(color.contains("Green"))
		{
			System.out.println("Green found");
		}
			System.out.println(color.get(2));
			
		//	7. Write a Java program to reverse elements in a array list
			
			ArrayList<String> Day=new ArrayList<String>();
			Day.add("Sunday");;
			Day.add("Monday");
			Day.add("Tuesday");;
			Day.add("Wednesday");
			
			for(int i=Day.size()-1;i>=0;i--){
			
			System.out.println(Day.get(i));
			
					
			// 9. Write a Java program of swap two elements in an array list.
			
			ArrayList<String> Day1=new ArrayList<String>();
			Day1.add("Sunday");;
			Day1.add("Monday");
			Day1.add("Tuesday");;
			Day1.add("Wednesday");
			
			Day1.removeAll(Day1);
			//Collections.swap(Day1, 1, 2);
			
			System.out.println(Day1);
			}
		// 11. Write a Java program to trim the virtual capacity of an array list the current list size.

			ArrayList<String> Day2=new ArrayList<String>(50);
			Day2.add("Sunday");;
			Day2.add("Monday");
			Day2.add("Tuesday");;
			Day2.add("Wednesday");
			Day2.add("Thursday");
			Day2.add("Friday");
			Day2.add("Saturday");

			//Day2.trimToSize();
			//System.out.println(Day2.size());
			

	}

}
