package auto.ria.com.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "marks")
	public WebElement marksAuto;
	@FindBy(id = "models")
	public WebElement modelAuto;
	@FindBy(id = "regionCenters")
	public WebElement regionCentersAuto;
	@FindBy(id = "year")
	public WebElement yearAuto;
	@FindBy(id = "yearTo")
	public WebElement yearToAuto;
	@FindBy(id = "priceFrom")
	public WebElement priceFromAuto;
	@FindBy(id = "priceTo")
	public WebElement priceToAuto;
	@FindBy(xpath = ("//span[@class='checkrows']/label"))
	public WebElement checkPhoto;
	@FindBy(xpath = ("//button[@type='submit']"))
	public WebElement submitButton;
	
	
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
