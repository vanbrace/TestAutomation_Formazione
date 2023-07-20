package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuappHomePage {
   private WebDriver driver;

    public HerokuappHomePage(WebDriver driver){
        this.driver = driver;

    }

    // "/login"
   public void search(String path){
        driver.findElement(By.cssSelector("a[href='" + path +"']")).click();
   }
}
