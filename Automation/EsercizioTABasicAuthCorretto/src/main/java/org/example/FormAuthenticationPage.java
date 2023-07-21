package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage {
    private WebDriver driver;

    private By usernameButton = By.id("username");
    private By passwordButton = By.id("password");
    private By confirmButton = By.cssSelector("button.radius[type='submit']");

    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    //Metodo che inserisce username, password e conferma
    public void login(String username, String password){
        driver.findElement(usernameButton).sendKeys(username);
        driver.findElement(passwordButton).sendKeys(password);
        driver.findElement(confirmButton).click();
    }

}
