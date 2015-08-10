package ria.com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import mx4j.log.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import ria.com.base.TestBase;
import ria.com.page.*;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Parameter;
import ru.yandex.qatools.allure.annotations.Step;



public class TestSuiteBase extends TestBase {

	 public static String BASE_URL;
	 public MainPage pageMain;
	 public AdvancedSearchPage advancedSearchPage;
	 public SearchResultPage searchResultPage;
	 
	@BeforeClass
	public void geturl() {

		BASE_URL = URL.getProperty("baseUrl");
	}

	@Parameter
	public String Parametrs;

	@BeforeMethod
	public void getPage() 
	{
		pageMain = PageFactory.initElements(driver, MainPage.class);
		advancedSearchPage = PageFactory.initElements(driver, AdvancedSearchPage.class);
		searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
	}
	
	@Step("Ожидаем загрузки страницы")
	public static void sleep(long timeout){
		
		try{			
			Thread.sleep(timeout);
			
		}catch(InterruptedException e){
			
			throw new RuntimeException(e.getMessage());
		}
	}
}