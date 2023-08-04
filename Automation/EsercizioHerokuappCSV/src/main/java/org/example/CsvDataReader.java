package org.example;

import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvDataReader {
    public static List<By> readLocatorData(String csvFilePath) throws IOException {
        List<By> locatorDataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                // Stampa i valori per debug
                System.out.println("Button Name: " + values[0]);
                System.out.println("Button Type: " + values[1]);
                System.out.println("Button Value: " + values[2]);

                if (values.length >= 3) { // Assicurati che ci siano almeno due elementi nella riga
                    String locatorName = values[0].trim();

                    String locatorType = values[1].trim();

                    String locatorValue = values[2].trim();


                    System.out.println(locatorName+"\t"+locatorType+"\t"+locatorValue);

                    ConvertitoreDaStringheABy convertitoreDaStringheABy = new ConvertitoreDaStringheABy();
                    By locator = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
                    locatorDataList.add(locator);

                    String stampaLocatorBy = locator.toString();
                    System.out.println("Locator: \n" + stampaLocatorBy);

                    String stampaLocatorDataListBy = locatorDataList.toString();
                    System.out.println("LocatorDataList: \n" + stampaLocatorDataListBy);

                }
            }
        }
        return locatorDataList;
    }
}






