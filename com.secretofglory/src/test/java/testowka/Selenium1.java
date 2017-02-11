package testowka;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static junit.framework.Assert.assertTrue;
public class Selenium1 {

	@Test
	
	public void driveIsTheKing(){
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://compendiumdev.co.uk/selenium");
		
		assertTrue(driver.getTitle().startsWith("Selenium Ximplified"));
			
	}
}
