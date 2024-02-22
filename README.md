# EditREADME
The framework uses:1.Java
2.Selenium
3.TestNG

In src/test/java i have created two pakages:
1.pages
2.TestCases


Under Pages pakage create BasePage.java class which consist code regarding setup browser and launch the website by providing URL
package pages.

public class BasePage {
	public WebDriver driver;
	WebDriverWait wait;
  
    @BeforeClass
    public void setUp() throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Downloads\\Entrata\\entrata\\src\\driver\\msedgedriver.exe");
 
        //add your driver extension in "src\\driver\\chromedriver.exe" this folder
        
        WebDriver driver = new EdgeDriver();
       
        try {
        	 driver.get("https://www.entrata.com/");
            driver.manage().window().maximize();
            // Locate and click the "Accept Cookies" button
            driver.findElement(By.xpath("//button[contains(text(), 'Accept Cookies')]")).click();
        } catch (Exception e) {e.printStackTrace();}
        
       
        wait=new WebDriverWait(driver,Duration.ofSeconds(30));
    
    }

}

Then create TestCase pakage. In that pakage create EntratatestCase.java file where we have to write our actuall test cases.
This EntratatestCase.java file includes 4 test cases.
1. validating "watchdemo" button
2.  validating the base camp tab and then by clicking on "RegisterNow" tab it will fill up the personal information form  by provinding addtional details line above test case and click on "Next" button.
3.  validating the the resource tab
4.  Entratalogovalidation

Note: 1) used driver version is 123
      2) drivers exe file are loacated in src/driver folder.
      3) create testng.xml file in testrunner folder




