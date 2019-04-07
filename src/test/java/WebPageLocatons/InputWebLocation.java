package WebPageLocatons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputWebLocation {
	
	public InputWebLocation (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="search-input-location")
	public WebElement London;
	
	@FindBy(id="search-submit")
	public WebElement submit;

}
