package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishOrder {

	WebDriver driver;
	
	By Finishorder = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]");
	

	public FinishOrder(WebDriver driver2) {
		driver = driver2;
	}
public void confirmorder () throws Exception

{
	driver.findElement(Finishorder).click();
	Thread.sleep(500);

}}