package JavaSessions;

public class MethodOverloadAmazon {
	
	public void search()
	{
		System.out.println("No param");
	}
	public void search(String name)
	{
		System.out.println("1 param");
	}
	public void search(int price)
	{
		System.out.println("1 param");
	}
	public void search(String name,int price)
	{
		System.out.println("2 param search " +  name + " " + price) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadAmazon am=new MethodOverloadAmazon();
		am.search();
		am.search(100);
		am.search("Nike",100);
		

	}

}
