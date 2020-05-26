package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="This is my first java code and i am so happy";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('i')); // 1st occurrence
		System.out.println(str.indexOf('i', 3));
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of i
			
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Testing"));
		
		String s= "Welcome admin";
		
		System.out.println(s.indexOf("admin"));
		
		//trim
		
		String st="    Hello World  ";
		
		System.out.println(st.trim());
		System.out.println(st.trim().replace(" ", ""));
		
		String dob="01-01-1990";
		
		System.out.println(dob.replace("-", "/"));
		
		//LCASE and UCASE
		
		String c="ThIs Is jaVa";
		
		System.out.println(c.toLowerCase());
		System.out.println(c.toUpperCase());
		
		String a="Hello"; String b="Selenium";
		System.out.println(a.concat(b));
		
		//contains
		
		String msg="Hey admin welcome to our portal";
		
		System.out.println((msg.contains("admin")));
		
		//equals
		
		String s1="this is my code";
		String s2="This is my code";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//substring
		
		String se="Your transation id is 12345";
		
		System.out.println(se.substring(0, 10));
		System.out.println(se.substring(0));
		System.out.println(se.substring(se.indexOf("is")+2).trim());
		
		//split
		
		String data="Tom;21;M;Bangalore;9898909890";
		
		String a1[]=data.split(";");
		System.out.println(a1.length);
		
		System.out.println(data.split(";")[0]);
		System.out.println(data.split(";")[1]);
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		
		String text ="xXjavaXxXRubyXXXxXPython";
		String test[]= text.split("xX");
		System.out.println("0th -->" +test[0]);
		System.out.println("1st -->" +test[1]);
		
		System.out.println("2nd -->" +test[2]);

		
		String ss="Selenium";
		
		String rev="";
		
		for(int i=ss.length()-1;i>=0;i--)
		{
			rev=rev +ss.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer sb=new StringBuffer(ss);
		System.out.println(sb.reverse());
		
		
		
	}

}
