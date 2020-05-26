package JavaSessions;

import java.util.ArrayList;

public class PageTest {

	public static void main(String[] args) {
		
		Page loginpage=new Page();
		
		loginpage.url="htp://amazon/login";
		loginpage.title="AmazonShop";
		loginpage.logo="Amazon";
		loginpage.header="loginheader";
		loginpage.footerlink=new ArrayList<String>();
		loginpage.footerlink.add("Privacy Policy");
		loginpage.footerlink.add("Contact us");
		loginpage.footerlink.add("Terms");

		
Page homepage=new Page();
		
		homepage.url="htp://amazon/home";
		homepage.title="AmazonShophome";
		homepage.logo="Amazon";
		//homepage.header="homeheader";
		homepage.footerlink=new ArrayList<String>();
		homepage.footerlink.add("Privacy Policy");
		homepage.footerlink.add("Contact us");
		homepage.footerlink.add("Terms");
		
		System.out.println(loginpage.url);
		System.out.println(loginpage.title);
		System.out.println(loginpage.footerlink);
		System.out.println(homepage.header);
	}

}
