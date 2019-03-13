package ScartchFramework;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){

        driver = new FirefoxDriver();
        driver.get("http://admin-demo.skhan.com/");
        driver.manage().window().maximize();
    }
    public static void stop(){

        driver.quit();
    }
}
