package test.framework.tests;

import org.testng.annotations.Test;
import test.framework.base.BaseTest;
import test.framework.steps.SampleStep;

public class SampleTest extends BaseTest {
	
	private SampleStep sample = new SampleStep();
	
	@Test
	public void SearchTest(){
		driver.get("https://www.google.com");
		
		sample.TypeTheElement("SearchPage", "txtSearch", "QA");
		sample.VerifyElement("ResultPage", "lnkResultItem");
	}

}
