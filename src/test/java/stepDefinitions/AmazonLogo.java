package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogo {

    WebDriver driver;

    @Given("user launch chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//folkl//Desktop//java//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("user open amazon homepage")
    public void user_open_amazon_homepage() {
        driver.get("https://www.amazon.com/");
    }

    @Then("user verify that logo is present on homepage")
    public void user_verify_that_logo_is_present_on_homepage() {
        boolean status = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
    }
}
