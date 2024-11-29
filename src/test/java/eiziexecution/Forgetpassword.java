package eiziexecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project.Basepage;
import Project.pompage;

public class Forgetpassword extends Basepage {
	@Test
	public void forgetpassword() throws Throwable {
		
		pompage lp=new pompage(driver);
		lp.getForgotpassword_clickhere().click();
		lp.getEnter_emailid().sendKeys("swethacamma@gmail.com");
		Thread.sleep(3000);
		lp.getGetotp().click();
		driver.navigate().back();
		Thread.sleep(3000);
		lp.getBacktologin().click();
		
	}

}
