package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Application.Login2.driver;

public class Products {
    public static WebElement Item1(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/h3/a"));
    }

    public static void Item1() {
        Item1(driver).click();

    }

    public static void ColorOption() {
        WebElement select = driver.findElement(By.xpath("//*[@id=\"pa_color\"]"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("Black".equals(option.getText().trim())) {
                option.click();
                break;
            }
        }

    }

    public static void SizeOption() {
        WebElement select = driver.findElement(By.xpath("//*[@id=\"pa_color\"]"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("Large".equals(option.getText().trim())) {
                option.click();
                break;
            }
        }
    }

    public static void ColorOption2() {
        WebElement select = driver.findElement(By.xpath("//*[@id=\"pa_color\"]"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("Black".equals(option.getText().trim())) {
                option.click();
                break;
            }
        }

    }

    public static void SizeOption2() {
        WebElement select = driver.findElement(By.xpath("//*[@id=\"pa_size\"]"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("34".equals(option.getText().trim())) {
                option.click();
                break;
            }
        }
    }
}

