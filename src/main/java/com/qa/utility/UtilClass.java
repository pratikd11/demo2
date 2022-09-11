package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class UtilClass extends TestBase
{
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void takeSS(String name)
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\admin\\Pictures\\Screenshots";
		File des = new File(path+name+System.currentTimeMillis()+".png");
		try 
		{
			FileHandler.copy(src, des);
		}
		catch (IOException e) 
		{
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
