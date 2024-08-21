package UtilityPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BasePackage.Base;

public class Listeners extends Base implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getTestName()+" TC execution started",true);
	}
 
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC " +result.getName()+ " is", false);
		try {
			Utility3.takeScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	
	}

	}

