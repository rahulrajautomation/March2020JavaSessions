package OOP_Abstract;

public class loginpage extends Page{
	
	public loginpage()
	{
		System.out.println("login page default cons");
	}

	@Override
	public void header() {

		System.out.println("Amazon login page header");
	}

	@Override
	public void title() {
		System.out.println("Amazon login page title");
		
	}
	
	public void dologin(String username,String pass)
	{
		System.out.println("login with " +username  + " " +pass);
	}

}
