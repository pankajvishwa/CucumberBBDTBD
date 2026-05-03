package stepdefination;

import com.ea.pageobjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class POMLoginStepsDifination {
    WebDriver driver;

    @Given("user is on login page.")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }
    @When("user enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

    }
    @And("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("login-button")).click();

    }
    @Then("user should be navigated to homepage")
    public void user_should_be_navigated_to_homepage() {
        boolean isPresent = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
        Assert.assertTrue(isPresent, "login unsuccessful");
    }
    @And("close the browser.")
    public void close_the_browser() {

        driver.quit();
    }

}
