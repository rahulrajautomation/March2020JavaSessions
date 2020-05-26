package OOP_Abstract;

public abstract class Page {
	
	public Page()
	{
		System.out.println("Page default cons");
	}

	public abstract void header();
	public abstract void title();
	
	public void getPageInfo()
	{
		System.out.println("Page getpageinfo");
	}

}
