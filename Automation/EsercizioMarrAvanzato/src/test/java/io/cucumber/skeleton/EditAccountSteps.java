package io.cucumber.skeleton;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.EditAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditAccountSteps {
    WebDriver driver;
    EditAccount edit;
    String path = "C:\\Users\\imaiorino\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        driver.close();
        driver.quit();
    }

    @Given("Browser is open on the homepage")
    public void browser_is_open_on_the_homepage() {
        driver.navigate().to("https://magento.softwaretestingboard.com/");
    }
    @And("^User is logged in with credentials (.*) and (.*)$")
    public void user_is_logged_in_with_credentials(String email, String password) throws InterruptedException {
        edit = new EditAccount(driver);
        edit.signInPage();
        edit.loginUser(email, password);
        edit.clickLogin();
        Thread.sleep(2000);
    }
    @When("Users clicks on My Account")
    public void users_clicks_on_my_account(){
        edit.linkToEdit();
    }
    @And("clicks on edit")
    public void clicks_on_edit() throws InterruptedException {
        edit.clickOnEdit();
        Thread.sleep(2000);

    }
    @And("^User changes the information about (.*), (.*), (.*), (.*) and (.*)$")
    public void user_changes_the_information(String name, String surname, String newEmail, String actualPassword, String newPassword) throws InterruptedException {
        edit.changeInformation(name, surname, newEmail, actualPassword, newPassword);
        Thread.sleep(3000);
    }
    @And("clicks on save")
    public void clicks_on_save() throws InterruptedException {
        edit.save();
        Thread.sleep(3000);
    }
    @Then("User is logged to the home page with a recapitulation of the new information")
    public void user_is_logged_to_the_home_page_with_a_recapitulation_of_the_new_information() throws InterruptedException {
        edit.checkCreationIsCorrect();
        System.out.println("Edit corretto");
    }
}