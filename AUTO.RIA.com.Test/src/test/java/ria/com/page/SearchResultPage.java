package ria.com.page;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import ria.com.tests.TestSuiteBase;
import ru.yandex.qatools.allure.annotations.Step;

public class SearchResultPage extends TestSuiteBase {
	
	public WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    
    //Хлебные крошки
    
    @FindBy(id = "breadcrumbs")
    private WebElement breadCrumbs;
    
    /*@FindBys({@FindBy(xpath = "//span[@itemprop = 'title']")})
    private List<WebElement> BreadCrumbs;
    
    @FindBy(xpath = "//a[@title = 'Продажа автомобилей']/span")
    private WebElement bazarAvtoLink;
    
    @FindBy(xpath = "//span[text() = 'Поиск авто']")
    private WebElement searchAvtoLink;
    
    @FindBy(xpath = "//span[text() = 'Легковые']")
    private WebElement carTypeLink;
    
    @FindBy(xpath = "//span[text() = 'Audi']")
    private WebElement carMarkLink;
    
    @FindBy(xpath = "//span[text() = 'A6']")
    private WebElement carModelLink;*/
    
    //Элементы красной формы
	
    @FindBy(xpath = "//span[@data-id = 'leftFilterCategory']")
    private WebElement carTypeFilter;
    
    @FindBy(xpath = "//span[@data-id = 'bodystyle-0']")
    private WebElement carSubTypeFilter;
    
    @FindBy(xpath = "//span[@data-id = 'psmarka-0']")
    private WebElement markFilter;
    
    @FindBy(xpath = "//span[@data-id = 'psmodel-0']")
    private WebElement modelFilter;
    
    @FindBy(xpath = "//span[@data-id = 'yearRange-0']")
    private WebElement yearsFilter;
    
    @FindBy(xpath = "//span[@data-id = 'state-0']")
    private WebElement stateFilter;
    
    @FindBy(xpath = "//span[@data-id = 'city-0']")
    private WebElement cityFilter;
    
    @FindBy(xpath = "//span[@data-id = 'leftFilterPriceRange']")
    private WebElement priceFilter;
    
    //Элементы бокового поиска
    
    @FindBy(id = "leftFilterCategory")
    private WebElement leftTypeFilter;
    
    @FindBy(xpath = "//div[@class = 'selected grey block item-pseudoselect']/span")
    private WebElement leftSubTypeFilter;
    
    @FindBy(id = "psmarka-0")
    private WebElement leftMarkFilter;
    
    @FindBy(id = "psmodel-0")
    private WebElement leftModelFilter;
    
    @FindBy(id = "fromYears-0")
    private WebElement leftYearFromFilter;
    
    @FindBy(id = "toYears-0")
    private WebElement leftYearToFilter;
    
    @FindBy(id = "leftFilterPriceFrom")
    private WebElement leftPriceFromFilter;
    
    @FindBy(id = "leftFilterPriceTo")
    private WebElement leftPriceToFilter;
    
    @FindBy(id = "state-0")
    private WebElement leftStateFilter;
    
    @FindBy(id = "city-0")
    private WebElement leftCityFilter;
    
    //Элементы поисковой выдачи
    
    @FindBys({@FindBy(xpath = "//div[@class = 'item ticket-title']/a[@class = 'address']")})
    private List<WebElement> resultSearchModelAndMarkAndYear;
    
    @FindBys({@FindBy(xpath = "//div[@class = 'location']/a")})
    private List<WebElement> resultSearchCityAndRegion;
    
    @FindBys({@FindBy(xpath = "//strong[@class = 'green']")})
    private List<WebElement> resultSearchPrice;
    
    //Элементы страницы
    
    @FindBy(xpath = "//a[text() = 'Следующая']")
    private WebElement nextPageButton;
    
    @FindBy(xpath = "//div[@class = 'ticket-item paid'][2]//div[@class = 'item ticket-title']/a[@class = 'address']")
    private WebElement addvertSeccond;
    
    
    
    @Step("Проверка хлебных крошек: \"{0}\"")
    public void verifyBreadCrumbs(String crumbs) 
    {
    	Assert.assertEquals(breadCrumbs.getText(), crumbs, "Не совпадают хлебние крошки, ожидали ["+crumbs+"] получили ["+breadCrumbs.getText()+"]");
    }
    	
