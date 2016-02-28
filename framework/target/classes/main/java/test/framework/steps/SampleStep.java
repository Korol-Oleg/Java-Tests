package test.framework.steps;

import test.framework.base.BaseStep;
import org.testng.Assert;

public class SampleStep extends BaseStep {

	public void VerifyElement(String page, String el) {
		Assert.assertTrue(getElement(page, el).isDisplayed());
	}

}
