package ria.com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;

public class AdvancedSearchTest extends TestSuiteBase {

	@BeforeTest
	public void startName(){
		driver.get("http://auto.ria.com/advanced-search/#");
		driver.manage().window().maximize();
		System.out.println("AdvancedSearchTest START");
	}
	
	@AfterTest
	public void stopName(){
		System.out.println("AdvancedSearchTest STOP");
	}
	
	@Features("Search")
	@Test(enabled = true)
	public void test1() throws Exception{
		
		
		advancedSearchPage.sedanClick("Седан");
		advancedSearchPage.selectMark("Audi", "6");
		advancedSearchPage.selectModel("A6", "49");
		advancedSearchPage.inputPrice("5000", "19000");
		advancedSearchPage.selectYears("1995", "2014");
		advancedSearchPage.selectRegion("Киевская", "10");
		advancedSearchPage.selectCity("Киев", "10");
		
		advancedSearchPage.verifyCarType("Легковые");
		advancedSearchPage.verifyCarSubType("Седан");
		advancedSearchPage.verifyMark("Audi");
		advancedSearchPage.verifyModel("A6");
		advancedSearchPage.verifyYears("Год от 1995 до 2014");
		advancedSearchPage.verifyRegion("Киевская");
		advancedSearchPage.verifyCity("Киев");
		advancedSearchPage.verifyPrice("Цена: от 5000 до 19000");
		advancedSearchPage.searchClick();
		
		searchResultPage.verifyBreadCrumbs("Базар авто\nПоиск авто\nЛегковые\nСедан\nAudi\nA6");
		searchResultPage.verifyRedSearchFormType("Легковые");
		searchResultPage.verifyRedSearchFormSubType("Седан");
		searchResultPage.verifyRedSearchFormMark("Audi");
		searchResultPage.verifyRedSearchFormModel("A6");
		searchResultPage.verifyRedSearchFormYears("Год от 1995 до 2014");
		searchResultPage.verifyRedSearchFormPrice("Цена от 5000 до 19000 $");
		searchResultPage.verifyRedSearchFormState("Киевская");
		searchResultPage.verifyRedSearchFormCity("Киев");
		
		searchResultPage.verifyLeftSearchFormType("Легковые", "1");
		searchResultPage.verifyLeftSearchFormSubType("Седан");
		searchResultPage.verifyLeftSearchFormMark("Audi", "6");
		searchResultPage.verifyLeftSearchFormModel("A6", "49");
		searchResultPage.verifyLeftSearchFormYearFrom("1995");
		searchResultPage.verifyLeftSearchFormYearTo("2014");
		searchResultPage.verifyLeftSearchFormPriceFrom("5000");
		searchResultPage.verifyLeftSearchFormPriceTo("19000");
		searchResultPage.verifyLeftSearchFormState("Киевская", "10");
		searchResultPage.verifyLeftSearchFormCity("Киев", "10");
		
		searchResultPage.verifySearchResultMark("Audi");
		searchResultPage.verifySearchResultModel("A6");
		searchResultPage.verifySearchResultYear(1995, 2014);
		searchResultPage.verifySearchResultState("Поиск объявлений по региону Киев");
		searchResultPage.verifySearchResultCity("Киев");
		searchResultPage.verifySearchResultPrice(5000, 19000);
		
		searchResultPage.nextPageClick();
		
		searchResultPage.verifyBreadCrumbs("Базар авто\nПоиск авто\nЛегковые\nСедан\nAudi\nA6");
		searchResultPage.verifyRedSearchFormType("Легковые");
		searchResultPage.verifyRedSearchFormSubType("Седан");
		searchResultPage.verifyRedSearchFormMark("Audi");
		searchResultPage.verifyRedSearchFormModel("A6");
		searchResultPage.verifyRedSearchFormYears("Год от 1995 до 2014");
		searchResultPage.verifyRedSearchFormPrice("Цена от 5000 до 19000 $");
		searchResultPage.verifyRedSearchFormState("Киевская");
		searchResultPage.verifyRedSearchFormCity("Киев");
		
		searchResultPage.verifyLeftSearchFormType("Легковые", "1");
		searchResultPage.verifyLeftSearchFormSubType("Седан");
		searchResultPage.verifyLeftSearchFormMark("Audi", "6");
		searchResultPage.verifyLeftSearchFormModel("A6", "49");
		searchResultPage.verifyLeftSearchFormYearFrom("1995");
		searchResultPage.verifyLeftSearchFormYearTo("2014");
		searchResultPage.verifyLeftSearchFormPriceFrom("5000");
		searchResultPage.verifyLeftSearchFormPriceTo("19000");
		searchResultPage.verifyLeftSearchFormState("Киевская", "10");
		searchResultPage.verifyLeftSearchFormCity("Киев", "10");
		
		searchResultPage.verifySearchResultMark("Audi");
		searchResultPage.verifySearchResultModel("A6");
		searchResultPage.verifySearchResultYear(1995, 2014);
		searchResultPage.verifySearchResultState("Поиск объявлений по региону Киев");
		searchResultPage.verifySearchResultCity("Киев");
		searchResultPage.verifySearchResultPrice(5000, 19000);
		
		searchResultPage.addwertSeccondClick();
		
		driver.navigate().back();
		
		searchResultPage.verifyBreadCrumbs("Базар авто\nПоиск авто\nЛегковые\nСедан\nAudi\nA6");
		searchResultPage.verifyRedSearchFormType("Легковые");
		searchResultPage.verifyRedSearchFormSubType("Седан");
		searchResultPage.verifyRedSearchFormMark("Audi");
		searchResultPage.verifyRedSearchFormModel("A6");
		searchResultPage.verifyRedSearchFormYears("Год от 1995 до 2014");
		searchResultPage.verifyRedSearchFormPrice("Цена от 5000 до 19000 $");
		searchResultPage.verifyRedSearchFormState("Киевская");
		searchResultPage.verifyRedSearchFormCity("Киев");
		
		searchResultPage.verifyLeftSearchFormType("Легковые", "1");
		searchResultPage.verifyLeftSearchFormSubType("Седан");
		searchResultPage.verifyLeftSearchFormMark("Audi", "6");
		searchResultPage.verifyLeftSearchFormModel("A6", "49");
		searchResultPage.verifyLeftSearchFormYearFrom("1995");
		searchResultPage.verifyLeftSearchFormYearTo("2014");
		searchResultPage.verifyLeftSearchFormPriceFrom("5000");
		searchResultPage.verifyLeftSearchFormPriceTo("19000");
		searchResultPage.verifyLeftSearchFormState("Киевская", "10");
		searchResultPage.verifyLeftSearchFormCity("Киев", "10");
		
		searchResultPage.verifySearchResultMark("Audi");
		searchResultPage.verifySearchResultModel("A6");
		searchResultPage.verifySearchResultYear(1995, 2014);
		searchResultPage.verifySearchResultState("Поиск объявлений по региону Киев");
		searchResultPage.verifySearchResultCity("Киев");
		searchResultPage.verifySearchResultPrice(5000, 19000);
		
	}
}