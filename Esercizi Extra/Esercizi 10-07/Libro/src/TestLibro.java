import java.util.Scanner;

public class TestLibro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Libro default
        Libro libro1 = new Libro();
        System.out.println("Inserisci il titolo:");
        libro1.setTitolo(input.nextLine());
        System.out.println("Inserisci l'autore:");
        libro1.setAutore(input.nextLine());
        System.out.println("Inserisci il numero di pagine");
        libro1.setNumeroPagine(input.nextInt());
        input.nextLine(); // Utilizza la nuova riga rimanente dopo nextInt()
        System.out.println("Inserisci la versione libro (cartacea o digitale):");
        libro1.setVersione(input.nextLine());
        System.out.println("Inserisci il prezzo di lancio:");
        libro1.setPrezzoLancio(input.nextDouble());
        System.out.println("Inserisci il prezzo attuale:");
        libro1.setPrezzoAttuale(input.nextDouble());
        input.nextLine(); // Utilizza la nuova riga rimanente dopo nextDouble()

        // Libro parametrizzato
        System.out.println("Inserisci il titolo del secondo libro:");
        String titolo = input.nextLine();
        System.out.println("Inserisci l'autore del secondo libro:");
        String autore = input.nextLine();
        System.out.println("Inserisci il numero di pagine del secondo libro:");
        int numeroPagine = input.nextInt();
        input.nextLine(); // Utilizza la nuova riga rimanente dopo nextInt()
        System.out.println("Inserisci la versione del secondo libro (cartacea o digitale):");
        String versione = input.nextLine();
        System.out.println("Inserisci il prezzo di lancio del secondo libro:");
        double prezzoLancio = input.nextDouble();
        System.out.println("Inserisci il prezzo attuale del secondo libro:");
        double prezzoAttuale = input.nextDouble();
        input.nextLine(); // Utilizza la nuova riga rimanente dopo nextDouble()

        Libro libro2 = new Libro(titolo, autore, numeroPagine, versione, prezzoLancio, prezzoAttuale);

        // Stampa le informazioni dei due libri
        System.out.println("Informazioni del primo libro:");
        System.out.println(libro1.toString());
        System.out.println("Informazioni del secondo libro:");
        System.out.println(libro2.toString());

        // Trova il libro con il numero di pagine maggiore
        if (libro1.getNumeroPagine() > libro2.getNumeroPagine()) {
            System.out.println("Il libro con il numero di pagine maggiore è: " + libro1.getTitolo());
        } else if (libro2.getNumeroPagine() > libro1.getNumeroPagine()) {
            System.out.println("Il libro con il numero di pagine maggiore è: " + libro2.getTitolo());
        } else {
            System.out.println("I due libri hanno lo stesso numero di pagine.");
        }
    }
}