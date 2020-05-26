package JavaSessions;

import java.util.ArrayList;

public class Browser {

	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> Listofplugins;
	
	public Browser(String browserName, String vendorName, double currentVersion, ArrayList<String> Listofplugins) {

		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.Listofplugins = Listofplugins;
	}

	public Browser(String browserName, double currentVersion) {
		
		this.browserName = browserName;
		this.currentVersion = currentVersion;
	}
	
	public String getBrowserName()
	{
		return this.browserName;
	}
	public String getVendorName()
	{
		return this.vendorName;
	}
	public double getCurrentVersion()
	{
		return this.currentVersion;
	}
	public ArrayList<String> getlistname()
	{
		return this.Listofplugins;
	}

	

	
	
	
	
 	
}
