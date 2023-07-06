import java.util.Scanner;

public class TestSmartphone {
    public static void main(String[] args) {

        // Creazione dell'oggetto smartphone1

        Smartphone smartphone1 = new Smartphone();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la marca del primo smartphone: ");
        String marcaSmartphone1 = scanner.nextLine();
        smartphone1.setMarca(marcaSmartphone1);

        System.out.print("Inserisci il modello del primo smartphone: ");
        String modelloSmartphone1 = scanner.nextLine();
        smartphone1.setModello(modelloSmartphone1);

        System.out.print("Inserisci il prezzo di lancio del primo smartphone: ");
        double prezzoDiLancioSmartphone1 = scanner.nextDouble();
        smartphone1.setPrezzoDiLancio(prezzoDiLancioSmartphone1);

        System.out.print("Inserisci il numero di pollici del primo smartphone: ");
        double numPolliciSmartphone1 = scanner.nextDouble();
        smartphone1.setNumPollici(numPolliciSmartphone1);

        System.out.print("Inserisci la RAM del primo smartphone (in GB): ");
        int ramSmartphone1 = scanner.nextInt();
        smartphone1.setRam(ramSmartphone1);

        System.out.print("Il primo smartphone ha il touch screen? (true/false): ");
        boolean touchScreenSmartphone1 = scanner.nextBoolean();
        smartphone1.setTouchScreen(touchScreenSmartphone1);

        scanner.nextLine(); // Consuma il new line rimasto nel buffer

        // Creazione dell'oggetto smartphone2
        System.out.print("\nInserisci la marca del secondo smartphone: ");
        String marcaSmartphone2 = scanner.nextLine();

        System.out.print("Inserisci il modello del secondo smartphone: ");
        String modelloSmartphone2 = scanner.nextLine();

        System.out.print("Inserisci il prezzo di lancio del secondo smartphone: ");
        double prezzoDiLancioSmartphone2 = scanner.nextDouble();

        System.out.print("Inserisci il numero di pollici del secondo smartphone: ");
        double numPolliciSmartphone2 = scanner.nextDouble();

        System.out.print("Inserisci la RAM del secondo smartphone (in GB): ");
        int ramSmartphone2 = scanner.nextInt();

        System.out.print("Il secondo smartphone ha il touch screen? (true/false): ");
        boolean touchScreenSmartphone2 = scanner.nextBoolean();

        scanner.close();

        Smartphone smartphone2 = new Smartphone(marcaSmartphone2, modelloSmartphone2, prezzoDiLancioSmartphone2,
                numPolliciSmartphone2, ramSmartphone2, touchScreenSmartphone2);

        // Dettagli degli smartphone
        System.out.println("\nDettagli del primo smartphone:");
        System.out.println(smartphone1);

        System.out.println("\nDettagli del secondo smartphone:");
        System.out.println(smartphone2);
    }
}