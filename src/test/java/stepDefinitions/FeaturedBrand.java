package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FeaturedBrand {

    public WebDriver driver;

    @Given("user open amazon homepage")
    public void user_open_amazon_homepage() {
        System.setProperty("webdriver.chrome.driver", "C://Users//folkl//Desktop//java//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        }

    @When("user chooses category")
    public void user_chooses_category() {
        WebElement category = driver.findElement(By.xpath("//*[@aria-label='Computers & Accessories']"));
        category.click();
    }

    @And("chooses featured brand")
    public void chooses_featured_brand() {
        WebElement brand = driver.findElement(By.xpath("//*[text() = 'Roku']"));
        brand.click();
    }

    @Then("user verify that displayed products have the selected brand")
    public void user_verify_that_displayed_products_have_the_selected_brand() {
        List<WebElement> results = driver.findElements(By.xpath("//*[@class = 'a-size-base-plus a-color-base a-text-normal']"));

        boolean found = false;
        for (WebElement result : results) {
            if (result.getText().toUpperCase().contains("ROKU")) {
                found = true;
            }
        }
        Assert.assertTrue(found);
    }

    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
