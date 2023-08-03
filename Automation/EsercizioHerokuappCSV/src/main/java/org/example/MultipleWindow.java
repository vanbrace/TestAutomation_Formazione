package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class MultipleWindow {
    private WebDriver driver;
    private By clickHere;

    public MultipleWindow(WebDriver driver, List<By> locatorDataList) {
        this.driver = driver;

        System.out.println("LocatorDataList size: " + locatorDataList.size());

        for (By locator : locatorDataList) {
            System.out.println("Checking locator: " + locator);
            if (locator.toString().contains("windows")) {
                clickHere = locator;
                break;
            }
        }

        if (clickHere == null) {
            throw new IllegalArgumentException("Locator for clickHere not found in the list.");
        }

        System.out.println("Using locator: " + clickHere);
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

    public void openNewWindow() {
        System.out.println("Clicco su clickHere");
        driver.findElement(clickHere).click();
    }
}
