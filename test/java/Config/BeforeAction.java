package Config;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Establishment.Login.testCase.CsvReader;

public class BeforeAction {
	WebDriver driver;
	
	public WebDriver Beforeaction(WebDriver driver) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
		  driver = new ChromeDriver();
		  CsvReader dataPerson = new CsvReader();
		  driver.get(dataPerson.ReadURL());
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  return driver;
	}
}
