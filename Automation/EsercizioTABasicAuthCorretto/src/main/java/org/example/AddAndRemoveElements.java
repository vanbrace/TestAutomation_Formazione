package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAndRemoveElements {
    private WebDriver driver;
    private int numberAdd;
    private int numberRemove;


    private By addButton = By.xpath("//button[contains(text(),'Add Element')]");
    private By removeButton = By.xpath("//button[contains(text(),'Delete')]");


    public AddAndRemoveElements(WebDriver driver){
        this.driver = driver;
        this.numberAdd = numberAdd;
        this.numberRemove = numberRemove;
    }

    public void addAndRemove(int numberAdd, int numberRemove){
        for(int i=0; i<numberAdd; i++){
        driver.findElement(addButton).click();
        }
        if(numberAdd >= numberRemove){
        for(int j=0; j<numberRemove; j++){
        driver.findElement(removeButton).click();
        }
        } else {
           System.out.println("Non è possibile rimuovere un numero di elemnti superiore a quelli aggiunti");
        }

    }

}
