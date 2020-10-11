package main;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddProducts {

	WebDriver driver;

	
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	WebElement firstproduct;
	
	@FindBy (xpath ="/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")
	WebElement Secondproduct;

	@FindBy (id="shopping_cart_container")
	WebElement cart;
	
	public void addingproducts(String fp, String sp,String cp) throws Exception
	
	{
		firstproduct.click();
		Thread.sleep(2000);
		Secondproduct.click();
		Thread.sleep(2000);
		cart.click();
		Thread.sleep(2000);
		
	}

}
