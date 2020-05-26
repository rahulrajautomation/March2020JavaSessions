package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String browser="IE";
		
		if(browser.equals("Chrome")){
			
			System.out.println("Launch Chrome");
		}
		else if(browser.equals("Firefox")){
			
			System.out.println("Launch Firefox");
		}
		else if(browser.equals("Safari")){
			
			System.out.println("Launch Safari");
			
		}else{
			try {
				throw new Exception("Please pass the correct browser");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		String username=null;
		if(username!=null){
			System.out.println("Please login with user" + username);
			}
			else
			{
				try {
					throw new Exception("Datanotfoundexp");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}


