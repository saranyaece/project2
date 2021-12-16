package bankcal.ma;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomeLoan;

import resources.base;

public class bnz extends base{
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		driver.get("https://www.bnz.co.nz/");
	}
	@Test()
	public void basePageNavigation() throws IOException
	{
       HomeLoan l=new HomeLoan(driver);
	   l.gethomeloan().click();	
		l.getrepayments().click();
		l.getslider().click();
	
	// WebElement move= l.getslideMove();
	
	WebElement getslider = l.getslider();
	
	Actions actions=new Actions(driver);
	actions.dragAndDropBy(getslider, -100, 0).build().perform();
     WebElement value=l.value();
     System.out.print(value);
     l.getapply().click();
	
	}
	
		
	
	@AfterTest
	public void teardown()
	{
	driver.close();	
	}

}
