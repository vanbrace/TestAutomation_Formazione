package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchResult {

    private WebDriver driver;

    public GoogleSearchResult( WebDriver driver) {

        this.driver = driver;
    }

    public void clickTheInternetLink(String path) {
        driver.findElement(By.xpath("//h3[contains(text(),'The-internet (Heroku)')]")).click();
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        /*driver.click();
        } else {
            System.out.println("The first 'a' element does not have href=https://trenitalia.com");
        }*/
    }
}

