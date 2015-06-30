package auto.ria.com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {
	
	 protected static WebDriver driver;
	
	 @BeforeTest
	 void SetUp() 
	 {
		driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://auto.ria.com/");
	 }
	   
	 @AfterTest
	 void TearDown()
	 {       
        driver.quit();
     }

}
