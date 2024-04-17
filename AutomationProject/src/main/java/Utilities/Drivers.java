package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
    public Drivers() {

    }

    public ChromeDriver getNewChrome() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tshegofatso\\Downloads\\ChromeSetup.exe");
        return new ChromeDriver();

    }


}



