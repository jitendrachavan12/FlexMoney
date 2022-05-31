package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class PageTest extends TestBase
{
	@Test (priority=1)
	public void verifyGatway()
	{
		h.gatwaySelect();
	}
	@Test(priority=2)
	public void verifyContinueBtn()
	{
		h.continueBtnClick();
	}
	@Test (priority=3)
	public void verifyMobile()
	{
		h.enterMobile();
	}
}
