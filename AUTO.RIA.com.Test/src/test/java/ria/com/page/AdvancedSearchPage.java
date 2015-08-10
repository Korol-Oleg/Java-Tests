package ria.com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import ria.com.tests.TestSuiteBase;
import ru.yandex.qatools.allure.annotations.Step;

public class AdvancedSearchPage extends TestSuiteBase 
{
	public WebDriver driver;

    public AdvancedSearchPage(WebDriver driver) 
    {
        this.driver = driver;
    }
    
    @FindBy(className = "i-tt-cars-1")
    private WebElement sedan;
    
    @FindBy(id = "psmarka-0")
    private WebElement mark;
    
    @FindBy(id = "psmodel-0")
    private WebElement model;
    
    @FindBy(id = "fromYears-0")
    private WebElement yearFrom;
    
    @FindBy(id = "toYears-0")
    private WebElement yearTo;
    
    @FindBy(id = "state-0")
    private WebElement region;
    
    @FindBy(id = "city-0")
    private WebElement city;
    
    @FindBy(id = "priceFrom")
    private WebElement priceFrom;
    
    @FindBy(id = "priceTo")
    private WebElement priceTo;
    
    @FindBy(xpath = "//a[@data-id = 'categories']")
    private WebElement carTypeFilter;
    
    @FindBy(xpath = "//a[@data-id = 'bodystyle-extended-0']")
    private WebElement carSubTypeFilter;
    
    @FindBy(xpath = "//a[@data-id = 'psmarka-0']")
    private WebElement markFilter;
    
    @FindBy(xpath = "//a[@data-id = 'psmodel-0']")
    private WebElement modelFilter;
    
    @FindBy(xpath = "//a[@data-id = 'yearRange-0']")
    private WebElement yearsFilter;
    
    @FindBy(xpath = "//a[@data-id = 'state-0']")
    private WebElement stateFilter;
    
    @FindBy(xpath = "//a[@data-id = 'city-0']")
    private WebElement cityFilter;
    
    @FindBy(xpath = "//a[@data-id = 'range-price']")
    private WebElement priceFilter;
    
    @FindBy(id = "formSubmit")
    private WebElement formSubmitButton;
    
    
    @Step("Проверка выбора типа машины")
    public void verifyCarType(String type) {
    	Assert.assertTrue(carTypeFilter.getText().contains(type), "Не засетаплен тип "+type);
    } 
    
    @Step("Выбираем кузов: \"{0}\"")
    public void sedanClick(String name){
      	sedan.click();
    }
    
    @Step("Проверка выбора кузова машины")
    public void verifyCarSubType(String type) {
    	Assert.assertTrue(carSubTypeFilter.getText().contains(type), "Не засетаплен кузов "+type);
    } 
  
    @Step("Выбираем марку: \"{0}\"")
    public void selectMark(String name, String value){
      	new Select(mark).selectByValue(value);
    }
    
    @Step("Проверка выбора марки машины")
    public void verifyMark(String type) {
    	Assert.assertTrue(markFilter.getText().contains(type), "Не засетаплена марка "+type);
    }
    
    @Step("Выбираем модель: \"{0}\"")
    public void selectModel(String name, String value){
      	new Select(model).selectByValue(value);
    }
    
    @Step("Проверка выбора модели машины")
    public void verifyModel(String type) {
    	Assert.assertTrue(modelFilter.getText().contains(type), "Не засетаплена модель "+type);
    }
    
    @Step("Выбираем год: от \"{0}\" до \"{1}\"")
    public void selectYears(String valueFrom, String valueTo){
      	new Select(yearFrom).selectByValue(valueFrom);
      	new Select(yearTo).selectByValue(valueTo);
    }
    
    @Step("Проверка выбора годов машины")
    public void verifyYears(String type) {
    	Assert.assertTrue(yearsFilter.getText().contains(type), "Не засетаплен год "+type);
    }
    
    @Step("Выбираем регион: \"{0}\"")
    public void selectRegion(String name, String value){
      	new Select(region).selectByValue(value);
    }
    
    @Step("Проверка выбора области машины")
    public void verifyRegion(String type) {
    	Assert.assertTrue(stateFilter.getText().contains(type), "Не засетаплена область "+type);
    }
    
    @Step("Выбираем город: \"{0}\"")
    public void selectCity(String name, String value){
      	new Select(city).selectByValue(value);
    }
    
    @Step("Проверка выбора города")
    public void verifyCity(String type) {
    	Assert.assertTrue(cityFilter.getText().contains(type), "Не засетаплен город "+type);
    }
    
    @Step("Выбираем цену: от \"{0}\" до \"{1}\"")
    public void inputPrice(String valueFrom, String valueTo){
      	priceFrom.sendKeys(valueFrom);
      	priceTo.sendKeys(valueTo);
    }
    
    @Step("Проверка выбора цены машины")
    public void verifyPrice(String type) {
    	Assert.assertTrue(priceFilter.getText().contains(type), "Не засетаплена цена "+type);
    }
    
    @Step("Нажимаем поиск")
    public void searchClick(){
      	formSubmitButton.click();
    }
    
    
}