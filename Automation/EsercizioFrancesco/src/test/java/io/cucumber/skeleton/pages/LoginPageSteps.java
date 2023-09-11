package io.cucumber.skeleton.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;

public class LoginPageSteps {

    WebDriver driver;
    LoginPage login;
    String url = "https://magento.softwaretestingboard.com/";
    String path = "C:\\Users\\imaiorino\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

    @Given("Browser is open on the home page")
    public void browser_is_open_on_home_page() {
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    @And("User clicks on sign in")
    public void user_clicks_on_sign_in(){
        login = new LoginPage(driver);
        login.signInPage();
    }

    @When("^User enters (.*) and (.*)$")
    public void user_enters_username_and_password(String email, String password) throws InterruptedException {
        login.loginUser(email,password);
        Thread.sleep(2000);
    }

    @And("User clicks on login")
    public void user_clicks_on_login() {
        login.clickLogin();
    }

    @Then("User is logged")
    public void user_is_logged() throws InterruptedException {
        login.checkLoginIsCorrect();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
