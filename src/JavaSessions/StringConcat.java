package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {
		int a =200;int b=200;
		char c='A';
		String s="ABC";String s1="DEF";

		System.out.println(s+s1); //ABCDEF
		System.out.println(a+s); // 200ABC
		System.out.println(a+b+s+s1); //400ABCDEF
		System.out.println(s+s1+a+b);// ABCDEF200200
		
		System.out.println(c+s);//AABC
		System.out.println(c+a);//265
		System.out.println(a+c);//265
		System.out.println(c+s+a+b);//AABC200200
		

		//Incremental/Deceremental Opeartor
		
		int d=1;int d1=d++;
		System.out.println(d1);
		System.out.println(d);
		System.out.println(d1);
		 int m=-1; int n=m++;
		 System.out.println(m +" " + n);
		 
		 //Dead Code example
		 
		 if(true)
		 {
			 System.out.println("Reachable");
		 }
		 else
		 {
			 System.out.println("Not Reachable- Dead Code");
		 }
	}

}
