package LoginToPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPageLocatons.InputWebLocation;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintoPage {
	
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
		click.London.sendKeys("London");
		click.submit.click();
		
		
		List<WebElement> listElement = driver.findElements(By.tagName("a"));
		for(int i =0;i<listElement.size();i++) {
		 String elementText = listElement.get(i).getText(); 
		 System.out.println(elementText); 
		}
		
		
	}
	
	@AfterTest
	public void closeUp() {
		driver.close();
		driver.quit();
	}
	
}
