package test_Case;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pages.BasePage;


public class EntrataTestCase extends BasePage {
	

//TestCase:1-watchvideovalidation test case click on "watchDemo" button and the fill the next form	 
		 
		 @Test(priority = 1,enabled = true,description = "validating watchDemo button")
		    public void watchDemovalidation() throws Exception {
			 
			 WebDriverWait wait= new WebDriverWait(BasePage.driver,Duration.ofSeconds(20));
			 System.out.println("before btn");
			 WebElement watchdemobtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button-default solid-dark-button'][normalize-space()='Watch Demo']")));
			watchdemobtn.click();
			System.out.println("after btn");
			 
			
			WebElement firstName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='FirstName']")));
			firstName.click();
			firstName.sendKeys("snehal");
			
			WebElement lastName= driver.findElement(By.xpath("//input[@id='LastName']"));
			lastName.click();
			lastName.sendKeys("Isankar");
			
			WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
			email.click();
			email.sendKeys("snehal11@gmail.com");
			
			WebElement companyName= driver.findElement(By.xpath("//input[@id='Company']"));
			companyName.click();
			companyName.sendKeys("ACDFHJJ");
			
			WebElement phoneNo= driver.findElement(By.xpath("//input[@id='Phone']"));
			phoneNo.click();
			phoneNo.sendKeys("8765431212");
			
//			WebElement unitcountDropdown= driver.findElement(By.xpath("//select[@id='Unit_Count__c']"));   //use of select class for dropdown
//	     	Select s=new Select(unitcountDropdown);
//     		s.selectByValue("1-10");
//			s.deselectByIndex(2);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
		
		
			WebElement jobtitle= driver.findElement(By.xpath("//input[@id='Title']"));
	     	jobtitle.click();
			jobtitle.sendKeys("Test Engineer");
			
			driver.navigate().back();
			
			 }
		 
		 
 //TestCase 2-check the sign in  
		 
		 @Test(priority = 2,enabled = true,description = "Checksign in  ")
		    public void SignIn() throws Exception {
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement Signbtn= driver.findElement(By.xpath("//a[@class='button-default outline-dark-button']"));
			Signbtn.click();
			
			WebElement propertyManager= driver.findElement(By.xpath("//a[normalize-space()='Property Manager Login']"));
			propertyManager.click();
			
			
			WebElement username= driver.findElement(By.xpath("//input[@id='entrata-username']"));
			username.click();
			username.sendKeys("snehal11@gmail.com");
			
			WebElement password= driver.findElement(By.xpath("//input[@id='entrata-password']"));
			password.click();
			password.sendKeys("ACDFHJJ");
			driver.navigate().to("https://www.entrata.com/");
			
		 }
		 
		
//TestCase 3-check the resource tab details inside that check guide section and click on download button and fill the next form navigate to main page.
		 
		 @Test(priority = 3,enabled = true,description = "Check resource tab")
		    public void resourcevalidation() throws Exception {
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 WebElement resource= driver.findElement(By.xpath("(//div[@class='main-nav-link'])[3]"));   
			resource.click();
			
			WebElement guides= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='fat-nav-links'][normalize-space()='Guides'])[1]")));
			Actions act = new Actions(driver);
			act.moveToElement(guides).click().perform();
			
			WebElement downloadbtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='all-content']//div[@class='grid-item first-grid-item']//a[@class='button-default solid-dark-button'][normalize-space()='Download Now']")));
			Actions actions = new Actions(driver);
			actions.moveToElement(downloadbtn).click().perform();
			
		
			
			WebElement firstName= driver.findElement(By.xpath("//input[@id='FirstName']"));
			firstName.click();
			firstName.sendKeys("snehal");
			
			WebElement lastName= driver.findElement(By.xpath("//input[@id='LastName']"));
			lastName.click();
			lastName.sendKeys("Isankar");
			
			WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
			email.click();
			email.sendKeys("snehal11@gmail.com");
			
			WebElement companyName= driver.findElement(By.xpath("//input[@id='Company']"));
			companyName.click();
			companyName.sendKeys("ACDFHJJ");
			
			WebElement phoneNo= driver.findElement(By.xpath("//input[@id='Phone']"));
			phoneNo.click();
			phoneNo.sendKeys("8765431212");
			
//			WebElement unitcountDropdown= driver.findElement(By.xpath("//select[@id='Unit_Count__c']"));   //use of select class for dropdown
//	     	Select s=new Select(unitcountDropdown);
//     		s.selectByValue("1-10");
//			s.deselectByIndex(2);
			
		
			WebElement jobtitle= driver.findElement(By.xpath("//input[@id='Title']"));
	     	jobtitle.click();
			jobtitle.sendKeys("Test Engineer");
		
			driver.navigate().to("https://www.entrata.com/");
			
		 }
		 
//TestCase 4-baseCampvalidation test case is validating the base camp tab and then by clicking on "RegisterNow" tab it will fill up the personal information form  by provinding addtional details line above test case and click on "Next" button
		 @Test(priority = 4,enabled = true,description = "validating the base camp tab")
	    public void baseCampvalidation() throws Exception {
			 
		WebElement basecamp= driver.findElement(By.xpath("//div[@class='header-nav-item']//a[@class='main-nav-link'][normalize-space()='Base Camp']"));
	 basecamp.click();
			 		 
		  driver.navigate().to("https://www.entrata.com/");	
		  driver.quit();
			
	 }
		 
		 
}


