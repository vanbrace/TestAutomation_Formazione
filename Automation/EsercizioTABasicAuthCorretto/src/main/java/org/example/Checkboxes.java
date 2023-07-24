package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkboxes {
    private WebDriver driver;
    private By spuntaCheckbox1 = By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]");
    private By spuntaCheckbox2 = By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[2]");

    public Checkboxes(WebDriver driver){
        this.driver = driver;
    }

    public void checkbox1(){
        driver.findElement(spuntaCheckbox1).click();
    }

    public void checkbox2(){
        driver.findElement(spuntaCheckbox2).click();
    }

}
