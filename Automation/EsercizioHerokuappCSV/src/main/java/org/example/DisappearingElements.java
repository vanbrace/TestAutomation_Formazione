package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DisappearingElements {
    private WebDriver driver;
    private By homeButton;

    public DisappearingElements(WebDriver driver, List<List<String >> locatorDataList){
        this.driver = driver;

        for (List<String> locator : locatorDataList) {
            String locatorName = locator.get(0);
            String locatorType = locator.get(1);
            String locatorValue = locator.get(2);

            if (locatorName.contains("homeButton")) {
                homeButton = ConvertitoreDaStringheABy.convertStringToBy(locatorType,locatorValue);
            }
        }

        if (homeButton == null) {
            throw new IllegalArgumentException("Locator for disappearing elements not found in the list.");
        }

        //System.out.println("Using locator: " + homeButton);
    }

    public void home(){
        driver.findElement(homeButton).click();
    }
}
