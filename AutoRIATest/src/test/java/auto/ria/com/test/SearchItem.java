package auto.ria.com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchItem {
	
	@FindBy(xpath = "//div[@class='price-at-rate']/span[2]")
	public WebElement ticketPriceAuto;
	@FindBy(xpath = "//div[@class='header']/a")
	public WebElement mainPageLink;
	
}
