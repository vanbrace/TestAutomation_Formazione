package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.CreateAccountPage;

public class CreateAccountPageSteps {
    WebDriver driver;
    CreateAccountPage account;
    String path = "C:\\Users\\imaiorino\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

    @Given("Browser is open on the homepage")
    public void browser_is_open_on_the_homepage() {
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
    }
    @And("User clicks on Create an Account")
    public void user_clicks_on_create_an_account() {
        account = new CreateAccountPage(driver);
        account.startCreateAnAccount();
    }
    @When("^Users enters the information about (.*), (.*), (.*), (.*) and (.*)$")
    public void users_enters_the_required_information(String name, String surname, String email, String password, String confirmPassword) throws InterruptedException {
        account.enterName(name);
        account.enterSurname(surname);
        account.enterEmail(email);
        account.enterPass1(password);
        account.enterPass2(confirmPassword);
        Thread.sleep(2000);
    }
    @And("User clicks Create an account")
    public void user_clicks_create_an_account() {
        account.completeCreation();
    }
    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        account.checkCreationIsCorrect();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }

}
