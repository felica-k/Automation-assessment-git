package com.qa.saucedemo.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.saucedemo.utils.ElementUtil;

public class LoginPage  {
	
	// 1. declare private driver
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//2. Page Constructor 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	//3. By Locators 
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	
	//4. page actions
	
	public ProductsPage doLogin(String un,String pwd) {
		System.out.println("login with : "+ un +" : "+ pwd);
		eleUtil.doSendKeys(username, un);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(loginBtn);
		
		return new ProductsPage(driver);
	}
}

