package eiziexecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Project.Basepage;
import Project.pompage;

public class funpositivelogin extends Basepage {
	@Test(dataProvider="cred")
	public void Tologin (String names1,String pass1) throws Throwable {
		
		pompage lp=new pompage(driver);
		lp.getLogout().click();
		lp.getUsernametextfield().sendKeys(names1);
		Thread.sleep(2000);
	    lp.getPasswordtextfield().sendKeys(pass1);
	    Thread.sleep(2000);
		driver.quit();
	}
	
	@DataProvider(name="cred")
	public String[][] senddata(){
		String[][] data={
		                 {"abcd@eizitech.com","Bswetha@1994"},
		                 {"swetha78@eizitech.com", "Bswetha@1994"},
		                 {"$%!@eizitech.com","Bswetha@1994"}
		                 
		};
		return data;
		
	}

}
