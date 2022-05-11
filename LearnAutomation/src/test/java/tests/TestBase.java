package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver = null;
	@BeforeSuite
	public void init() {
		
		String driverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//chrome//chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		//String url = "https://www.toolsqa.com/automation-practice-form/";
		String url = "http://10.151.32.152:8081/elitesmp/login.do";		    
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
