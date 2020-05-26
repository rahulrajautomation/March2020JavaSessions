package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		//Hasmap= Key value format
		
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1, "Java");
		hm.put(2, "Ruby");
		hm.put(3, "Python");
		
		// In Array list we use add method and im Hashmap we use PUT method
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));//null

		for(Map.Entry<Integer, String> entry : hm.entrySet())
		{
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
		}
		
		hm.forEach((k,v)->System.out.println("key = " + k + " value = " + v) );
		
		HashMap<Integer, Integer> hm1=new HashMap<Integer,Integer>();
		hm1.put(1, 123);
		hm1.put(2, 234);
		hm1.put(3, 789);
		hm1.put(4, null);
		hm1.put(null, null);
		hm1.put(null, 600);
		
		System.out.println(hm1.get(1));
		System.out.println(hm1.get(3));
		System.out.println(hm1.get(4));
		System.out.println(hm1.get(null));


	}

}
