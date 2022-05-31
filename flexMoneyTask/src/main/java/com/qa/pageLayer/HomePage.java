package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase{
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='GID']")
	private WebElement gatway;
	
	@FindBy(xpath="//button[@id='continueBtn']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//input[@id='paymentEnterMobile']")
	private WebElement mobileText;
	
	public void gatwaySelect()
	{
		Select s=new Select(gatway);
		s.selectByVisibleText("Cashfree");
	}
	
	public void continueBtnClick()
	{
		continueBtn.click();		
	}
	public void enterMobile()
	{
		mobileText.sendKeys("9988998899");		
	}

}
