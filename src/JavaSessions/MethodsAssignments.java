package JavaSessions;

public class MethodsAssignments {
	
	public void getGrade(int i)
	{
		if(i>=91 && i<=100)
		{
			System.out.println("you have got " +i +" marks and your grade is AA");
		}
		else if(i>=81 && i<=90)
		{
			System.out.println("you have got " +i +" marks and your grade is AB");
		}
		else if(i>=71 && i<=80)
		{
			System.out.println("you have got " +i +" marks and your grade is BB");
		}
		else if(i>=61 && i<=70)
		{
			System.out.println("you have got " +i +" marks and your grade is BC");
		}
		else if(i>=51 && i<=60)
		{
			System.out.println("you have got " +i +" marks and your grade is CD");
		}
		else if(i>=41 && i<=50)
		{
			System.out.println("you have got " +i +" marks and your grade is DD");
		}
		else{
			System.out.println("You are fail");
		}
	}
	
		public static void main(String[] args) {
		MethodsAssignments obj=new MethodsAssignments();
		/*obj.minnum(10, 20, 30);
		obj.maxnum(10, 50, 20);
		obj.evenodd(9);
		obj.eligibleToVote(18);
		*/
		obj.getGrade(87);
	}

}
