package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisappearingElements {
    private WebDriver driver;
    private By homeButton = By.xpath("//a[contains(text(),'Home')]");

    public DisappearingElements(WebDriver driver){
        this.driver = driver;
    }

    public void home(){
        driver.findElement(homeButton).click();
    }
}
