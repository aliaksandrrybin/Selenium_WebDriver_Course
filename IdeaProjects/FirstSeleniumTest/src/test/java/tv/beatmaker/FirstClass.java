package tv.beatmaker;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


class FirstClass {

    @Test
    void firstTest()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/Asus/Documents/GitHub/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
    driver.get("https://beatmaker.tv/");
    String title = driver.getTitle();
    Assert.assertTrue(title.equals("Основная площадка продажи/покупки битов в СНГ"));
    driver.quit();
    }

}
