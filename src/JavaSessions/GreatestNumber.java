package JavaSessions;

public class GreatestNumber {

	public static void main(String[] args) {
		
		int a=400; int b=700; int c=500; int d =100;
		
		if(a>b && a>c && a>d)
		{
			System.out.println("a is greater");
		}
		else if ( b>c && b>d)
		{
			System.out.println("b is greater");
		}

		else if ( c>d)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("d is greatest");
		}

	}

}
