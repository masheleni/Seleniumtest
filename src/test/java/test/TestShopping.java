package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.page.Page;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import main.AddInfo;
import main.AddProducts;
import main.FinishOrder;
import main.Login;
import main.VerifyShoppingCart;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Capabilities;



public class TestShopping {
	
	WebDriver driver;
	
	

	@BeforeTest
	public void setup() throws Exception 
	{
	
		
	//	DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("ignoreProtectedModeSettings", true);

		
		
	/*	//Define desired capabilities
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				
				//Chrome option  
				ChromeOptions options = new ChromeOptions();
				options.merge(cap);
				options.setHeadless(true);
				
				//Hub URL
				String huburl ="http://172.18.132.145:4444/wd/hub";
				 
				// Create driver with hub address and capability
				WebDriver driver=new RemoteWebDriver(new URL(huburl), options);*/
		
		//DesiredCapabilities cap = new DesiredCapabilities();
		  MutableCapabilities cap = new MutableCapabilities();
		  cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		  cap.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		options.setHeadless(true);
		
		String huburl = "http://172.18.132.145:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(huburl), options);
		
		
		 driver.get("https://www.saucedemo.com/");
		

		
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
  // driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.manage().window().maximize();
   Thread.sleep(2000);
   
   

	}

	@Test(priority=0, description = "Adding login details")
	
	public void Login () throws Exception

	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Login login = PageFactory.initElements(driver,Login.class);
		Thread.sleep(2000);
		login.Loginintoswaglabs("uid", "pass");
	
	
	}
	
	@Test(priority=1, description = "Adding product into cart")

	public void addproducts() throws Exception

	{
		AddProducts addproducts = PageFactory.initElements(driver, AddProducts.class);
		addproducts.addingproducts("fp", "sp", "cp");

	
		boolean ActualTitle = driver.getPageSource().contains("Sauce Labs Backpack");		
		Assert.assertTrue(ActualTitle, "Expected product not found");
		System.out.println("Assert Passed");

		boolean ActualTitle1 = driver.getPageSource().contains("Sauce Labs Bike Light");
        Assert.assertTrue(ActualTitle1, "Expected product not found");
        System.out.println("Assert Passed");
	
	}
	
	@Test(priority=2, description = "Adding personal information")

	public void addinfo() throws Exception

	{
		AddInfo adding = PageFactory.initElements(driver, AddInfo.class);
	adding.addinginfo("uname", "pwd", "code1");

	
	}
	
	@Test(priority = 3, description = "Verifying total in cart")

	public void verifytotal() throws Exception {
		VerifyShoppingCart total = new VerifyShoppingCart(driver);
		total.verifycart();

	}
	

	@Test(priority = 4, description = "Confirming the order")
	public void finishorder() throws Exception

	{
		FinishOrder finishorder = new FinishOrder(driver);

		finishorder.confirmorder();
		
		boolean ActualTitle1 = driver.getPageSource().contains("THANK YOU FOR YOUR ORDER");
        Assert.assertTrue(ActualTitle1, "Expected title not found");
        System.out.println("Assert Passed");
	}
	
	
        @AfterTest
        public void endSession()
        {
		driver.quit();
        }
	

}