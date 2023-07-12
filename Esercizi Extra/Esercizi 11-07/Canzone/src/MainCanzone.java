import java.util.Scanner;

public class MainCanzone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di canzoni nella tua playlist: ");
        int numeroCanzoni = scanner.nextInt();

        // Dichiarazione e inizializzazione del vettore delle Canzoni
        Canzone[] playlist = new Canzone[numeroCanzoni];

        for (int i = 0; i < numeroCanzoni; i++) {
            System.out.println("\nInserisci i dettagli per la canzone " + (i + 1) + ":");

            System.out.print("Titolo: ");
            String titolo = scanner.next();

            System.out.print("Cantante: ");
            String cantante = scanner.next();

            System.out.print("Durata (in secondi): ");
            int durata = scanner.nextInt();

            // Creazione della Canzone e memorizzazione nel vettore
            playlist[i] = new Canzone(titolo, cantante, durata);
        }

        System.out.println("\nPlaylist:");

        // Stampa della playlist
        for (Canzone canzone : playlist) {
            System.out.println(canzone);
        }

        // Canzone più lunga
        Canzone canzonePiuLunga = playlist[0];
        for (int i = 1; i < numeroCanzoni; i++) {
            if (playlist[i].getDurata() > canzonePiuLunga.getDurata()) {
                canzonePiuLunga = playlist[i];
            }
        }
        System.out.println("\nCanzone più lunga: " + canzonePiuLunga.getTitolo());

        // Calcola la media della durata delle canzoni
        int durataTotale = 0;
        for (Canzone canzone : playlist) {
            durataTotale += canzone.getDurata();
        }
        double mediaDurata = durataTotale / (double) numeroCanzoni;
        System.out.println("Durata media delle canzoni: " + mediaDurata + " secondi");

        scanner.close();
    }
}