package tv.beatmaker;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class SecondTest {
    @Test
    void SecondTest()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/Asus/Documents/GitHub/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");

        driver.findElementByName("username").sendKeys("admin");
        driver.findElementByName("password").sendKeys("admin");
        driver.findElementByName("login").click();

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("My Store"));
        driver.quit();
    }

}