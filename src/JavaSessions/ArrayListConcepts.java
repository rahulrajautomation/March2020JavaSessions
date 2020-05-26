package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(12.33);
		ar.add("Hey");
		ar.add('C');
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		//System.out.println(ar.get(3));// IndexOutOfBound
		//ar.remove(2);
		System.out.println(ar.get(1));
		
		// TO print all the values from array list
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//Generic based arraylist
		
		ArrayList<String> ars=new ArrayList<String>();
		ars.add("Tara");
		ars.add("Sugreev");
		
		ArrayList<Integer> ali=new ArrayList<Integer>();
		ali.add(123);
		
		ArrayList<Object> alo=new ArrayList<Object>();
		
		alo.add("EMp1");
		alo.add(12345);
		alo.add('M');
		alo.add(12.33);
		//Best practice is to use generics rather than raw data
	}

}
