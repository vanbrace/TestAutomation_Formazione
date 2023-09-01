package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Esercizio3_1Steps {
    WebDriver driver = new ChromeDriver();
    @Given("I have my browser opened on {string}")
    public void i_have_my_browser_opened_on(String string) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imaiorino\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.navigate().to("https://google.com");
    }
    @And("I accept the cookies")
    public void i_accept_the_cookies() {
        driver.findElement(By.id("L2AGLb")).click();
    }
    @When("I enter a text in the search box")
    public void i_enter_a_text_in_the_searchbox() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
        Thread.sleep(2000);
    }
    @And("I press enter")
    public void i_press_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("I have navigated to the search result page")
    public void i_have_navigated_to_the_search_result_page() {
        System.out.println("Atterrata sulla pagina");
    }

}
