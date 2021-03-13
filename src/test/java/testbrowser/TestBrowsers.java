package testbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ameeraj/Selenium/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
	
		//System.setProperty("webdriver.chrome.driver", "/Users/ameeraj/Selenium/chromedriver");
		//ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "/Users/ameeraj/Selenium/chromedriver");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		//edge also present
	
		//System.setProperty("webdriver.chrome.driver", "/Users/ameeraj/Selenium/chromedriver");
		//SafariDriver driver = new SafariDriver();
		driver.get("https://www.google.com");

	}

}
