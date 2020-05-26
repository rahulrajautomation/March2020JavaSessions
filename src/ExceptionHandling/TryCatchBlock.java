package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try{
		int i=9/0;
		System.out.println("B");
		System.out.println("B");
		}
		
		catch(Throwable t){
			System.out.println("Some error or exception");
			
		}
		/*catch(NullPointerException e){
			System.out.println("hey some null pointer exception occured");
			e.printStackTrace();
		}
		
		catch(ArithmeticException e){
			System.out.println("hey some arithmetic exception occured");
			e.printStackTrace();
		}*/
		
		System.out.println("A");
		System.out.println("A");
	}

}
