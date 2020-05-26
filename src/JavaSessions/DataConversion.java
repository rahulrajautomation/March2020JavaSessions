package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		String s="100";
		
		//String to Int
		int i=Integer.parseInt(s);
		System.out.println(i+30);
		
		//String to Double
		
		String u="12.33";
		
		double d=Double.parseDouble(u);
		
		System.out.println(d+10);
		
		//Int to String;
		
		int p=100;
		
		String p1=String.valueOf(p);
		
		System.out.println(p1+20);
	}

}
