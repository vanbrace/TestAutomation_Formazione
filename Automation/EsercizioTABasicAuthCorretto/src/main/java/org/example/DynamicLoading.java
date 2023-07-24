package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {
    WebDriver driver;
    private By example1Link = By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]");

    public DynamicLoading(WebDriver driver){
        this.driver = driver;
    }

    public void example1(){
        driver.findElement(example1Link).click();
    }

}
