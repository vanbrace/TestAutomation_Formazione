package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ShiftingContent {
    WebDriver driver;
    private By menuElementButtonLink;
    private By homeButton;

    public ShiftingContent(WebDriver driver, List<List<String>> locatorDataList){
        this.driver = driver;
        for (List<String> locator : locatorDataList) {
            String locatorName = locator.get(0);
            String locatorType = locator.get(1);
            String locatorValue = locator.get(2);

            if (locatorName.contains("menuElementButtonLink")) {
                menuElementButtonLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("homeButton")) {
                homeButton = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            }
        }
    }

    public void menuElement(){
        driver.findElement(menuElementButtonLink).click();
        driver.findElement(homeButton).click();
    }
}
