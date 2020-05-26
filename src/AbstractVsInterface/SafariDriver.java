package AbstractVsInterface;

public class SafariDriver implements WebDriver {
	
	public  SafariDriver() {
		System.out.println("Launching Safari driver");
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
