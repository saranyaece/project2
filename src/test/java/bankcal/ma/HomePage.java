package bankcal.ma;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PageObject.LandingPage;
import resources.base;

public class HomePage extends base{
	@BeforeTest
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		driver.get("https://tools.anz.co.nz/home-loans/repayment-calculator/");
	}
	
@Test()
	public void basePageNavigation() throws IOException
	{

	
		
		LandingPage l=new LandingPage(driver);
		
		l.getpersonal().sendKeys("8000");
		l.getcs().click();
		l.getget().click();
		l.getapply().click();		
				
		
	}
@AfterTest
public void teardown()
{
driver.close();	
}

}




