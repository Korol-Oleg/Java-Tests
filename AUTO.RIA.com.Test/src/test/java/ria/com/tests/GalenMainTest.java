package ria.com.tests;


import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import net.mindengine.galen.api.Galen;
import net.mindengine.galen.reports.GalenTestInfo;
import net.mindengine.galen.reports.HtmlReportBuilder;
import net.mindengine.galen.reports.model.LayoutReport;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GalenMainTest extends TestSuiteBase{

	@BeforeTest
	public void startName(){
		driver.get("http://auto.ria.com");
		driver.manage().window().setSize(new Dimension(1280, 1024));
		System.out.println("GalenTest START");
	}
	
	@AfterTest
	public void stopName(){
		System.out.println("GalenTest STOP");
	}
    @Test(enabled = true)
    public void MaintPageGalenTest() throws IOException{
        
    	
        

        LayoutReport layoutReport =       
        Galen.checkLayout(driver, "galen/auto_ria_main.spec", Arrays.asList("desktop"), null, null, null);

        List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

        GalenTestInfo test = GalenTestInfo.fromString("Check MainPage");

        test.getReport().layout(layoutReport, "check layout on desktop device");
        tests.add(test);

        new HtmlReportBuilder().build(tests, "target/galen-html-reports");
    }
}
