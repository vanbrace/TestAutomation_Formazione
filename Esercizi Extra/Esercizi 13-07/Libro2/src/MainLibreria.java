import java.util.Scanner;

public class MainLibreria {
    public static void MainLibreria(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome della libreria: ");
        String nomeLibreria = scanner.nextLine();
        System.out.print("Inserisci l'indirizzo della libreria: ");
        String indirizzoLibreria = scanner.nextLine();
        System.out.print("Inserisci il numero di libri presenti nella libreria: ");
        int numLibri = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline residuo dopo nextInt()

        Libreria libreria = new Libreria(nomeLibreria, indirizzoLibreria, numLibri);

        System.out.println("\nLibreria:\n" + libreria);
        System.out.println("Prezzo medio dei libri: " + libreria.calcolaMediaPrezzo());
    }
}
