package JavaSessions;

public class ArrayExample {

	public static void main(String[] args) {
		
		/*Question 1: Write a program to print the following pattern using for loop:

			00 01 02 03 04 05 06 07 08 09 
			10 11 12 13 14 15 16 17 18 19 
			20 21 22 23 24 25 26 27 28 29 
			30 31 32 33 34 35 36 37 38 39 */

		
		for(int a=0;a<40;a++)
		{
			String pad=String.format("%02d", a);
			if(pad.contains("9"))
			{
				System.out.println(pad);
			}
			else
			{
			System.out.print(pad + " ");}
		}
		
		/*Question 2: Write a program to create a static Array, having following cricket data:
			--name, age, team name, DOB, gender, Strike Rate
			--Try to create multiple Object Arrays for different players 
			--Try to print all the values of each player on the console*/

		System.out.println("");
		Object ob[]=new Object[6];
		ob[0]="Rahul";
		ob[1]=29;
		ob[2]="RCB";
		ob[3]="08/03/1989";
		ob[4]='M';
		ob[5]=150;
		
		for(int b=0;b<ob.length;b++)
		{
			System.out.println(ob[b]);
		}
		Object ob1[]=new Object[6];
		ob1[0]="Raja";
		ob1[1]=30;
		ob1[2]="DC";
		ob1[3]="18/03/1989";
		ob1[4]='M';
		ob1[5]=120;
		System.out.println("");
		for(int c=0;c<ob1.length;c++)
		{
			System.out.println(ob1[c]);
		}	System.out.println("");
	
		/*Question 3: Try to print the following pattern on the console:
			n = 4
			n = 3
			n = 2
			n = 1
			n = 0*/
		int d[]=new int[5];
		d[0]=4;d[1]=3;d[2]=2;d[3]=1;d[4]=0;
		for(int e=0;e<d.length;e++)
		{
			System.out.println("n = " +d[e]); //"n = " +d[e]
		}
		
		
		
		}
	
}
