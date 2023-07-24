package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicContent {
    private WebDriver driver;
    private By clickHereLink = By.xpath("//a[contains(text(),'click here')]");

    public DynamicContent(WebDriver driver){
        this.driver = driver;
    }

    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }
}
