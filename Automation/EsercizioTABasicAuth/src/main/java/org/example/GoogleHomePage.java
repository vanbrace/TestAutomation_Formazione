package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {
    private WebDriver driver;



    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String keyword) {

        //WebDriverWait wait = new WebDriverWait(driver, 2);
        //accetta coockie è stato aggiunto perchè bisognava accettare la profilazione google
        driver.findElement(By.id("L2AGLb")).click();

        //operazioni di ricerca
        driver.findElement(By.name("q")).sendKeys(keyword);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        //WebElement elemento = driver.findElement(By.className("gNO89b"));
        //WebElement elemento = driver.findElement(By.xpath("//input[@class=\"gNO89b\"]"));


        //wait.until(ExpectedConditions.elementToBeClickable(elemento));

        //elemento.click();
    }
}

