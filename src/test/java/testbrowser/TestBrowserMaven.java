package testbrowser;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserMaven {
	public static Logger log = Logger.getLogger((TestBrowserMaven.class.getName()));


	public static void main(String[] args) {
		//maven
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		//log4j
		Date d = new Date();
		System.setProperty("current.date", d.toString().replace(" ", "_").replace(":","_"));
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		log.info("Helloo");

	}

}
