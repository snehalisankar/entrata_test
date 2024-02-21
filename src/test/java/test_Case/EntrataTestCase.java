package test_Case;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pages.BasePage;


public class EntrataTestCase extends BasePage {
	

//TestCase:1-watchvideovalidation test case click on "watchDemo" button and the fill the next form	 
		 
		 @Test(priority = 1,enabled = true,description = "validating watchDemo button")
		    public void watchDemovalidation() throws Exception {
			 
			 System.out.println("before btn");
			WebElement watchdemobtn= driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[1]"));
			System.out.println("after btn");
			watchdemobtn.click();
			
			WebElement firstName= driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
			firstName.click();
			firstName.sendKeys("snehal");
			
			WebElement lastName= driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
			lastName.click();
			lastName.sendKeys("Isankar");
			
			WebElement email= driver.findElement(By.xpath("//input[@id=\"Email\"]"));
			email.click();
			email.sendKeys("snehal11@gmail.com");
			
			WebElement companyName= driver.findElement(By.xpath("//input[@id=\"Company\"]"));
			companyName.click();
			companyName.sendKeys("ACDFHJJ");
			
			WebElement phoneNo= driver.findElement(By.xpath("//input[@id=\"Phone\"]"));
			phoneNo.click();
			phoneNo.sendKeys("8765431212");
			
			WebElement unitcountDropdown= driver.findElement(By.xpath("//select[@id=\"Unit_Count__c\"]"));   //use of select class for dropdown
			Select s=new Select(unitcountDropdown);
			s.selectByValue("1-10");
			
			WebElement jobtitle= driver.findElement(By.xpath("//input[@id=\"Title\"]"));
			jobtitle.click();
			jobtitle.sendKeys("Test Engineer");
			
			driver.navigate().back();
			
			 }
		 
//TestCase 2-baseCampvalidation test case is validating the base camp tab and then by clicking on "RegisterNow" tab it will fill up the personal information form  by provinding addtional details line above test case and click on "Next" button
		 @Test(priority = 2,enabled = true,description = "validating the base camp tab")
		    public void baseCampvalidation() throws Exception {
			 
			WebElement basecamp= driver.findElement(By.linkText("Base Camp"));
			 basecamp.click();

			 WebElement registernow= driver.findElement(By.className("text-block-18"));    
			 registernow.click();
			 driver.navigate().back();
			 
		 }
 //TestCase 3-check the resource tab 
		 
		 @Test(priority = 3,enabled = true,description = "Check resource tab")
		    public void resourcevalidation() throws Exception {
			WebElement resource= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div/div[2]/div[3]/a"));
			resource.click();
			driver.navigate().back();
		 }
		 
		 
//TestCase 4- Entratalogovalidation test case validate the logo of Entrata is displayed or not
			
			@Test(priority =4,enabled = true,description = "Entratalogovalidation")
		    public void Entratalogovalidation() throws Exception {
				 WebElement i = driver.findElement
					      (By.className("landing-logo"));
		  // Javascript executor to check image
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 Boolean p = (Boolean) js.executeScript("return arguments[0].complete \" + \"&& typeof arguments[0].naturalWidth != \\\"undefined\\\" \" + \"&& arguments[0].naturalWidth > 0", i);
			
					      //verify if status is true
					      if (p) {
					         System.out.println("Logo present");
					      } else {
					         System.out.println("Logo not present");
					      }
					      String ActualTitle = driver.getTitle();
					      String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
					      assertEquals(ActualTitle, ExpectedTitle);          //use of assert for validation point
					      driver.navigate().back();
					      driver.close();
			}
}


