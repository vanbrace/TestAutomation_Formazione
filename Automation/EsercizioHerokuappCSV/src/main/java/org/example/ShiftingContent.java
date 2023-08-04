package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ShiftingContent {
    WebDriver driver;
    private By menuElementButtonLink;
    private By homeButton;

    public ShiftingContent(WebDriver driver, List<By> locatorDataList){
        this.driver = driver;
        for (By locator : locatorDataList) {
            if (locator.toString().contains("Example 1")) {
                menuElementButtonLink = locator;
            } else if (locator.toString().contains("Home")) {
                homeButton = locator;
            }
        }
    }

    private String getLocatorType(By locator) {
        String locatorString = locator.toString();
        return locatorString.split(":")[0].substring(3);
    }

    private String getLocatorValue(By locator) {
        String locatorString = locator.toString();
        return locatorString.split(":")[1].trim();
    }

    public void setButtonLocators(String buttonName, String buttonType, String buttonValue) {
        if (buttonName.contains("Example 1")) {
            menuElementButtonLink = ConvertitoreDaStringheABy.convertStringToBy(buttonType, buttonValue);
        } else if (buttonName.contains("Home")) {
            homeButton = ConvertitoreDaStringheABy.convertStringToBy(buttonType, buttonValue);
        }
    }


    public void menuElement(){
        driver.findElement(menuElementButtonLink).click();
        driver.findElement(homeButton).click();
    }
}
