package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class EditAccount {
    protected WebDriver driver;
    private By btn_signIn = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]");
    private By txt_email1 = By.id("email");
    private By txt_password1 = By.id("pass");
    private By btn_login1 = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]/span[1]");
    private By btn_correctLogin1 = By.xpath("//header/div[1]/div[1]/ul[1]/li[1]/span[1]");
    String email;
    String password;
    private String urlMyAccount = "https://magento.softwaretestingboard.com/customer/account/";
    private String urlEdit = "https://magento.softwaretestingboard.com/customer/account/edit/";
    private By txt_name = By.xpath("//input[@id='firstname']");
    private By txt_surname = By.xpath("//input[@id='lastname']");
    private By btn_email = By.id("change-email");
    private By txt_password2 = By.id("current-password");
    private By btn_changePass = By.id("change-password");
    private By txt_email = By.xpath("//input[@id='email']");
    private By txt_passCambioMail = By.xpath("//input[@id='current-password']");
    private By txt_newPass = By.xpath("//input[@id='password']");
    private By txt_confirmPass = By.xpath("//input[@id='password-confirmation']");
    //private By btn_save = By.xpath("//span[contains(text(),'Save')]");
    private By btn_save = By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");
    private By btn_correctEdit = By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]");


    public EditAccount(WebDriver driver){
        this.driver = driver;
    }

    public void signInPage(){
        driver.findElement(btn_signIn).click();
    }

    public void loginUser(String email, String password) {
        driver.findElement(txt_email1).sendKeys(email);
        driver.findElement(txt_password1).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(btn_login1).click();
    }

    public void checkLoginIsCorrect() {
//        try {
//            driver.findElement(btn_correctLogin).isDisplayed();
//        } catch (NoSuchElementException e) {
//            System.out.println("LOGIN NON RIUSCITA");
//        }
        boolean actualAnswer = driver.findElement(btn_correctLogin1).isDisplayed();
        assertEquals(true, actualAnswer);
    }


    public void linkToEdit(){
        driver.navigate().to(urlMyAccount);
    }

    public void clickOnEdit(){
    driver.navigate().to(urlEdit);
    }

    public void changeInformation(String name, String surname, String newEmail, String actualPassword, String newPassword) throws InterruptedException {
        changeName(name);
        changeSurname(surname);
        changeEmail(newEmail, actualPassword, newPassword);
    }

    public void changeName(String name){
        driver.findElement(txt_name).clear();
        driver.findElement(txt_name).sendKeys(name);
    }

    public void changeSurname(String surname) throws InterruptedException {
        driver.findElement(txt_surname).clear();
        driver.findElement(txt_surname).sendKeys(surname);
        Thread.sleep(2000);
    }

    public void changeEmail(String newEmail, String actualPassword, String newPassword) throws InterruptedException {
        driver.findElement(btn_email).click();
        Thread.sleep(2000);
        driver.findElement(txt_email1).clear();
        driver.findElement(txt_email1).sendKeys(newEmail);
        Thread.sleep(2000);
        driver.findElement(txt_password2).sendKeys(actualPassword);
        Thread.sleep(2000);
        newPassword(newPassword);
    }

    public void newPassword(String newPassword) throws InterruptedException {
        driver.findElement(btn_changePass).click();
        Thread.sleep(2000);
        driver.findElement(txt_newPass).sendKeys(newPassword);
        driver.findElement(txt_confirmPass).sendKeys(newPassword);
        Thread.sleep(2000);
    }

    public void save(){
        driver.findElement(btn_save).click();
    }

    public void checkCreationIsCorrect() throws InterruptedException {
        boolean actualAnswer = driver.findElement(btn_correctEdit).isDisplayed();
        assertEquals(true, actualAnswer);
        Thread.sleep(2000);
    }
}
