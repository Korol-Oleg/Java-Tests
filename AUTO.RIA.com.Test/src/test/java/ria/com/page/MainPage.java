package ria.com.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.allure.annotations.Step;

public class MainPage {
	
	public WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(id = "advanced-search")
    private WebElement advancedSearchButton;
    
    @Step("Кликаем расширенный поиск")
    public void AdvancedSearchClikc()
    {
    	advancedSearchButton.click();
    }
}