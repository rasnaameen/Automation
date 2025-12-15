package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{
	public void verifyWebElementCommand()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("new message");
		
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage.click();
		
	}

	public static void main(String[] args) 
	{
		WebElementCommands elements=new WebElementCommands();
		elements.initializeBrowser();
		elements.verifyWebElementCommand();
		

	}

}
