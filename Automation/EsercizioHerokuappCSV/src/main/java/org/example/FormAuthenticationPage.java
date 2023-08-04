package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormAuthenticationPage {
    private WebDriver driver;

    private By usernameBox;
    private By passwordBox;
    private By confirmButton;
    private By logOut;
    private By logOutButton;
    List<By> locatorDataList;

    public FormAuthenticationPage(WebDriver driver, List<By> locatorDataList){
        this.driver = driver;
        System.out.println("LocatorDataList size: " + locatorDataList.size());

        for (By locator : locatorDataList) {
            String locatorType = getLocatorType(locator);
            String locatorValue = getLocatorValue(locator);

            if (locatorValue.contains("username")) {
                usernameBox = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("password")) {
                passwordBox = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("submit")) {
                confirmButton = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("logout")) {
                logOut = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Logout")) {
                logOutButton = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            }
            }
        }

    private String getLocatorType(By locator) {
        String locatorString = locator.toString();
        return locatorString.split(":")[0].substring(3);
    }

    private String getLocatorValue(By locator) {
        String locatorString = locator.toString();
        return locatorString.split(":")[1].trim();
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

    public void logOut(){
        if(isLoginSuccessful())
        {driver.findElement(logOut).click();}
        else
            System.out.println("Non è possibile effettuare il logout");
    }

}