package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Application.Login2.driver;

public class LogOut {
    public static WebElement LogOut(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/nav/ul/li[6]/a"));
    }

    public static void LogOut() {
        LogOut(driver).click();
    }
}
