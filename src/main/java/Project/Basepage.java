package Project;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Basepage {
	public WebDriver driver;
	@BeforeClass
	public void Tolauch()
	{
		driver = new ChromeDriver();
		Reporter.log("Browser is launched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximize", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
	}
	@BeforeMethod
	public void basepage() throws IOException
	{
		driver.get("http://localhost:8080/Eizitech_Quiz1/");
		Reporter.log("Navigate to url", true);
		pompage lp=new pompage(driver);
		lp.getTourbutton().click();
		lp.getAdminbuttton().click();
		lp.getUsernametextfield().sendKeys(lp.getData("Sheet1", 1, 1));
		lp.getPasswordtextfield().sendKeys(lp.getData("Sheet1", 2, 1));
		lp.getSubmitbutton().click();
		

}


}
