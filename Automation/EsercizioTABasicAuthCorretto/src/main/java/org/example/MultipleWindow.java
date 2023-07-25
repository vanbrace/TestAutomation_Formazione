package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindow {
    WebDriver driver;
    private By clickHere = By.cssSelector("a[href='/windows/new']");

    public MultipleWindow(WebDriver driver){
        this.driver = driver;
    }

    public void openNewWindow(){
        driver.findElement(clickHere).click();
    }
}
