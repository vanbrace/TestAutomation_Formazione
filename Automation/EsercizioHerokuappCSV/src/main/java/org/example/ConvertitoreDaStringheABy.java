package org.example;

import org.openqa.selenium.By;

public class ConvertitoreDaStringheABy {

    protected static By convertStringToBy(String locatorType, String locatorValue) {
        //System.out.println("Locator Type: " + locatorType);
        //System.out.println("Locator Value: " + locatorValue);

        switch (locatorType) {
            case "xpath":
                //System.out.println("Creating By.xpath: " + locatorValue);
                return By.xpath(locatorValue);
            case "cssSelector":
                //System.out.println("Creating By.cssSelector: " + locatorValue);
                return By.cssSelector(locatorValue);
            case "id":
                //System.out.println("Creating By.id: " + locatorValue);
                return By.id(locatorValue);
            case "classname":
                //System.out.println("Creating By.className: " + locatorValue);
                return By.className(locatorValue);
            default:
                throw new IllegalArgumentException("Tipo di locator non supportato: " + locatorType);
        }
    }
}
