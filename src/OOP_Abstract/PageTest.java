package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		loginpage lp=new loginpage();
		lp.header();
		lp.title();
		lp.getPageInfo();
		lp.dologin("admin", "admin");
		
		//top casting
		
		Page p= new loginpage();
		p.header();
		p.title();
		p.getPageInfo();  
		
		
		
		
		
		
		
	}

}
