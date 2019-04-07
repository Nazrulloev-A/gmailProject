package WebPageLocatons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clik5thOne {
	
	public clik5thOne (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@class='listing-results-price text-price'][contains(text(),'£650,000')]")
	public WebElement clickthe5th;
	
	

}
