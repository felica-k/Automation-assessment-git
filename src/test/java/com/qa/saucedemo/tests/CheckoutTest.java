package com.qa.saucedemo.tests;

import com.qa.saucedemo.utils.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

	@DataProvider
	public Object[][] getProductDetails() {
		return ExcelUtil.getTestData("testdata");
	}

	@Test(priority = 1)
	public void loginTest() {
		this.loginPage.doLogin(this.prop.getProperty("username").trim(), this.prop.getProperty("password").trim());
	}

	@Test(priority = 2, dataProvider = "getProductDetails")
	public void verifyItemTotalTest(String product1, String product2, String fName, String lName, String zip) {
		System.out.println(product1 + " " + product2);
		String item1Price = this.productPage.clickOnAddToCart(product1);
		System.out.println(item1Price);
		String item2Price = this.productPage.clickOnAddToCart(product2);
		System.out.println(item2Price);
		double actualItemTotal = Double.parseDouble(item1Price) + Double.parseDouble(item2Price);
		this.productPage.clickCartIcon();
		this.checkoutPage.clickOnChekout();
		this.infoPage.yourInformation(fName, lName, zip);
		String itemTotal = this.orderPage.getItemTotal();
	}
}
