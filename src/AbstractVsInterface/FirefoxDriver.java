package AbstractVsInterface;

public class FirefoxDriver implements WebDriver{
	
	public  FirefoxDriver() {
		System.out.println("Launching Firefox driver");
	}
	
	@Override
	public void get(String URL) {
		System.out.println("launch url");		
	}

	@Override
	public void close() {
		System.out.println("close browser");		
		
	}

	@Override
	public void getTitle() {
		System.out.println("gettitle");		
		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("get CUttent URL");		
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("find element" + element);		
		
	}


}
