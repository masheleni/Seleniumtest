package main;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddProducts {

	WebDriver driver;
	
	
	By firstproduct= By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button");
	By Secondproduct= By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button");
	By Confirmproduct = By.id("shopping_cart_container");
	
	public AddProducts(WebDriver driver2) {
		driver = driver2;
	}

	public  void Addfirstproduct () throws InterruptedException 
	
	{
		driver.findElement(firstproduct).click();
		Thread.sleep(1000);

	}
	
	public void Addsecondproduct () throws Exception 
	
	{
	
		driver.findElement(Secondproduct).click();
		Thread.sleep(1000);
	
		}
		
	
	public void Confirmproduct () throws Exception 
	
	{
	
		driver.findElement(Confirmproduct).click();
		Thread.sleep(1000);
		
	}

	
}
