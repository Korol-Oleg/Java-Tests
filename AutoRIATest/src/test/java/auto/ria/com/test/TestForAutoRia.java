package auto.ria.com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.Assert;


public class TestForAutoRia extends BasePage {
	
	@Test(priority=1)
	public void TestStep1() 
	{
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.selectMark("BMW");
		home.selectModel("525");
		home.selectRegion("Киев");
		home.inputYear("1990");
		home.inputYearTo("2010");
		home.inputPriceFrom("1000");
		home.inputPriceTo("100000");
		home.chkPhoto();
		home.clickSubmit();
	}

	@Test(priority=2)
	public void TestStep2() 
	{	
		//Проверяем правильность поисковой выдачи...
		ResultPage res = PageFactory.initElements(driver, ResultPage.class);
		
		Assert.assertTrue(res.filterMarkAuto.isDisplayed());		
		Assert.assertTrue(res.filterModelAuto.isDisplayed());
		Assert.assertTrue(res.filterRegionAuto.isDisplayed());		
		Assert.assertTrue(res.filterYearAuto.isDisplayed());
		Assert.assertTrue(res.filterPriceAuto.isDisplayed());		
		Assert.assertTrue(res.filterPhotoAuto.isDisplayed());
		Assert.assertTrue(res.listContent.size()==10);
				
		for(WebElement carModel : res.listContent )
		{
			Assert.assertTrue(carModel.getAttribute("title").contains("BMW 525"));		
		}
		
		SearchItem ticketItem = PageFactory.initElements(driver, SearchItem.class);
		
		
		
		String priceInResult = res.firstPriceAuto.getText();
		res.firstResultAuto.click();
		String priceInTicket = ticketItem.ticketPriceAuto.getText();
		
		if(priceInResult.equals(priceInTicket))
		{
			System.out.println("Цены совпадают");
			driver.navigate().back();
		}
		else
		{
			System.out.println("Цены не совпадают");
			ticketItem.mainPageLink.click();
		}
	}
}
