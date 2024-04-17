package Application;

import Utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {
    static WebDriver driver = new ChromeDriver();

    public static void loadWebsite() {

        String url = Util.BASE_URL_STRING;
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static WebElement ClickDismiss(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/p[1]/a"));
    }

    public static void ClickOnDismiss() {
        ClickDismiss(driver).click();

    }

    public static WebElement MyAccount(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a"));
    }

    public static void ClickMyAccount() {
        MyAccount(driver).click();

    }

    public static void username(WebDriver driver, String username) {
        //driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
        WebElement userName = driver.findElement(By.id("username"));
        System.out.println("userName: " + userName);
        userName.sendKeys("Testing 234");
    }

    public static void username(String username) {
        //driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
        driver.findElement(By.id("username")).sendKeys(username);
    }

    public static void password(String password) {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }

    public static void login() {
        //driver.findElement(By.className("woocommerce-button button woocommerce-form-login__submit")).click();
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")).click();
    }
}
