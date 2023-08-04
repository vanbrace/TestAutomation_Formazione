package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DisappearingElements {
    private WebDriver driver;
    private By homeButton;

    public DisappearingElements(WebDriver driver, List<By> locatorDataList){
        this.driver = driver;

        for (By locator : locatorDataList) {
            System.out.println("Checking locator: " + locator);
            if (locator.toString().contains("Home")) {
                homeButton = locator;
                homeButton.toString();
                break;
            }
        }

        if (homeButton == null) {
            throw new IllegalArgumentException("Locator for disappearing elements not found in the list.");
        }

        System.out.println("Using locator: " + homeButton);
    }

    public void home(){
        driver.findElement(homeButton).click();
    }
}
