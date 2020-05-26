package AbstractVsInterface;

public class ChromeDriver implements WebDriver {
	
	public  ChromeDriver() {
		System.out.println("Launching Google chrome");
	}

	@Override
	public void get(String URL) {
		System.out.println("launch url " +URL);		
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
