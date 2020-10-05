package main;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyShoppingCart  {

	WebDriver driver;
	
	
	public VerifyShoppingCart (WebDriver driver2) {
		driver = driver2;
	}
	
	public void verifycart()
	
	{
	float fprice = 0 ;
	float sprice = 0;
	
	
	List<WebElement> elem = driver.findElements(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]"));
		        for(WebElement li:elem)
		        {
		            System.out.println(li.getText());
		            String firstprice = li.getText();
		            firstprice = firstprice.replace("$", "");
		            fprice = Float.parseFloat(firstprice);
		        }

		        
		        List<WebElement> elem1 = driver.findElements(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[4]/div[2]/div[2]"));

		        for(WebElement li1:elem1)
		        {
		        	
		            System.out.println(li1.getText());
		            String secondprice = li1.getText();
		            secondprice = secondprice.replace("$", "");
		            sprice = Float.parseFloat(secondprice);
		            
		        }

		        float total = fprice + sprice;
		        
		            
		            System.out.println("Total is:"+total);
		            assertEquals(total, 39.98f);
		            
		        }
	}
		
		