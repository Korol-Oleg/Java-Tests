package auto.ria.com.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "marks")
	private WebElement marksAuto;
	@FindBy(id = "models")
	private WebElement modelAuto;
	@FindBy(id = "regionCenters")
	private WebElement regionCentersAuto;
	@FindBy(id = "year")
	private WebElement yearAuto;
	@FindBy(id = "yearTo")
	private WebElement yearToAuto;
	@FindBy(id = "priceFrom")
	private WebElement priceFromAuto;
	@FindBy(id = "priceTo")
	private WebElement priceToAuto;
	@FindBy(xpath = ("//span[@class='checkrows']/label"))
	private WebElement checkPhoto;
	@FindBy(xpath = ("//button[@type='submit']"))
	private WebElement submitButton;
	
	
	public void selectMark(String mark)
	{
		marksAuto.click();
		marksAuto.sendKeys(mark);
		marksAuto.sendKeys(Keys.ENTER);
	}
	
	public void selectModel(String model)
	{
		modelAuto.click();
		modelAuto.sendKeys(model);
		modelAuto.sendKeys(Keys.ENTER);
	}
	
	public void selectRegion(String region)
	{
		regionCentersAuto.click();
		regionCentersAuto.sendKeys(region);
		regionCentersAuto.sendKeys(Keys.ENTER);
	}
	
	public void inputYear(String year)
	{
		yearAuto.click();
		yearAuto.sendKeys(year);
		yearAuto.sendKeys(Keys.ENTER);
	}
	
	public void inputYearTo(String yearTo)
	{
		yearToAuto.click();
		yearToAuto.sendKeys(yearTo);
		yearToAuto.sendKeys(Keys.ENTER);
	}
		
	public void inputPriceFrom(String priceFrom)
	{
		priceFromAuto.sendKeys(priceFrom);
	}
	
	public void inputPriceTo(String priceTo)
	{
		priceToAuto.sendKeys(priceTo);
	}
	
	public void chkPhoto()
	{
		checkPhoto.click();
	}
	
	public void clickSubmit()
	{
		submitButton.click();
	}
}
