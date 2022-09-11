package com.qa.pageLayer;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class HomePage extends TestBase
{
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='searchboxinput']")
	private WebElement search;
	
	//List <WebElement>reviews=driver.findElements(By.xpath("//body/div[@id='app-container']/div[@id='content-container']/div[@id='QA0Szd']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/span[1]/button[1]"));
	//@FindBy(xpath = "//button[contains(text(),'33,010 reviews')]")
	//private WebElement reviews;
	
	public void searchLocation()
	{

		search.sendKeys("Wankhede Stadium");
		search.sendKeys(Keys.ENTER);
	}
	/*public void getReview() 
	{
	WebElement ele = driver.findElement(By.xpath("//body/div[@id='app-container']/div[@id='content-container']/div[@id='QA0Szd']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/span[1]/button[1]"));	
		ele.click();
		ele.getText();
	}*/
	public void getReview()
	{
		List <WebElement>reviews=driver.findElements(By.xpath("//body/div[@id='app-container']/div[@id='content-container']/div[@id='QA0Szd']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/span[1]/button[1]"));
		
     for (int i=0;i<reviews.size();i++)
     {
    	 System.out.println(reviews.get(i).getText());
     }
	}

	public void verifyNumber()
	{
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='']"));	
		boolean dis = ele1.isDisplayed();
		System.out.println(dis);
	}
}
