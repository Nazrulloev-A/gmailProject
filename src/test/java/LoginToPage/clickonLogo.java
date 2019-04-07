package LoginToPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPageLocatons.InputWebLocation;
import WebPageLocatons.clik5thOne;
import WebPageLocatons.logoclicWebElememt;
import io.github.bonigarcia.wdm.WebDriverManager;

public class clickonLogo {
	
WebDriver driver;
	

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
		
	}

	@Test
	public void login() {
		InputWebLocation click= new InputWebLocation(driver);
		clik5thOne click5= new clik5thOne(driver);
		logoclicWebElememt logo = new logoclicWebElememt(driver);
		click.London.sendKeys("London");
		click.submit.click();
	    click5.clickthe5th.click();
	    logo.logo.click();
	    String Aname = logo.agentname.getText();
	    System.out.println(Aname);
	    String Atel = logo.tel.getText();
	    System.out.println(Atel);
	   
		
		
		
		
		
		
	}
	
	@AfterTest
	public void closeUp() {
		driver.close();
		driver.quit();
	}

}
