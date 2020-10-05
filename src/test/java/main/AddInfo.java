package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddInfo {

	
	WebDriver driver ;
	
	By checkout = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]");
	By firstname= By.id("first-name");
	By lastname = By.id("last-name");
	By postalcode = By.id("postal-code");
	By Continue = By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input");
		
	public  AddInfo (WebDriver driver)
	{
		 
       this.driver=driver ;	
    }

	
	public void checkout () throws Exception

	
	{
		
	driver.findElement(checkout).click();
	Thread.sleep(500);
	
	}
	
	
	public void firstname () throws Exception
	
	{
		driver.findElement(firstname).sendKeys("Arpit");
		Thread.sleep(500);
		
	
	}
	
	
	public void lastname () throws Exception
	
	{
	
		driver.findElement(lastname).sendKeys("Lahoti");
		Thread.sleep(500);
		
	}
	
	
	public void postlacode () throws Exception
	
	{
		
	driver.findElement(postalcode).sendKeys("2196");
	Thread.sleep(500);
	
	}
	
	

	public void Continue () throws Exception

	
	{
		
	driver.findElement(Continue).click();
	Thread.sleep(500);
	
	}
	
}
