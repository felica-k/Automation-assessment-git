import Application.Cart;
import Application.Login2;
import Application.Products;
import Utilities.Credential;
import Utilities.Drivers;
import com.poiji.bind.Poiji;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.List;

public class CompleteOrder {

    private WebDriver webDriver;
    private Drivers drivers;
    private WebDriver driver;

    @BeforeTest
    public void reset() {
        drivers = new Drivers();
        webDriver = drivers.getNewChrome();
    }

    @Test
    public void execute() {
        ClassLoader classLoader = runTests.class.getClassLoader();
        URL resource = classLoader.getResource("Data.xlsx");
        assert resource != null;
        List<Credential> Credential = Poiji.fromExcel(new File(resource.getPath()), Credential.class);
        try {
            Login2.loadWebsite();
            Login2.ClickOnDismiss();
            Login2.ClickMyAccount();
            Thread.sleep(3000);

            Login2.username(Credential.get(1).getUserName());
            Login2.password(Credential.get(1).getPassword());
            Login2.login();
            Cart.ToolsQADemoSite();
            Cart.Search();
            Cart.Search2();
            Products.ColorOption2();
            Products.SizeOption2();
            Cart.Add2Cart2();

            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


    }


}


