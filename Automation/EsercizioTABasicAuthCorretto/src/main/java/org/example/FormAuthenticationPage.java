package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage {
    private WebDriver driver;

    private By usernameBox = By.id("username");
    private By passwordBox = By.id("password");
    private By confirmButton = By.cssSelector("button.radius[type='submit']");

    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    //Metodo che inserisce username, password e conferma
    public void login(String username, String password){
        driver.findElement(usernameBox).sendKeys(username);
        driver.findElement(passwordBox).sendKeys(password);
        driver.findElement(confirmButton).click();
    }

}
