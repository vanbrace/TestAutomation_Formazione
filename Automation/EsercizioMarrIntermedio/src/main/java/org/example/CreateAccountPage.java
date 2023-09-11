package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class CreateAccountPage {
    WebDriver driver;
    By btn_CreateAnAccount1 = By.xpath("//header/div[1]/div[1]/ul[1]/li[3]/a[1]");
    By txt_name = By.id("firstname") ;
    By txt_surname = By.id("lastname");
    By txt_email = By.id("email_address");
    By txt_password = By.id("password");
    By txt_passwordConfirmation = By.id("password-confirmation");
    By btn_CreateAnAccount2 = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");
    By btn_correctCreation = By.xpath("//div[contains(text(),'Thank you for registering with Main Website Store.')]") ;


    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public void startCreateAnAccount(){
        driver.findElement(btn_CreateAnAccount1).click();
    }

    public void enterName(String name){
        driver.findElement(txt_name).sendKeys(name);
    }

    public void enterSurname(String surname){
        driver.findElement(txt_surname).sendKeys(surname);
    }

    public void enterEmail(String email){
        driver.findElement(txt_email).sendKeys(email);
    }

    public void enterPass1(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void enterPass2(String confirmPassword){
        driver.findElement(txt_passwordConfirmation).sendKeys(confirmPassword);
    }

    public void completeCreation(){
        driver.findElement(btn_CreateAnAccount2).click();
    }

    public void checkCreationIsCorrect(){
        boolean actualAnswer = driver.findElement(btn_correctCreation).isDisplayed();
        assertEquals(true, actualAnswer);
    }
}
