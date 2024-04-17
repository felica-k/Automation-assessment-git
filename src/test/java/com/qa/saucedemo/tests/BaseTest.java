package com.qa.saucedemo.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.saucedemo.data.DriverFactory;
import com.qa.saucedemo.application.CheckoutPage;
import com.qa.saucedemo.application.InformationPage;
import com.qa.saucedemo.application.LoginPage;
import com.qa.saucedemo.application.OrderHistoryPage;
import com.qa.saucedemo.application.OrderPage;
import com.qa.saucedemo.application.ProductsPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	Properties prop;
	LoginPage loginPage;
	ProductsPage productPage;
	CheckoutPage checkoutPage;
	InformationPage infoPage;
	OrderPage orderPage;
	OrderHistoryPage orderHistory;
	
	@BeforeClass
	public void setup() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		loginPage = new LoginPage(driver);
		productPage = new ProductsPage(driver);
		checkoutPage = new CheckoutPage(driver);
		infoPage = new InformationPage(driver);
		orderPage = new OrderPage(driver);
		orderHistory = new OrderHistoryPage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
}
