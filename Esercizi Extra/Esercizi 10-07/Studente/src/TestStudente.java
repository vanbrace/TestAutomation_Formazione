import java.util.Scanner;

public class TestStudente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Creazione primo oggetto usando il costruttore vuoto
            System.out.println("Nome:");
            String nome1 = scanner.nextLine();
            System.out.println("Anno di Nascita:");
            int annoDiNascita1 = scanner.nextInt();
            scanner.nextLine(); // Consuma la new line rimanente

            Studente studente1 = new Studente();
            studente1.setNome(nome1);
            studente1.setAnnoDiNascita(annoDiNascita1);

            // Creazione secondo oggetto usando il costruttore compilato
            System.out.println("Nome:");
            String nome2 = scanner.nextLine();
            System.out.println("Anno di Nascita:");
            int annoDiNascita2 = scanner.nextInt();
            scanner.nextLine();

            Studente studente2 = new Studente(nome2, annoDiNascita2);

            // Controllo età studenti
            if (studente1.getAnnoDiNascita() == studente2.getAnnoDiNascita()) {
                System.out.println("I due studenti sono coetanei.");
            } else if (studente1.getAnnoDiNascita() < studente2.getAnnoDiNascita()) {
                System.out.println(studente1.getNome() + " è nato prima di " + studente2.getNome() + ".");
            } else {
                System.out.println(studente2.getNome() + " è nato prima di " + studente1.getNome() + ".");
            }

            // Chiedi all'utente se vuole creare altri studenti
            System.out.println("Vuoi inserire altri studenti? (s/n)");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
    }
}