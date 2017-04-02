package testowka;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test1 {

	 static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Danusia\\Testowanie\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
	}

	@Test(enabled = false)
	public void ShouldBePosibleToSearchTestowkaAtGoogle() throws InterruptedException {
		driver.get("https://www.google.pl/?gws_rd=ssl");
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("testowka.pl");
		
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=lst-ib]/span"));
		searchButton.click();
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (driver.findElement(By.linkText("Testowka.pl")).isDisplayed()) {
					break;
				}
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
		WebElement linkToTestowka = driver.findElement(By.linkText("Testowka.pl"));
		linkToTestowka.click();
		
		
		
		
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
