package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DynamicContent {
    private WebDriver driver;
    private By clickHereLink;

    public DynamicContent(WebDriver driver, List<By>locatorDataList){
        this.driver = driver;

        for (By locator : locatorDataList) {
            System.out.println("----------Dynamic Content: " + locator);
            if (locator.toString().contains("click")) {
                clickHereLink = locator;
                clickHereLink.toString();
                break;
            }
        }

        if (clickHereLink == null) {
            throw new IllegalArgumentException("Locator for disappearing elements not found in the list.");
        }

        System.out.println("Using locator: " + clickHereLink);
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

    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }
}
