package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testbase.TestBase;

public class Listeners1 extends TestBase implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("TestCase execution started : " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("TestCase passed : " +result.getName());
		UtilClass.takeSS(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("TestCase failed : " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("TestCase skipped : " +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}
	
}