    	/*Assert.assertTrue(bazarAvtoLink.isDisplayed(), "Не отображается хлебная крошка Базар авто");
    	Assert.assertTrue(searchAvtoLink.isDisplayed(), "Не отображается хлебная крошка Поиск авто");
    	Assert.assertTrue(carTypeLink.isDisplayed(), "Не отображается хлебная крошка Легковые");
    	Assert.assertTrue(carMarkLink.isDisplayed(), "Не отображается хлебная крошка Audi");
    	Assert.assertTrue(carModelLink.isDisplayed(), "Не отображается хлебная крошка A6");
    	
    	for(WebElement crumbs : BreadCrumbs)
    	{
    		if(crumbs.getText().equals(bazar) || crumbs.getText().equals(avtoSearch) || crumbs.getText().equals(avtoType)
    				|| crumbs.getText().equals(avtoSubType) || crumbs.getText().equals(mark) || crumbs.getText().equals(model)
    				|| crumbs.getText().equals(""))
    		{
    			Assert.assertTrue(true);
    		}
    		else{Assert.assertTrue(false);}
    	}*/ 
    
    //Проверка параметров в красной форме
    
    @Step("Проверка в красной форме параметра цены: \"{0}\"")
    public void verifyRedSearchFormPrice(String price) {
    	Assert.assertTrue(priceFilter.getAttribute("data-name").contains(price), "Не отображается цена авто " +price);
    }
    
    @Step("Проверка в красной форме параметра марка: \"{0}\"")
    public void verifyRedSearchFormMark(String mark) {
    	Assert.assertTrue(markFilter.getAttribute("data-name").contains(mark), "Не отображается марка авто " +mark);
    } 
    
    @Step("Проверка в красной форме параметра модель: \"{0}\"")
    public void verifyRedSearchFormModel(String model) {
    	Assert.assertTrue(modelFilter.getAttribute("data-name").contains(model), "Не отображается модель авто " +model);
    } 
    
    @Step("Проверка в красной форме параметра год: \"{0}\"")
    public void verifyRedSearchFormYears(String years) {
    	Assert.assertTrue(yearsFilter.getAttribute("data-name").contains(years), "Не отображается год авто " +years);
    } 
	
    @Step("Проверка в красной форме параметра регион: \"{0}\"")
    public void verifyRedSearchFormState(String state) {
    	Assert.assertTrue(stateFilter.getAttribute("data-name").contains(state), "Не отображается регион авто " +state);
    } 
	
    @Step("Проверка в красной форме параметра город: \"{0}\"")
    public void verifyRedSearchFormCity(String city) {
    	Assert.assertTrue(cityFilter.getAttribute("data-name").contains(city), "Не отображается город авто " +city);
    } 
    
    @Step("Проверка в красной форме параметра тип: \"{0}\"")
    public void verifyRedSearchFormType(String type) {
    	Assert.assertTrue(carTypeFilter.getAttribute("data-name").contains(type), "Не отображается тип авто " +type);
    } 
	
    @Step("Проверка в красной форме параметра кузов: \"{0}\"")
    public void verifyRedSearchFormSubType(String subType) {
    	Assert.assertTrue(carSubTypeFilter.getAttribute("data-name").contains(subType), "Не отображается подтип авто " +subType);
    } 
	
