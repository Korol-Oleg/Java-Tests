package test.framework.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	public static WebDriver driver;
	private Properties Config = new Properties();
	public static WebDriverWait wait;

	@BeforeClass
	protected void SetUp() throws IOException {

		InputStream istream = BaseTest.class.getClassLoader().getResourceAsStream("selenium.properties");
		Config.load(istream);
		GetDriver(Config.getProperty("driver"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Long.parseLong(Config.getProperty("waiter")));
	}

	@AfterClass
	protected void TearDown() {
		driver.quit();
	}

	private void GetDriver(String name) {
		switch (name) {
		case "Firefox":
			WebDriver drFf = new FirefoxDriver();
			driver = new EventFiringWebDriver(drFf);
			break;
		case "IE":
			WebDriver drIE = new InternetExplorerDriver();
			driver = new EventFiringWebDriver(drIE);
			break;
		case "Chrome":
			WebDriver drCh = new ChromeDriver();
			driver = new EventFiringWebDriver(drCh);
			break;
		}
	}
}