package testowka;

import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class Selenium1 {

	
	@Before
	
	public void before(){
		System.setProperty("webdriver.gecko.driver", "D:\\Danusia\\Testowanie\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	}
	
	@Test
	
	public void driveIsTheKing(){
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://compendiumdev.co.uk/selenium");
		
		assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
			
	}
	
	@Test
	
public void firefoxIsSupportedByWebdriver(){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://compendiumdev.co.uk/selenium");
		
		assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
		
		driver.quit();
			
	}
}
