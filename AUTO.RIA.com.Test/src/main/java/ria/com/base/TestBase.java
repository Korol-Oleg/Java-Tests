package ria.com.base;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ru.stqa.selenium.factory.WebDriverFactory;

public class TestBase {

	public RemoteWebDriver driver;
	public Properties URL = null;
	public DesiredCapabilities capability;
	public String id_user;
	
	
	@BeforeTest
	public void initialize() throws Exception {
		
			URL = new Properties();			
			FileInputStream baseUrl = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/URL.properties");
			URL.load(baseUrl);
		}
	
	@BeforeMethod
	@Parameters({ "browser", "os" })
	@BeforeTest
	public void setUp(@Optional("firefox") String browser, @Optional("LINUX") String os, final ITestContext context) throws Exception {
		
			
			if (browser.equalsIgnoreCase("firefox")) {
				
				System.out.println("OPENING FIREFOX");
				capability = DesiredCapabilities.firefox();
				capability.setBrowserName("firefox");
				capability.setPlatform(Platform.valueOf(os));

			}
			else if (browser.equalsIgnoreCase("chrome")) 
			
			{
				
				System.out.println("OPENING CHROME");
				  capability = DesiredCapabilities.chrome();	
			      ChromeOptions options = new ChromeOptions();
			      options.addArguments("test-type");
			      capability.setCapability(ChromeOptions.CAPABILITY, options);
			      capability.setBrowserName("chrome");
			      capability.setPlatform(Platform.LINUX);

			} else if (browser.equalsIgnoreCase("opera")) 
			
			{
				
				System.out.println("OPENING OPERA");
				capability = DesiredCapabilities.opera();
				capability.setCapability("opera.binary", "C:\\Program Files\\Opera x64\\opera.exe");
				capability.setBrowserName("opera");
				capability.setPlatform(Platform.WINDOWS);
				
			} else if (browser.equalsIgnoreCase("internet explorer")) 
				
				{
					
				System.out.println("OPENING INTERNET EXPLORER");
				capability = DesiredCapabilities.internetExplorer();
				capability.setBrowserName("internet explorer");
				capability.setPlatform(Platform.WINDOWS);
				
				} 

//			this.driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			this.driver = (RemoteWebDriver) WebDriverFactory.getDriver("http://localhost:4444/wd/hub", capability);
			context.setAttribute("driverKey", driver);
			driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	@AfterSuite
	public void BrowserQuit() {

		WebDriverFactory.dismissAll();
		System.out.println("CLOSE BROWSER");
	}
}
