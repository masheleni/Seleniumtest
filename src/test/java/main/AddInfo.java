package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddInfo {

	
	WebDriver driver ;

	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/a[2]")
	WebElement checkout;
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id ="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code") 
	WebElement code;
	
	@FindBy(xpath ="/html/body/div/div[2]/div[3]/div/form/div[2]/input")
	WebElement Continue;

	public void addinginfo (String uname,String pwd, String code1) throws Exception
	
	{
		checkout.click();
		Thread.sleep(1000);
		firstname.sendKeys("Arpit");
		Thread.sleep(1000);
		lastname.sendKeys("Lahoti");
		Thread.sleep(1000);
		code.sendKeys("2196");
		Thread.sleep(1000);
		Continue.click();
		Thread.sleep(1000);
		
		
	}

	
}
