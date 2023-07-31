package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContent {
    WebDriver driver;
    private By menuElementButtonLink = By.xpath("//a[contains(text(),'Example 1: Menu Element')]");
    private By homeButton = By.xpath("//a[contains(text(),'Home')]");

    public ShiftingContent(WebDriver driver){
        this.driver = driver;
    }

    public void menuElement(){
        driver.findElement(menuElementButtonLink).click();
        driver.findElement(homeButton).click();
    }
}
