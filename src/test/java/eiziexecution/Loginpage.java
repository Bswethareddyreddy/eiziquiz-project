package eiziexecution;




import org.testng.annotations.Test;

import Project.Basepage;
import Project.pompage;

public class Loginpage extends Basepage{
	@Test
	public void clickAdmin() throws Throwable {
		pompage lp=new pompage(driver);
		lp.getTourbutton().click();
		lp.getAdminbuttton().click();
		lp.getUsernametextfield().sendKeys("swethacamma@gmail.com");
		lp.getPasswordtextfield().sendKeys("Bswetha@1994");
		lp.getSubmitbutton().click();
		
		
	}

}
