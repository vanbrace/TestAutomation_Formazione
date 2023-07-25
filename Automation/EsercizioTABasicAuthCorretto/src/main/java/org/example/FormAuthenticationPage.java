package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationPage {
    private WebDriver driver;

    private By usernameBox = By.id("username");
    private By passwordBox = By.id("password");
    private By confirmButton = By.cssSelector("button.radius[type='submit']");
    private By logOutButton = By.xpath("//i[contains(text(),'Logout')]");

    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    //Metodo che inserisce username, password e conferma
    public void login(String username, String password){
        try {
            driver.findElement(usernameBox).sendKeys(username);
            driver.findElement(passwordBox).sendKeys(password);
            driver.findElement(confirmButton).click();

            // Controllo se l'accesso è avvenuto con successo
            if (isLoginSuccessful()) {
                System.out.println("Accesso riuscito per l'utente: " + username);
            } else {

                throw new Exception("Username o password errati. Accesso non riuscito.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // Metodo per controllare se l'accesso è avvenuto con successo
    private boolean isLoginSuccessful() {
        try {
            WebElement logoutButton = driver.findElement(logOutButton);
            return logoutButton.isDisplayed();
        } catch (NoSuchElementException e) {
            return false; // Pulsante di logout non trovato, l'accesso non è riuscito.
        }
    }



}