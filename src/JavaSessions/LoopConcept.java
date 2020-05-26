package JavaSessions;

public class LoopConcept {

	public static void main(String[] args) {
			
		//for loop
			for (int c=10;c>=1;c--)
			{
				System.out.println(c);
			}
			
			//while loop
			int d=10;
				while(d>=1){
					
					System.out.println(d); d--;
				}
				
				//do while loop
				int e=10;
				do
				{
					System.out.println(e); e--;
				}
				while(e>=1);
				
				
				int f=0;
				while(f<10)
			{
				System.out.println("Hello World");f++;
			}
				
				//5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered

				int g=1;
				while(g<=10)
				{
					if(g%7!=0)
					{
						System.out.println(g);
					}g++;
				}
	}

	}

