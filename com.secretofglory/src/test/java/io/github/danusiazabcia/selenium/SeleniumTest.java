package io.github.danusiazabcia.selenium;

import org.junit.BeforeClass;
import org.junit.Test;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;

@Config(browser = Browser.FIREFOX, url = "http://seleniumhq.org")

public class SeleniumTest extends Locomotive {

	@BeforeClass
	public static void beforetests(){
		System.setProperty("webdriver.gecko.driver", "D:\\Danusia\\Testowanie\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		
		
	}
	@Test
	public void testDownloadLinkExists() {
		validatePresent(HomePageSelenium.LOC_LNK_DOWNLOADSELENIUM);
	}

	@Test
	public void testTabsExist() {
		 validatePresent(HomePageSelenium.LOC_LNK_PROJECTSTAB)
	        .validatePresent(HomePageSelenium.LOC_LNK_DOWNLOADTAB)
	        .validatePresent(HomePageSelenium.LOC_LNK_DOCUMENTATIONTAB)
	        .validatePresent(HomePageSelenium.LOC_LNK_SUPPORTTAB)
	        .validatePresent(HomePageSelenium.LOC_LNK_ABOUTTAB)
	        ;
	}

}
