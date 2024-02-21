package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BasePage {
	public WebDriver driver;
	WebDriverWait wait;
  
    @BeforeClass
    public void setUp() throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Downloads\\Entrata\\entrata\\src\\driver\\msedgedriver.exe");
 
        //add your driver extension in "src\\driver\\chromedriver.exe" this folder
        
        // code here
        
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        // Set the preference to enable personalization data consent
        Map<String, Object> prefs = new LinkedHashMap<>();
        prefs.put("user_experience_metrics.personalization_data_consent_enabled", true);
        options.setExperimentalOption("prefs", prefs);
        
        // code here
        
        
        WebDriver driver = new EdgeDriver(options);
       
        try {
        	 driver.get("https://www.entrata.com/");
            driver.manage().window().maximize();
            // Locate and click the "Accept Cookies" button
            System.out.println(" to accept cookie");
            driver.findElement(By.xpath("//button[contains(text(), 'Accept Cookies')]")).click();  // to accept the cookie
            System.out.println(" to accept done");
    
        } catch (Exception e) {e.printStackTrace();}
        
       
        wait=new WebDriverWait(driver,Duration.ofSeconds(30));    
    
    }

}
