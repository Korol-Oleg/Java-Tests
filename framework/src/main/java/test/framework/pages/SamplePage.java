package test.framework.pages;

import java.util.HashMap;
import java.util.Map;

public class SamplePage {
	
	public Map<String, String> SEARCH = new HashMap<String, String>();
	{
		SEARCH.put("txtSearch", "//input[@name = 'q']");
	}
	
	public Map<String, String> RESULT = new HashMap<String, String>();
	{
		RESULT.put("lnkResultItem", "//h3/a[text() = 'Тест QA (Quality Assurance) - Quizful']");
	}

}
