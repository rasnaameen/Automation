package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
 
public WebDriver driver;//webdriver initialization,declared globally in order to use everywhere.
	public void initializeBrowser()
	{
		driver=new ChromeDriver();//declaring the browser class
		//driver=new FirefoxDriver();//declaring in Firefoxdriver
		driver.get("https://selenium.qabible.in/");//getMethod is used to launch the url,getMethod is defined in webdriver
		driver.manage().window().maximize();//used to maximize the window.
		
	}
	public void driverCloseAndQuit()
	{
		//driver.close();-is used to close the latest window
		driver.quit();//is used to close all the windows.
	}

	public static void main(String[] args) 
	{
		Base base=new Base();
		base.initializeBrowser();
		base.driverCloseAndQuit();
		

	}

}