    //Проверка параметров в боковой форме
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormType(String type, String value) 
    {
    	Assert.assertEquals(leftTypeFilter.getAttribute("value"), value,  "Не отображается тип авто " +type);
    }
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormSubType(String subType) 
    {
    	Assert.assertTrue(leftSubTypeFilter.getText().contains(subType), "Не отображается кузов авто " +subType);
    }
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormMark(String mark, String value) 
    {
    	Assert.assertEquals(leftMarkFilter.getAttribute("value"), value,  "Не отображается марка авто " +mark);
    } 
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormModel(String model, String value) 
    {
    	Assert.assertEquals(leftModelFilter.getAttribute("value"), value,  "Не отображается модель авто " +model);
    }
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormYearFrom(String year) 
    {
    	Assert.assertEquals(leftYearFromFilter.getAttribute("value"), year,  "Не отображается год авто от " +year);
    }
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormYearTo(String year) 
    {
    	Assert.assertEquals(leftYearToFilter.getAttribute("value"), year,  "Не отображается год авто до " +year);
    }
    
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormPriceFrom(String priceFrom) 
    {
    	Assert.assertTrue(leftPriceFromFilter.getAttribute("value").contains(priceFrom), "Не отображается цена авто от " +priceFrom);
    } 
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormPriceTo(String priceTo) 
    {
    	Assert.assertTrue(leftPriceToFilter.getAttribute("value").contains(priceTo), "Не отображается цена авто до " +priceTo);
    } 
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormState(String state, String value) 
    {
    	Assert.assertEquals(leftStateFilter.getAttribute("value"), value,  "Не отображается регион авто " +state);
    }
    
    @Step("Проверка в боковой форме параметра:  \"{0}\"")
    public void verifyLeftSearchFormCity(String city, String value) 
    {
    	Assert.assertEquals(leftCityFilter.getAttribute("value"), value,  "Не отображается город авто " +city);
    }
    
    //Проверяем в поисковой выдаче
    
    @Step("Проверка в поисковой выдаче параметра:  \"{0}\"")
    public void verifySearchResultMark(String mark) 
    {
    	for(WebElement markList: resultSearchModelAndMarkAndYear)
    	{
    		Assert.assertTrue(markList.getAttribute("title").contains(mark), "Не отработал фильтр марка авто " +mark);
    	}
    }
    
    @Step("Проверка в поисковой выдаче параметра:  \"{0}\"")
    public void verifySearchResultModel(String model) 
    {
    	for(WebElement modelList: resultSearchModelAndMarkAndYear)
    	{
    		Assert.assertTrue(modelList.getAttribute("title").contains(model), "Не отработал фильтр модель авто " +model);
    	}
    }
    
    @Step("Проверка в поисковой выдаче параметра:  \"{0}\" \"{1}\"")
    public void verifySearchResultYear(int yearFrom, int yearTo) 
    {
    	for(WebElement yearList: resultSearchModelAndMarkAndYear)
    	{
    		int year = Integer.parseInt(yearList.getText().substring(yearList.getText().length()-4, yearList.getText().length()));
    		if(year >= yearFrom & year <= yearTo)
    		{
    			Assert.assertTrue(true);
    		}
    		else
    		{
    			Assert.assertTrue(false, "Не отработал фильтр год авто от " +yearFrom+ " до " +yearTo);
    		}
    	}
    }
	
    @Step("Проверка в поисковой выдаче параметра:  \"{0}\"")
    public void verifySearchResultState(String state) 
    {
    	for(WebElement stateList: resultSearchCityAndRegion)
    	{
    		Assert.assertTrue(stateList.getAttribute("title").contains(state), "Не отработал фильтр регион авто " +state);
    	}
    }
    
    @Step("Проверка в поисковой выдаче параметра:  \"{0}\"")
    public void verifySearchResultCity(String city) 
    {
    	for(WebElement cityList: resultSearchCityAndRegion)
    	{
    		Assert.assertTrue(cityList.getText().contains(city), "Не отработал фильтр город авто " +city);
    	}
    }
    
    @Step("Проверка в поисковой выдаче параметра:  \"{0}\" \"{1}\"")
    public void verifySearchResultPrice(int priceFrom, int priceTo) 
    {
    	for(WebElement priceList: resultSearchPrice)
    	{
    		int price = Integer.parseInt(priceList.getText().replaceAll("\\s",""));
    		if(price >= priceFrom & price <= priceTo)
    		{
    			Assert.assertTrue(true);
    		}
    		else
    		{
    			Assert.assertTrue(false, "Не отработал фильтр цена авто от" +priceFrom+ " до " +priceTo);
    		}
    	}
    }
    
    //Переход на страницу 2
    
    @Step("Переход на страницу 2")
    public void nextPageClick() 
    {
    	nextPageButton.click();
    }
    
    @Step("Переход на второе объявление")
    public void addwertSeccondClick() 
    {
    	addvertSeccond.click();
    }
    
    
    
}