package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


	//WebDriver driver = new ChromeDriver ();
	
	WebDriver driver ;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
		By username= By.id("user-name");
		By password= By.xpath("//*[@id=\"password\"]");
		By loginbutton= By.id("login-button");
		
	
		public  Login (WebDriver driver)
		{
			 
	       this.driver=driver ;	
	    }
	
		
		public void typeusername () throws Exception
		
		{
			driver.findElement(username).sendKeys("standard_user");
			Thread.sleep(500);
			
		}
		
		public void typepassword () throws Exception
		
		{
		
			driver.findElement(password).sendKeys("secret_sauce");
			Thread.sleep(500);
			
		}
		
		
		public void Clickonlogin () throws Exception
		
		{
			
		driver.findElement(loginbutton).click();
		Thread.sleep(500);
		//System.out.println("Login is successful");
		
	
		}
		

	}
