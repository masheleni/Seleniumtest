package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import main.AddInfo;
import main.AddProducts;
import main.FinishOrder;
import main.Login;
import main.VerifyShoppingCart;

public class TestShopping {

	static WebDriver driver;
	

	@BeforeTest
	public void setup() 

	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	public void main(String[] args) throws Exception {

	}

	@Test(priority=0, description = "Adding login details")

	public void Login() throws Exception

	{
		Thread.sleep(500);

		Login Login = new Login(driver);
		Login.typeusername();
		Login.typepassword();
		Login.Clickonlogin();

	}

	@Test(priority=1, description = "Adding product into cart")

	public void addproducts() throws Exception

	{

		AddProducts AddProducts = new AddProducts(driver);

		AddProducts.Addfirstproduct();
		AddProducts.Addsecondproduct();
		AddProducts.Confirmproduct();
	
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

		AddInfo addinfo = new AddInfo(driver);

		addinfo.checkout();
		addinfo.firstname();
		addinfo.lastname();
		addinfo.postlacode();
		addinfo.Continue();

	}
	
	

	@Test(priority = 3, description = "Verifying total in cart")

	public void verifytotal() {
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

		driver.quit();

	}

}