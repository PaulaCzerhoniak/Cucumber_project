package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterTest {
    public WebDriver driver;

    @BeforeSuite
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C://Users//folkl//Desktop//java//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void close() {
        driver.close();
    }
}