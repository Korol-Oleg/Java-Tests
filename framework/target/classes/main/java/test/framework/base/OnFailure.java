package test.framework.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;

public class OnFailure extends TestListenerAdapter{
	@Override
	public void onTestFailure(final ITestResult tr) {
		makeScreenshot(BaseTest.driver);
	}

	@Attachment
	public byte[] makeScreenshot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

}
