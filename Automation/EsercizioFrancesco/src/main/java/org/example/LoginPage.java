package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class LoginPage {

    private By btn_signIn = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]");
    private By txt_email = By.id("email");
    private By txt_password = By.id("pass");
    private By btn_login = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]/span[1]");
    private By btn_correctLogin = By.xpath("//header/div[1]/div[1]/ul[1]/li[1]/span[1]");
    protected WebDriver driver;
    String email;
    String password;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void signInPage(){
        driver.findElement(btn_signIn).click();
    }

    public void loginUser(String email, String password) {
        driver.findElement(txt_email).sendKeys(email);
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(btn_login).click();
    }

    public void checkLoginIsCorrect() {
//        try {
//            driver.findElement(btn_correctLogin).isDisplayed();
//        } catch (NoSuchElementException e) {
//            System.out.println("LOGIN NON RIUSCITA");
//        }
        boolean actualAnswer = driver.findElement(btn_correctLogin).isDisplayed();
        assertEquals(true, actualAnswer);
    }
}