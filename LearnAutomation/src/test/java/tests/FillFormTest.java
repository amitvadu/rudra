package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FillFormPage;

public class FillFormTest {
	
	public WebDriver driver = null;
	
	@Test (description="Verification of Learn Automation")
	public void fillForm() {
		System.out.println("1");
		initB();
		//FillFormPage fillFormPage = PageFactory.initElements(driver, FillFormPage.class);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println("2");
		
		//fillFormPage.setFirstName("Amit Prajapati");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}
	
	public void initB() {
		//String driverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//chrome//chromedriver";
		//System.setProperty("webdriver.chrome.driver", driverPath);
		//driver = new ChromeDriver();
		
		String driverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//firefox//geckodriver";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		
		String url = "http://www.toolsqa.com/";
		
		//String url = "http://10.151.32.152:8081/elitesmp/login.do";		    
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

}
