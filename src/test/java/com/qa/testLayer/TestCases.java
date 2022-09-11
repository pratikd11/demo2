package com.qa.testLayer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;

public class TestCases extends TestBase
{
	@Test
	public void verifyLocation() throws InterruptedException
	{
		h.searchLocation();
		Thread.sleep(3000);
		h.getReview();
		Thread.sleep(3000);
		h.verifyNumber();
		Thread.sleep(3000);
	}
}
