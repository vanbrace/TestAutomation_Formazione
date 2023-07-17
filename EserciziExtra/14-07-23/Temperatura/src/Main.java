import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

            System.out.print("Inserire la latitudine del sensore 1");
            Scanner input1 = new Scanner(System.in);
            double lat1 = Double.parseDouble(input1.nextLine());

            System.out.print("Inserire la longitudine del sensore 1");
            Scanner input2 = new Scanner(System.in);
            double lon1 = Double.parseDouble(input2.nextLine());

            System.out.print("Inserire la temperatura rilevata al sensore 1");
            Scanner input3 = new Scanner(System.in);
            double temperatura1 = Double.parseDouble(input3.nextLine());

            SensoreTemperatura sensore1 = new SensoreTemperatura(lat1, lon1, temperatura1);

            System.out.print("Inserire la latitudine del sensore 2");
            Scanner input4 = new Scanner(System.in);
            double lat2 = Double.parseDouble(input4.nextLine());

            System.out.print("Inserire la longitudine del sensore 2");
            Scanner input5 = new Scanner(System.in);
            double lon2 = Double.parseDouble(input5.nextLine());

            System.out.print("Inserire la temperatura rilevata al sensore 2");
            Scanner input6 = new Scanner(System.in);
            double temperatura2 = Double.parseDouble(input6.nextLine());

            SensoreTemperatura sensore2 = new SensoreTemperatura(lat2, lon2, temperatura2);

            sensore1.calcolaDistanza(sensore2);
            sensore1.calcolaPuntoMedio(sensore2);

            System.out.println("Sensore 1: " + sensore1);
            System.out.println("Sensore 2: " + sensore2);
            System.out.println("I due sensori sono ad una distanza di: " + sensore1.calcolaDistanza(sensore2));
            System.out.println("Per i due sensori il punto medio è: " + sensore1.calcolaPuntoMedio(sensore2));
            if (sensore1.segnalaRischioIncendio(sensore2)) {
                System.out.println("Rischio incendio");
            } else
                System.out.println("Nessun rischio di incendio");
        }
    }
}