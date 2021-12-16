package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	By personal=By.id("LoanAmount");
	By cs=By.className("spinning");
	By get=By.className("js-CallToAction");
	By apply=By.id("next");
	
	
	
	//<a href="https://onlinestore.anz.co.nz/get/home-loan" class="js-CallToAction btn btnSecondary small">Get started</a>
	
	public LandingPage( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;		

}	
	

	

	public WebElement getpersonal()

	{
		return driver.findElement(personal);
	}
	
	public WebElement getcs()
	{
		return driver.findElement(cs);
	}
	public WebElement getget()
	{
		return driver.findElement(get);
	}
	public WebElement getapply()
	{
		return driver.findElement(apply);
	}
	
	
	
}

