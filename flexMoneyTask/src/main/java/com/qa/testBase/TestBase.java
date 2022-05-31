package com.qa.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.qa.pageLayer.HomePage;

public class TestBase 
{
	public static WebDriver driver;
	public static HomePage h;
	String key = "webdriver.chrome.driver";
	String value = "E:\\VelocityTraining\\SetUp\\ChromeDriver_Selenium\\chromedriver.exe";
	String URL ="https://staging.instacred.me/simulation/tpsl/e2e-transaction.jsp";
	@BeforeSuite
	public void browserLaunch()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		h=new HomePage();
		int bac;
	}
}
