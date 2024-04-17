package com.qa.saucedemo.tests;

import com.qa.saucedemo.utils.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

	@DataProvider
	public Object[][] getProductDetails() {
		return ExcelUtil.getTestData("testdata");
	}

	@Test(priority = 1)
	public void loginTest() {
		this.loginPage.doLogin(this.prop.getProperty("incorrectusername").trim(), this.prop.getProperty("password").trim());
	}
}

