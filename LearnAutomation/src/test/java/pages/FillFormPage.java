package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FillFormPage {
	
	WebDriver driver;
	
	FillFormPage(WebDriver driver){
		this.driver = driver;		
	}
	
/*	@FindBy(name="firstname") WebElement firstName;
	
	
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
		
	}
*/
	
	@FindBy(id="userName") 
	@CacheLookup
	private WebElement username;
	
	        
	public void setFirstName(String strUsername){
		
		username.sendKeys(strUsername);		
	}
	
	
	
}
