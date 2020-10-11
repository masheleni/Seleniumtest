package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	WebDriver driver ;
	
	public  Login (WebDriver driver)
	{
		 
       this.driver=driver ;	
	}
		
		@FindBy(id="user-name")
		@CacheLookup
		WebElement username;
		
		@FindBy(xpath= "//*[@id=\"password\"]")
		@CacheLookup
		WebElement password;
		
		@FindBy(id="login-button")
		@CacheLookup
		WebElement loginbutton;

		public void Loginintoswaglabs(String uid,String pass) throws Exception
		
		{ 
			
			username.sendKeys("standard_user");	
			password.sendKeys("secret_sauce");	
			loginbutton.click();	
		}

	}
