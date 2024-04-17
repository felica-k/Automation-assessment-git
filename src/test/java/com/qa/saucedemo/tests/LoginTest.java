package com.qa.saucedemo.tests;

import com.qa.saucedemo.utils.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@DataProvider
	public Object[][] getProductDetails() {
		return ExcelUtil.getTestData("testdata");
	}

	@Test(priority = 1)
	public void loginTest() {
		this.loginPage.doLogin(this.prop.getProperty("username").trim(), this.prop.getProperty("password").trim());
	}
}

