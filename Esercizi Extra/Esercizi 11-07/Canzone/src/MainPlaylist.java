import java.util.Scanner;

public class MainPlaylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di canzoni nella tua playlist: ");
        int numeroCanzoni = scanner.nextInt();
        scanner.nextLine(); // Passa al rigo successivo


        Canzone[] playlistArray = new Canzone[numeroCanzoni];
        for (int i = 0; i < numeroCanzoni; i++) {
            System.out.println("\nInserisci i dettagli della canzone " + (i + 1) + ":");
            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();
            System.out.print("Cantante: ");
            String cantante = scanner.nextLine();
            System.out.print("Durata (in minuti): ");
            int durata = scanner.nextInt();
            scanner.nextLine();

            Canzone canzone = new Canzone(titolo, cantante, durata);
            playlistArray[i] = canzone;
        }

        Playlist playlist = new Playlist(playlistArray);

        boolean continua = true;
        while (continua) {
            System.out.println("\nMenu:");
            System.out.println("1. Modifica il titolo di una canzone");
            System.out.println("2. Modifica il cantante di una canzone");
            System.out.println("3. Modifica la durata di una canzone");
            System.out.println("4. Visualizza la playlist");
            System.out.println("5. Esci");

            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            switch (scelta) {
                case 1:
                    System.out.print("Inserisci la posizione della canzone da modificare: ");
                    int posizioneTitolo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci il nuovo titolo: ");
                    String nuovoTitolo = scanner.nextLine();
                    playlist.modificaTitolo(posizioneTitolo, nuovoTitolo);
                    break;
                case 2:
                    System.out.print("Inserisci la posizione della canzone da modificare: ");
                    int posizioneCantante = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci il nuovo cantante: ");
                    String nuovoCantante = scanner.nextLine();
                    playlist.modificaCantante(posizioneCantante, nuovoCantante);
                    break;
                case 3:
                    System.out.print("Inserisci la posizione della canzone da modificare: ");
                    int posizioneDurata = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci la nuova durata (in minuti): ");
                    int nuovaDurata = scanner.nextInt();
                    scanner.nextLine();
                    playlist.modificaDurata(posizioneDurata, nuovaDurata);
                    break;
                case 4:
                    System.out.println("\nPlaylist:\n" + playlist.toString());
                    break;
                case 5:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}