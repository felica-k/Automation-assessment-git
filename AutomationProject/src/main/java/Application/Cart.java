package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Application.Login2.driver;

public class Cart {

    public static WebElement ToolsQADemoSite(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"noo-site\"]/section/div/div/div/span[1]/a/span"));
    }

    public static void ToolsQADemoSite() {
        ToolsQADemoSite(driver).click();

    }


    public static WebElement Add2Cart(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"product-1162\"]/div[1]/div[2]/form/div/div[2]/button"));
    }

    public static void Add2Cart() {
        Add2Cart(driver).click();
    }


    public static WebElement Search(WebDriver driver) {
        return driver.findElement(By.className("icon_search"));

    }

    public static void Search() {
        WebElement Search = driver.findElement(By.className("icon_search"));
        Search(driver).click();


    }

    public static WebElement Search2(WebDriver driver) {
        return Login2.driver.findElement(By.className("note-search"));


    }

    public static void Search2() {
        WebElement Search2 = driver.findElement(By.className("form-control"));
        Search2(driver).click();
        Search2.sendKeys("BLACK LUX GRAPHIC T-SHIRT");

        Search2.submit();

    }

    public static WebElement Add2Cart2(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"product-1485\"]/div[1]/div[2]/form/div/div[2]/button"));
    }

    public static void Add2Cart2() {
        Add2Cart2(driver).click();
    }
}