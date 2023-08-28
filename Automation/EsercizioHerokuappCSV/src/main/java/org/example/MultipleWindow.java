package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class MultipleWindow {
    private WebDriver driver;
    private By clickHere;

    public MultipleWindow(WebDriver driver, List<List<String>> locatorDataList) {
        this.driver = driver;

        for (List<String> locator : locatorDataList) {
            String locatorName = locator.get(0);
            String locatorType = locator.get(1);
            String locatorValue = locator.get(2);

            if (locatorName.contains("clickHere")) {
                clickHere = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            }

            if (clickHere == null) {
                throw new IllegalArgumentException("Locator for clickHere not found in the list.");
            }

            //System.out.println("Using locator: " + clickHere);
        }
    }

    public void openNewWindow() {
        //System.out.println("Clicco su clickHere");
        driver.findElement(clickHere).click();
    }
}
