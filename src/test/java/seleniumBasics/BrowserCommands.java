package seleniumBasics;

public class BrowserCommands extends Base
{
	
	public void verifyBrowserCommand()
	{
		String title=driver.getTitle();
		
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String source=driver.getPageSource();
		System.out.println(source);
		String id=driver.getWindowHandle();
		System.out.println(id);
		
	}
	
	 public void verifyNavigationCommands()
	 {
		 driver.navigate().to("https://www.amazon.in/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
	 }

	public static void main(String[] args) 
	{
		BrowserCommands browser=new BrowserCommands();
		browser.initializeBrowser();
		//browser.verifyBrowserCommand();
		browser.verifyNavigationCommands();
		

	}

}
