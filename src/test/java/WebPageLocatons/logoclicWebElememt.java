package WebPageLocatons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoclicWebElememt {
	
	public logoclicWebElememt (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@class='js-lazy-loaded']")
	public WebElement logo;
	
	@FindBy(xpath=" //h1[@class='bottom-half']")
	public WebElement agentname;
	
	@FindBy(css="#content > div > p.medium.clearfix.bottom-half > span > a")
	public WebElement tel;
	
	
}
