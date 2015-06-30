package auto.ria.com.test;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ResultPage {
	
	@FindBy(xpath = "//span[@class='tagging-filter' and @data-name='BMW']")
	public WebElement filterMarkAuto;
	@FindBy(xpath = "//span[@class='tagging-filter' and @data-name='���� �� 1000 �� 100000 $']")
	public WebElement filterPriceAuto;
	@FindBy(xpath = "//span[@class='tagging-filter' and @data-name='525']")
	public WebElement filterModelAuto;
	@FindBy(xpath = "//span[@class='tagging-filter' and @data-name='��� �� 1990 �� 2010']")
	public WebElement filterYearAuto;
	@FindBy(xpath = "//span[@class='tagging-filter' and @data-name='��������']")
	public WebElement filterRegionAuto;
	@FindBy(xpath = "//span[@class='tagging-filter small' and @data-name=' ������ � ����']")
	public WebElement filterPhotoAuto;
	@FindBys({ @FindBy(xpath = "//div[@class='content']/div/div[@class='item ticket-title']/a[@class = 'address']")})
	public List<WebElement> listContent;	
	@FindBy(xpath = "//div[@class='ticket-item paid'][1]//div[@class='price-ticket']/span/strong")
	public WebElement firstPriceAuto;
	@FindBy(xpath = "//div[@class='ticket-item paid'][1]//div[@class='content']/div/div[@class='item ticket-title']/a[@class = 'address']")
	public WebElement firstResultAuto;
}
