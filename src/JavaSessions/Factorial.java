package JavaSessions;

public class Factorial {
	
	public void getFactorial(int num)
	{
		int i,fact=1;
		 for(i=1;i<=num;i++)
	  	  {

	    	   fact=fact*i;
	 	  }
		 System.out.println(fact);
	}

	public static void main(String[] args) {
		
		Factorial obj=new Factorial();
		obj.getFactorial(5);

	}

}
