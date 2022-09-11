package com.qa.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.qa.pageLayer.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public  static WebDriver driver;
	public HomePage h;
	@BeforeClass
	public void start()
	{
		
	}
	@AfterClass
	public void stop()
	{
		
	}
	@Parameters("browser")  
	@BeforeMethod
	public void setup()
	{
		String br ="chrome";
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please Enter valid browser name");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/maps/");
		h = new HomePage();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
