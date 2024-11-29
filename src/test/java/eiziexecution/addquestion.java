package eiziexecution;




import org.testng.annotations.Test;

import Project.Basepage;
import Project.pompage;

public class addquestion extends Basepage{
	@Test
	public void addquestions() {
		pompage lp=new pompage(driver);
		lp.getAdd_click().click();
		lp.getAddquestions().sendKeys("1. What is the capital of India?");
		lp.getOption1a().sendKeys("A: Agra");
		lp.getOption1b().sendKeys("B: New Delhi");
		lp.getOption1c().sendKeys("C: Mumbai");
		lp.getOption1d().sendKeys("D: Kolkata");
		//lp.getAnswer_a().click();
		lp.getSet_1().click();
		lp.getADD_button().click();
		
		
	}

}
