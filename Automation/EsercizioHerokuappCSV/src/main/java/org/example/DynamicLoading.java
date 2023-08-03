package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DynamicLoading {
    WebDriver driver;
    private By example1Link;

    public DynamicLoading(WebDriver driver, List<By> locatorDataList){
        this.driver = driver;
        for (By locator : locatorDataList) {
            System.out.println("Checking locator: " + locator);
            if (locator.toString().contains("Example 1")) {
                example1Link = locator;
                //example1Link.toString();
                break;
            }
        }

        if (example1Link == null) {
            throw new IllegalArgumentException("Locator for disappearing elements not found in the list.");
        }

        System.out.println("Using locator: " + example1Link);
    }

    private By convertStringToBy(String locatorType, String locatorValue) {
        switch (locatorType){
            case "xpath":
                return By.xpath(locatorValue);
            case "cssSelector":
                return By.cssSelector(locatorValue);
            case "id":
                return By.id(locatorValue);
            case "classname":
                return By.className(locatorValue);
            default:
                throw new IllegalArgumentException("Tipo di locator non supportato: " + locatorType);
        }
    }

    public void example1(){
        driver.findElement(example1Link).click();
    }

}

