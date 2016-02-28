package test.framework.base;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;
import test.framework.pages.SamplePage;

public class BaseStep {
	
	private Map<String, String> mySearch = new SamplePage().SEARCH;
	private Map<String, String> myResult = new SamplePage().RESULT;
	
	protected Map<String, Map<String, String>> pageMap = new HashMap<>();
	{
		pageMap.put("SearchPage", mySearch);
		pageMap.put("ResultPage", myResult);
	}
	
	protected WebElement getElement(String page, String elementName) {
		WebElement el = BaseTest.driver.findElement(By.xpath(pageMap.get(page).get(elementName)));
		BaseTest.wait.until(ExpectedConditions.visibilityOf(el));
		return el;
	}

	protected WebElement getDynamicElement(String page, String elementName, String id) {
		WebElement el = BaseTest.driver.findElement(By.xpath(String.format(pageMap.get(page).get(elementName), id)));
		BaseTest.wait.until(ExpectedConditions.visibilityOf(el));
		return el;
	}

	@Step("Click on element \"{1}\" on page \"{0}\"")
	public void ClickTheElement(String page, String elementName) {
		getElement(page, elementName).click();
	}
	
	@Step("Click on element \"{1}\" on page \"{0}\"")
	public void ClickTheDynamicElement(String page, String elementName, String dynamic) {
		getDynamicElement(page, elementName, dynamic).click();
	}

	@Step("Type text \"{2}\" in element \"{1}\" on page \"{0}\"")
	public void TypeTheElement(String page, String elementName, String text) {
		getElement(page, elementName).clear();
		getElement(page, elementName).sendKeys(text);
		getElement(page, elementName).sendKeys(Keys.ENTER);
	}
}
